package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityorLibrary.SeleniumUtility;

public class CreateNewContactPage extends SeleniumUtility{

	@FindBy(name = "lastname")
	 private WebElement lastName;
	
	@FindBy(name = "leadsource")
	private WebElement leadSource;
	
	 @FindBy(xpath = "(//input[@type='submit'])[1]")
	 private WebElement saveBtn;
	 
	 
	 public CreateNewContactPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public WebElement getLastName()
	 {
		return lastName; 
	 }
	 public WebElement getLeadsource()
	 {
		return leadSource;
		 
	 }
	 public WebElement getSaveBtn()
	 {
		return saveBtn;
	 }
	 /**
	  * This is a generic method to create new contact
	  * @param LastName
	  */
	 public void createNewContactOperation(String LastName)
	 {
		 getLastName().sendKeys(LastName);
		 getSaveBtn().click();
	 }
	 /**
	  * This is a generic method to create contact with lastname,leadsource
	  * @param LastName
	  * @param Leadsource
	  */
	 public void createNewContactOperation(String LastName,String Leadsource)
	 {
		 getLastName().sendKeys(LastName);
		 handleDropdown(leadSource, Leadsource);
		 getSaveBtn().click();
	 }
}
