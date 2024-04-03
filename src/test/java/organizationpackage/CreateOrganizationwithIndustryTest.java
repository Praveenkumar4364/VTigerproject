package organizationpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.CreateNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.OrganizationInfoPage;
import objectRepository.OrganizationPage;

public class CreateOrganizationwithIndustryTest extends Base_Class {
	@Test
	public void createOrganizationPage() throws Exception
	{
		String ORGNAME1= eUtil.getdataformexcel("Organization",6,2);
		String INDUSTRY=eUtil.getdataformexcel("Organization",6,3);
		int RANDOM=jUtil.getRandomnumber();
		String ORGNAME=ORGNAME1+RANDOM;
		//Home page class
		HomePage hp=new HomePage(driver);
		hp.clickonOrganization();
		//Thread.sleep(3000);
		//organization page class
		OrganizationPage op=new OrganizationPage(driver);
		op.operationonOrganizationPage();
		
		//Thread.sleep(3000);
		//create new organization page
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.operationOnNewOrganizationPage(ORGNAME, INDUSTRY);
		
		//organization info page(After Creating) validation
		OrganizationInfoPage orginfo=new OrganizationInfoPage(driver);
		String Info=orginfo.operationOnOrganizationPage();
		Assert.assertTrue(Info.contains(ORGNAME));
		System.out.println(Info);
	}
}
