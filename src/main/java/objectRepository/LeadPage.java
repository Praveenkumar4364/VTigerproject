package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
@FindBy(xpath = "//img[@title='Create Lead...']")
private WebElement clicknewlead;

public LeadPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getClicknewlead() {
	return clicknewlead;
}
/**
 * This is generic method for lead Page
 */
public void clickonleadOperation()
{
	getClicknewlead().click();
}
}
