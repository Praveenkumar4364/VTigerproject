package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_Info_Page {
@FindBy(xpath = "//span[@class='dvHeaderText']")
private WebElement documentInfo;

public Document_Info_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getDocumentInfo() {
	return documentInfo;
}

public String documentInfoOperation()
{
	String Info=documentInfo.getText();
	return Info;
}
}
