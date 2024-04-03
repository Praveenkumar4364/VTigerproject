package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityorLibrary.SeleniumUtility;

public class CreateNewLeadPage extends SeleniumUtility {

	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement saluation;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSaluation() {
		return saluation;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebElement getLastname() {
		return lastname;
	}
	
	public WebElement getCompany() {
		return company;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * Create new lead with mandatory fields
	 * @param Lastname
	 */
    public void createnewleadOperation(String Lastname,String CompanyName)
    {
    	lastname.sendKeys(Lastname);
    	getCompany().sendKeys(CompanyName);
    	getSaveBtn().click();
    }
    /**
     * Create new lead with mandatory fields along with
     */
    public void createnewleadOperation(String Lastname,String CompanyName,String Firstname,String Saluation)
    {
    	handleDropdown(Saluation,saluation);
    	firstname.sendKeys(Firstname);
    	lastname.sendKeys(Lastname);
    	company.sendKeys(CompanyName);
    	saveBtn.click();
    }
}
