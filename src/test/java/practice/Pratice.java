package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilityorLibrary.SeleniumUtility;

public class Pratice {
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	SeleniumUtility sel=new SeleniumUtility();
	sel.addImplicitilyWait(driver);
	sel.maximizeWindow(driver);
	sel.scrollDownAction(driver);
	sel.scrollDownAction(driver);
	sel.scrollUpActions(driver);
	
}
}
