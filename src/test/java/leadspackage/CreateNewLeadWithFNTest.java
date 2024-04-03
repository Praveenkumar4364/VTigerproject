package leadspackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadInfoPage;
import objectRepository.LeadPage;

public class CreateNewLeadWithFNTest extends Base_Class {
	@Test
public void createNewLeadWithFirstName() throws Exception
{
	String SALUATION=eUtil.getdataformexcel("Lead",6,5);
	String FIRSTNAME=eUtil.getdataformexcel("Lead",6,4);
	String LASTNAME1=eUtil.getdataformexcel("Lead",6,2);
	String COMPANYNAME=eUtil.getdataformexcel("Lead",6,3);
	int RANDOM=jUtil.getRandomnumber();
	
	//String FIRSTNAME=FIRSTNAME1+RANDOM;
	String LASTNAME=LASTNAME1+RANDOM;
	
	HomePage hp=new HomePage(driver);
	hp.clickLeads();
	
	LeadPage lp=new LeadPage(driver);
	lp.clickonleadOperation();
	
	CreateNewLeadPage cnl=new CreateNewLeadPage(driver);
	cnl.createnewleadOperation(LASTNAME, COMPANYNAME, FIRSTNAME, SALUATION);
	
	LeadInfoPage lip=new LeadInfoPage(driver);
	String LEADINFO= lip.leadInfoOperation();
	Assert.assertTrue(LEADINFO.contains(LASTNAME));
	System.out.println(LEADINFO);
}
}
