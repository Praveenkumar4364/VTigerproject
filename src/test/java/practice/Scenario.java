package practice;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import genericUtilityorLibrary.ExcelUtility;
import genericUtilityorLibrary.PropertiesUtility;
import objectRepository.ContactInfoPage;
import objectRepository.ContactPage;
import objectRepository.CreateNewContactPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class Scenario {
public static void main(String args[]) throws Exception
{
	//Read data from Property file
	
	
//	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
//	Properties poj=new Properties();
//	poj.load(fis);
//	String UN=poj.getProperty("username");
//	String PW=poj.getProperty("password");
//	String URL=poj.getProperty("url");
	
	PropertiesUtility PUTIL=new PropertiesUtility();
	String UN=PUTIL.getdatafrompropertis("username");
	String PW=PUTIL.getdatafrompropertis("password");
	String URL=PUTIL.getdatafrompropertis("url");
	System.out.println(UN);
	
	//Read Test data from Excel file
	
	
//	FileInputStream fs=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
//	Workbook book = WorkbookFactory.create(fs);
//	Sheet sh = book.getSheet("Contacts");
//	Row r = sh.getRow(1);
//	Cell c = r.getCell(2);
//	String d=c.getStringCellValue();
//	System.out.println(d);
	
	ExcelUtility EUTIL=new ExcelUtility();
	String d=EUTIL.getdataformexcel("Contacts",1,2);
	
	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get(URL);
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
//	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PW);
//	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
//	
//	driver.findElement(By.linkText("//a[@href='index.php?module=Contacts&action=index']")).click();
//	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
	
//	driver.findElement(By.name("user_name")).sendKeys(UN);
//	driver.findElement(By.name("user_password")).sendKeys(PW);
//	driver.findElement(By.id("submitButton")).click();
	
	LoginPage lp=new LoginPage(driver);
	lp.loginOperation(UN, PW);
	
	
	
	
	
//	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	HomePage hp=new HomePage(driver);
	hp.clickContactOperation();
	
	
	
//	driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	ContactPage cp=new ContactPage(driver);
	cp.contactPageoperation();
	
	
//	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
//	
//	Alert alt= driver.switchTo().alert();
//	alt.accept();
//	
//	
//	driver.findElement(By.name("lastname")).sendKeys(d);
//	
//	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	CreateNewContactPage ccp=new CreateNewContactPage(driver);
	ccp.createNewContactOperation(d);
	
//	String ContactHeader=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	ContactInfoPage ci=new ContactInfoPage(driver);
    String ContactHeader=ci.contactInfoOperation();
    Assert.assertTrue(ContactHeader.contains(d));
    System.out.println(ContactHeader);
//	if(ContactHeader.contains(d))
//	{
//		System.out.println(ContactHeader);
//		System.out.println("PASS");
//	}
//	
//	else
//	{
//		System.out.println("FAIL");
//	}
//	
//	Actions act=new Actions(driver);
//	WebElement element= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//	act.moveToElement(element).perform();
//	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	hp.logoutApp(driver);
	
	driver.quit();
}
}
