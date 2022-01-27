package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(databasereplication.actions.AbortRunningMapping.class);
    registrator.registerUserAction(databasereplication.actions.CreateZipFile.class);
    registrator.registerUserAction(databasereplication.actions.EncryptServerPassword.class);
    registrator.registerUserAction(databasereplication.actions.ImportActivitySet.class);
    registrator.registerUserAction(databasereplication.actions.ImportByImportCall.class);
    registrator.registerUserAction(databasereplication.actions.ImportByMapping.class);
    registrator.registerUserAction(databasereplication.actions.SyncDatabaseInfo.class);
    registrator.registerUserAction(databasereplication.actions.UpdateByMapping.class);
    registrator.registerUserAction(databasereplication.actions.UpdateByMapping_UsingUpdateSet.class);
    registrator.registerUserAction(databasereplication.actions.UpdateToken.class);
    registrator.registerUserAction(easyexcelimporter.actions.StartImportByTemplate.class);
    registrator.registerUserAction(excelimporter.actions.GetHeaderInformationFromExcelFile.class);
    registrator.registerUserAction(excelimporter.actions.RefreshClass.class);
    registrator.registerUserAction(excelimporter.actions.StartImportByTemplate.class);
    registrator.registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
    registrator.registerUserAction(mxmodelreflection.actions.SyncObjects.class);
    registrator.registerUserAction(mxmodelreflection.actions.TestThePattern.class);
    registrator.registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
    registrator.registerUserAction(xlsreport.actions.GenerateExcelDoc.class);
  }
}
