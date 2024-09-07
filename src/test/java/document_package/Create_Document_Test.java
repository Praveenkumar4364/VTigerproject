package document_package;

import org.testng.annotations.Test;


import genericUtilityorLibrary.Base_Class;
import objectRepository.Create_New_Document_Page;
import objectRepository.Document_Info_Page;
import objectRepository.Document_Page;
import objectRepository.HomePage;

public class Create_Document_Test extends Base_Class{
	@Test(groups = {"SmokeSuite","RegressionSuite"})
public void createDocument() throws Exception
{
		HomePage hp=new HomePage(driver);
	hp.clickonDocuments();
	
	Document_Page dp=new Document_Page(driver);
	dp.documentpageOperation();
	int RANDOM=jUtil.getRandomnumber();
	String TITLE1=eUtil.getdataformexcel("Document",1,1);
	String TITLE=TITLE1+RANDOM;
	String ASSIGNEDD=eUtil.getdataformexcel("Document",1,2);
	Create_New_Document_Page cdp=new Create_New_Document_Page(driver);
	cdp.createDocumentOperation(TITLE,ASSIGNEDD);
	
	Document_Info_Page dip=new Document_Info_Page(driver);
	String INFO=dip.documentInfoOperation();
	System.out.println(INFO);
}
}