package createContact_package;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityorLibrary.Base_Class;
import objectRepository.ContactInfoPage;
import objectRepository.ContactPage;
import objectRepository.CreateNewContactPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
@Listeners(genericUtilityorLibrary.ListnersImplimentation.class)
public class CreateNewContactTest extends Base_Class{

	@Test(groups = {"SmokeSuite","RegressionSuite"})
	public void NewContactWithMandatoryFields() throws Exception
	{
		String LName=eUtil.getdataformexcel("Contacts",1,2);
		int Random=jUtil.getRandomnumber();
		String LastName=LName+Random;
		HomePage hp=new HomePage(driver);
		hp.clickContactOperation();
		
		ContactPage cp=new ContactPage(driver);
		cp.contactPageoperation();
		
		CreateNewContactPage ccp=new CreateNewContactPage(driver);
		ccp.createNewContactOperation(LastName);
		
		
		ContactInfoPage cip=new ContactInfoPage(driver);
		String CONTACTHEADER = cip.contactInfoOperation();
		Assert.assertTrue(CONTACTHEADER.contains(LastName));
		System.out.println(CONTACTHEADER);
	}
}
