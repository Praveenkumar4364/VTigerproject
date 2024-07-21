package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import genericUtilityorLibrary.Base_Class;

public class Create_Product_Page extends Base_Class{
@FindBy (xpath = "//input[@name='productname']")
private WebElement productName;

@FindBy (xpath = "//select[@name='productcategory']")
private WebElement productCategory;

@FindBy (xpath = "(//input[@title='Save [Alt+S]'])[1]")
private WebElement saveBtn;





@FindBy(xpath = "//input[@id='vendor_part_no']")
private WebElement vendorpartno;

@FindBy(xpath = "//input[@id='productsheet']")
private WebElement productSheet;

@FindBy(xpath = "//select[@name='glacct']")
private WebElement glAccount;

@FindBy(xpath = "//input[@id='productcode']")
private WebElement partnumber;

@FindBy(xpath = "//select[@name='manufacturer']")
private WebElement manufacture;

@FindBy(xpath = "//input[@name='mfr_part_no']")
private WebElement mfrpartno;

@FindBy(xpath = "//input[@name='serial_no']")
private WebElement serialno;
















public Create_Product_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getProductName() {
	return productName;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getProductCategory() {
	return productCategory;
}







public WebElement getVendorpartno() {
	return vendorpartno;
}



public WebElement getProductSheet() {
	return productSheet;
}



public WebElement getGlAccount() {
	return glAccount;
}



public WebElement getPartnumber() {
	return partnumber;
}



public WebElement getManufacture() {
	return manufacture;
}



public WebElement getMfrpartno() {
	return mfrpartno;
}



public WebElement getSerialno() {
	return serialno;
}


















public void operationOnCreateNewProductPage(String productname,String value)
{
	getProductName().sendKeys(productname);
	sUtil.handleDropdown(value, productCategory);
	saveBtn.click();
}



public void operationOnCreateNewProductPage(String ProductName,String value,String VendorNumber,String ProductSheet,
		String GLvalue,String Partnumber,String Manuvalue,String MfrPartNumber,String serialNumber)
{
	productName.sendKeys(ProductName);
	sUtil.handleDropdown(value, productCategory);
	vendorpartno.sendKeys(VendorNumber);
	productSheet.sendKeys(ProductSheet);
	sUtil.handleDropdown(glAccount, GLvalue);
	partnumber.sendKeys(Partnumber);
	sUtil.handleDropdown(Manuvalue, manufacture);
	mfrpartno.sendKeys(MfrPartNumber);
	serialno.sendKeys(serialNumber);
}
}
