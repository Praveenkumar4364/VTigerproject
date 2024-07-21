package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Info_Page {
@FindBy(xpath = "//span[@class='lvtHeaderText']")
private WebElement info;

public Product_Info_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement Info()
{
	return info;
}

public String productInfoPageOperation()
{
	String ProductInfo= info.getText();
	return ProductInfo;
}
}
