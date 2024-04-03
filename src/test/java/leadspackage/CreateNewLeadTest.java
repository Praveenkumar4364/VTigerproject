package leadspackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadInfoPage;
import objectRepository.LeadPage;

public class CreateNewLeadTest extends Base_Class {
	@Test
public void createnewLeadwithMandatoryfields() throws Exception
{
	String LASTNAME1= eUtil.getdataformexcel("Lead",2,2);
	String COMPANYNAME=eUtil.getdataformexcel("Lead",2,3);
	int RANDOM=jUtil.getRandomnumber();
	String LASTNAME=LASTNAME1+RANDOM;
	//Home page 
	HomePage hp=new HomePage(driver);
	hp.clickLeads();
	//lead page
	LeadPage lp=new LeadPage(driver);
	lp.clickonleadOperation();
	//New lead page
	CreateNewLeadPage clp=new CreateNewLeadPage(driver);
	clp.createnewleadOperation(LASTNAME, COMPANYNAME);
	
	//lead info page
	LeadInfoPage lip=new LeadInfoPage(driver);
	String INFO=lip.leadInfoOperation();
	Assert.assertTrue(INFO.contains(LASTNAME));
	System.out.println(INFO);
}
}
