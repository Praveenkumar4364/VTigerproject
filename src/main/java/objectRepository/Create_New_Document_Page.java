package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityorLibrary.SeleniumUtility;



public class Create_New_Document_Page extends SeleniumUtility{
@FindBy(xpath = "//input[@name='notes_title']")
private WebElement title;

@FindBy (xpath = "(//input[@name='assigntype'])[2]")
private WebElement assignedtoRadio;

@FindBy(xpath = "//select[@name='assigned_group_id']")
private WebElement assignedtodropdown;

@FindBy(xpath = "//iframe[contains(@title,'Rich')]")
private WebElement desc;

@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
private WebElement savebtn;

public Create_New_Document_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getTitle() {
	return title;
}

public WebElement getAssignedtoRadio() {
	return assignedtoRadio;
}

public WebElement getAssignedtodropdown() {
	return assignedtodropdown;
}

public WebElement getDesc() {
	return desc;
}

public WebElement getSavebtn() {
	return savebtn;
}

public void createDocumentOperation(String Title,String AssignedDropdown)
{
	title.sendKeys(Title);
	assignedtoRadio.click();
	assignedtodropdown.sendKeys(AssignedDropdown);
	//handleDropDown(assignedtoRadio, AssignedDropdown);
	savebtn.click();
}

public void createDocumentOperation(String Title,String AssignedDropdown,String Desc)
{
	title.sendKeys(Title);
	assignedtoRadio.click();
	assignedtodropdown.sendKeys(AssignedDropdown);
	desc.sendKeys(Desc);
	savebtn.click();
}
}
