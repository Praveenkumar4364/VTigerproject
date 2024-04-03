package leadspackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadInfoPage;
import objectRepository.LeadPage;

public class CreateNewLeadWithNonMandatoryFieldsTest extends Base_Class {
	@Test
public void createNewLeadWithNon_MandatoryFields() throws Exception
{
	String SALUATION=eUtil.getdataformexcel("Lead", 10, 5);
	String FIRSTNAME=eUtil.getdataformexcel("Lead", 10, 4);
	String LASTNAME1=eUtil.getdataformexcel("Lead", 10, 2);
	String COMPANYNAME=eUtil.getdataformexcel("Lead", 10, 3);
	String TITLE=eUtil.getdataformexcel("Lead", 10, 6);
	String LEADSOURCE=eUtil.getdataformexcel("Lead", 10, 7);
	String INDUSTRY=eUtil.getdataformexcel("Lead", 10, 8);
	String ANNUALREVENUE=eUtil.getdataformexcel("Lead", 10, 9);
	
	int RANDOM=jUtil.getRandomnumber();
	String LASTNAME=LASTNAME1+RANDOM;
	
	HomePage hp=new HomePage(driver);
	hp.clickLeads();
	
	LeadPage lp=new LeadPage(driver);
	lp.clickonleadOperation();
	
	CreateNewLeadPage cnl=new CreateNewLeadPage(driver);
	cnl.createnewleadOperation(LASTNAME, COMPANYNAME, FIRSTNAME, SALUATION, TITLE, LEADSOURCE, INDUSTRY, ANNUALREVENUE);
	
	LeadInfoPage lip=new LeadInfoPage(driver);
	String INFO=lip.leadInfoOperation();
	Assert.assertTrue(INFO.contains(LASTNAME));
	System.out.println(INFO);
}
}
