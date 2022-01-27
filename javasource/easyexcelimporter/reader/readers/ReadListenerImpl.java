package easyexcelimporter.reader.readers;

import java.util.ArrayList;
import java.util.Map;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import org.apache.commons.compress.utils.Lists;

import excelimporter.reader.readers.ExcelRowProcessor.ExcelCellData;
import excelimporter.reader.readers.ExcelRowProcessor;
import replication.ReplicationSettings.MendixReplicationException;

public class ReadListenerImpl implements ReadListener {
  private ExcelRowProcessor excelRowProcessor;
  private int sheetIndex;

  public ReadListenerImpl(ExcelRowProcessor excelRowProcessor, int sheetIndex) {
    super();
    this.excelRowProcessor = excelRowProcessor;
    this.sheetIndex = sheetIndex;
  }

  @Override
  public void doAfterAllAnalysed(AnalysisContext context) {
    // TODO Auto-generated method stub
    System.out.println("doaf");
  }

  @Override
  public void invoke(Object arg0, AnalysisContext context) {
    Map<Integer, Object> cellsMap = (Map<Integer, Object>) arg0;
    ArrayList<ExcelRowProcessor.ExcelCellData> valueList = Lists.newArrayList();
    cellsMap.entrySet().forEach(e -> {
      valueList.add(new ExcelRowProcessor.ExcelCellData(e.getKey(), "", e.getValue()));
    });
    Integer rowIndex = context.readRowHolder().getRowIndex();
    try {
      this.excelRowProcessor.processValues(
          valueList.toArray(new ExcelCellData[0]), rowIndex,
          sheetIndex);
      this.excelRowProcessor.finish();
    } catch (MendixReplicationException e) {
      System.out.println("Unable to store Excel row #" + rowIndex + " @Sheet #" + String.valueOf(sheetIndex));
    }
  }

}
