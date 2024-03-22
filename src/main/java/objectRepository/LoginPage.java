package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Rule no 1
	
	//Rule no:2 Identification/Declaration
	@FindBy(name="user_name") 
	private WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath = "//input[@type='submit']")})
	private WebElement loginBtn;

	//Rule 3:create a constructure to initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Rule 4:Utilization
	
	public WebElement getUsernameEdt()
	{
		return usernameEdt;
		
	}
	
	public WebElement getPasswordEdt()
	{
		return passwordEdt;
		
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
		
	}
	//BusinessLibrary - Generic method-Operate elements on POM class only
	/**
	 * This method will perform login operation
	 * @param USERNAME
	 * @param PASSWORD
	 */
	public void loginOperation(String USERNAME,String PASSWORD)
	{
		getUsernameEdt().sendKeys(USERNAME);
		getPasswordEdt().sendKeys(PASSWORD);
		loginBtn.click();
	}
}
