package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInfoPage {
@FindBy(xpath = "//span[@class='dvHeaderText']")
private WebElement LeadInfo;


public LeadInfoPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement getLeadInfo() {
	return LeadInfo;
}
/**
 * This is generic method for leadInfopage
 * @return
 */
public String leadInfoOperation()
{
	return getLeadInfo().getText();
}
}
