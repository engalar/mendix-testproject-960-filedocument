// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package easyexcelimporter.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the EasyExcelImporter module
	/**
	 * Example how you can implement your own excel import file
	 * 
	 * Retrieve a template, this can be  from an association or by the use of a constant or some application settings. How exactly the template is retrieved does not really matter. 
	 * 
	 * Next, if the template is found the import java action should be executed. This java action has three parameters. The first parameter is the retrieved template, the second parameter is the excel file. The third parameter is an optional parameter this parameter can contain an object in case you want to set the reference from all imported objects to the object from the parameter.
	 * 
	 */
	public static void iVK_ImportTemplateDocument(IContext context, excelimporter.proxies.TemplateDocument _templateDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TemplateDocument", _templateDocument == null ? null : _templateDocument.getMendixObject());
		Core.microflowCall("EasyExcelImporter.IVK_ImportTemplateDocument").withParams(params).execute(context);
	}
}