package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
@FindBy (xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement CreateNewProduct;
public Product_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement getCreateNewProduct() {
	return CreateNewProduct;
}
public void operationOnProductPage()
{
	CreateNewProduct.click();
}
}
