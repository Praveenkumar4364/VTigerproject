package organizationpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.CreateNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrganizationInfoPage;
import objectRepository.OrganizationPage;

public class CreateOrganizationTest extends Base_Class {
@Test
public void createOrganizationPage() throws Exception
{
	String ORGNAME1= eUtil.getdataformexcel("Organization",2,2);
	int RANDOM=jUtil.getRandomnumber();
	String ORGNAME=ORGNAME1+RANDOM;
	HomePage hp=new HomePage(driver);
	hp.clickonOrganization();
	//Thread.sleep(3000);
	
	OrganizationPage op=new OrganizationPage(driver);
	op.operationonOrganizationPage();
	
	//Thread.sleep(3000);
	CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
	cnop.operationOnNewOrganizationPage(ORGNAME);
	
	OrganizationInfoPage orginfo=new OrganizationInfoPage(driver);
	String Info=orginfo.operationOnOrganizationPage();
	Assert.assertTrue(Info.contains(ORGNAME));
	System.out.println(Info);
}
}
