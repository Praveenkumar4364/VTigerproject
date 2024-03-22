package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactInfo;
	
	public ContactInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getContactInfo()
	{
		return contactInfo;
		
	}
	
	public String contactInfoOperation()
	{
	  return getContactInfo().getText();
	}
	
}
