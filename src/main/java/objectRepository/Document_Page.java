package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_Page {
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement createDocument;

public Document_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getCreateDocument() {
	return createDocument;
}

public void documentpageOperation()
{
	getCreateDocument().click();
}
}
