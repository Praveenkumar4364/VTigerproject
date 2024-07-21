package document_package;

import org.testng.annotations.Test;


import genericUtilityorLibrary.Base_Class;
import objectRepository.Create_New_Document_Page;
import objectRepository.Document_Info_Page;
import objectRepository.Document_Page;
import objectRepository.HomePage;

public class Create_Document_With_Description_Test extends Base_Class {
	@Test
public void createdocumentwithDescription() throws Exception
{
	HomePage hp=new HomePage(driver);
	hp.clickonDocuments();
	
	Document_Page dp=new Document_Page(driver);
	dp.documentpageOperation();
	
	int Random=jUtil.getRandomnumber();
	String T1=eUtil.getdataformexcel("Document",5,1);
	String TITLE=T1+Random;
	String ASSIGNED=eUtil.getdataformexcel("Document",5,2);
	String DESCRIPTION=eUtil.getdataformexcel("Document",5,3);
	
	Create_New_Document_Page cndp=new Create_New_Document_Page(driver);
	cndp.createDocumentOperation(TITLE, ASSIGNED, DESCRIPTION);
	
	Document_Info_Page dip=new Document_Info_Page(driver);
	String INFO=dip.documentInfoOperation();
	System.out.println(INFO);
}
}
