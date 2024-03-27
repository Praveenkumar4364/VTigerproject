package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityorLibrary.SeleniumUtility;

public class HomePage {

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement clickContact;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement imglogOut;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement logoutBtd;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organization;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 public WebElement getClickContact()
	 {
		return clickContact;
	 }
	 public WebElement getOrganization() 
	 {
			return organization;
	 }
	 public WebElement getImglogOut()
	 {
		return imglogOut;
		 
	 }
	 public WebElement getLogoutBtd()
	 {
		return logoutBtd;
		 
	 }
	 /**
	  * This is generic method for home page
	  */
	 public void clickContactOperation()
	 {
		 getClickContact().click();
	 }
	 /**
	  * This is generic method for clicking of organization
	  */
	 public void clickonOrganization()
	 {
		 getOrganization().click();
	 }
	 /**
	  * This is a generic method for logout operation
	  * @param driver
	  */
	 public void logoutApp(WebDriver driver)
	 {
		 SeleniumUtility sUtil=new SeleniumUtility();
		 sUtil.mouseOverAction(driver,imglogOut);
		 getLogoutBtd().click();
		 
	 }
}
