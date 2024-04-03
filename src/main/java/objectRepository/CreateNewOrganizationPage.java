package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityorLibrary.SeleniumUtility;

public class CreateNewOrganizationPage extends SeleniumUtility {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationname;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebt;
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industry;
	
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getOrganizationName()
	{
		return organizationname;
	}
	public WebElement getSaveBt()
	{
		return savebt;
	}
	/**
	 * This is the generic method for createneworganization page
	 */
	public void operationOnNewOrganizationPage(String organizationName)
	{
		getOrganizationName().sendKeys(organizationName);
		getSaveBt().click();
	}
	/**
	 * This is generic method for createneworganization with name and industry
	 * @param organizationName
	 * @param Industry
	 */
	public void operationOnNewOrganizationPage(String organizationName,String Industry)
	{
		getOrganizationName().sendKeys(organizationName);
		handleDropdown(industry, Industry);
		getSaveBt().click();
	}
}
