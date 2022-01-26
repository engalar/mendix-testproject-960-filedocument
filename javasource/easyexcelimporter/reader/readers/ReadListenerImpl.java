package easyexcelimporter.reader.readers;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

public class ReadListenerImpl implements ReadListener {
  private ExcelRowProcessor excelRowProcessor;

  public ReadListenerImpl(ExcelRowProcessor excelRowProcessor) {
    super();
    this.excelRowProcessor = excelRowProcessor;
  }

  @Override
  public void doAfterAllAnalysed(AnalysisContext arg0) {
    // TODO Auto-generated method stub
    System.out.println("doaf");
  }

  @Override
  public void invoke(Object arg0, AnalysisContext arg1) {
    // TODO Auto-generated method stub

    System.out.println("invoke");
  }

}
