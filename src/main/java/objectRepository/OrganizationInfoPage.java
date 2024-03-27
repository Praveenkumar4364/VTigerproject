package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement organizationInfo;

	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getOrganizationInfo() {
		return organizationInfo;
	}
	/**
	 * This is the generic method for Organization info page
	 */
	public String operationOnOrganizationPage()
	{
		return getOrganizationInfo().getText();
	}
}
