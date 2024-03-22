package createContact_package;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.ContactInfoPage;
import objectRepository.ContactPage;
import objectRepository.CreateNewContactPage;
import objectRepository.HomePage;
@Listeners(genericUtilityorLibrary.ListnersImplimentation.class)
public class CreateNewContactWithLeadSourceTest extends Base_Class{
	@Test(groups = "RegressionSuite")
	public void NewContactWithMandatoryFields() throws Exception
	{
		String LName=eUtil.getdataformexcel("Contacts",6,2);
		String LEAD = eUtil.getdataformexcel("Contacts",6,3);
		int Random=jUtil.getRandomnumber();
		String LastName=LName+Random;
		HomePage hp=new HomePage(driver);
		hp.clickContactOperation();
		
		ContactPage cp=new ContactPage(driver);
		cp.contactPageoperation();
		
		CreateNewContactPage ccp=new CreateNewContactPage(driver);
		ccp.createNewContactOperation(LastName,LEAD);
		
		ContactInfoPage cip=new ContactInfoPage(driver);
		String CONTACTHEADER = cip.contactInfoOperation();
		Assert.assertTrue(CONTACTHEADER.contains(LastName));
		System.out.println(CONTACTHEADER);
	}
}
