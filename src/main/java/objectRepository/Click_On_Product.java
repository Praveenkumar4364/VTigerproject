package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_On_Product {
@FindBy (xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement clicknewproduct;

public Click_On_Product(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

public WebElement getClicknewproduct() {
	return clicknewproduct;
}

public void clickonnewproductoperation()
{
	clicknewproduct.click();
}

}
