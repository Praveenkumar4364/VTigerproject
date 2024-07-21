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
	
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement lead;
	
	@FindBy (xpath = "//a[text()='Products']")
	private WebElement product;
	
	@FindBy (xpath = "(//a[text()='Documents'])[1]")
	private WebElement documents;
	
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
	 public WebElement getLead() {
			return lead;
		}
	 public WebElement getImglogOut()
	 {
		return imglogOut;
		 
	 }
	 public WebElement getLogoutBtd()
	 {
		return logoutBtd;
		 
	 }
	 public WebElement getProduct() {
			return product;
		}
		public WebElement getDocuments() {
			return documents;
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
	  * This is generic method for click on leads
	  */
	 public void clickLeads()
	 {
		 getLead().click();
	 }
	 /**
	  * This is generic method for click on product
	  */
	 public void clickonProduct()
	 {
	 	product.click();
	 }
	 /**
	  * This is generic method for click on Document
	  */
	 public void clickonDocuments()
	 {
	 	documents.click();
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
