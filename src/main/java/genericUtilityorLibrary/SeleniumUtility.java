package genericUtilityorLibrary;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This Class consists of reusable methods related to selenium tool
 * @author praveen
 *
 */
public class SeleniumUtility {
	/**
	 * This method will maximize the window
	 * @param driver
	 */
public void maximizeWindow(WebDriver driver)
{
	driver.manage().window().maximize();
}
/**
 * This method will minimize the window
 * @param driver
 */
public void minimizeWindow(WebDriver driver)
{
	driver.manage().window().minimize();
}
/**
 * This method will launch the browser in full screen mode
 * @param driver
 */
public void fullScreenWindow(WebDriver driver)
{
	driver.manage().window().fullscreen();
}
/**
 * This method will use to slow down the selenium tool speed
 * @param driver
 */
public void addImplicitilyWait(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
/**
 * This method will wait for 10 seconds for a particular web element to become visible
 * @param driver
 * @param element
 */
public void waitForElementToBeVisible(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * This method will wait for 10 seconds for a particular web element to become clickable
 * @param driver
 * @param element
 */
public void  waitForElementToBeClickable(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));	
}
/**
 * This method will wait for 10 seconds for a particular web element to become switch to frame by index
 * @param driver
 * @param element
 */
public void waitForElementToBeAvailableAndSwitchToIt(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
}
/**
 * This method will handle Drop down by index
 * @param element
 * @param index
 */
public void handleDropdown(WebElement element,int index)
{
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
/**
 * This method will handle Drop down by visible text
 * @param element
 * @param visibleText
 */
public void handleDropdown(WebElement element,String visibleText)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(visibleText);
}
/**
 * This method will handle Drop down by value
 * @param value
 * @param element
 */
public void handleDropdown(String value,WebElement element)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
/**
 * This method will perform mouse Hovering action on a web element
 * @param driver
 * @param element
 */
public void mouseOverAction(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
/**
 * This method will perform right click action on a web element
 * @param driver
 * @param element
 */
public void rightclickAction(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}
/**
 * This method will perform double click action on a web element
 * @param driver
 * @param element
 */
public void doubleClickAction(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}
/**
 * This method will perform DragAndDrop action on a web element
 * @param driver
 * @param srcEle
 * @param destEle
 */
public void dragAndDropAction(WebDriver driver,WebElement srcEle,WebElement destEle)
{
	Actions act=new Actions(driver);
	act.dragAndDrop(srcEle, destEle).perform();
}
/**
 * This method will perform DragAndDropBy action on a web element
 * @param driver
 * @param element
 * @param xoffset
 * @param yoffset
 */
public void dragAndDropByAction(WebDriver driver,WebElement element,int xoffset,int yoffset)
{
	Actions act=new Actions(driver);
	act.dragAndDropBy(element, xoffset, yoffset).perform();
}
/**
 * This method will scroll down for 500 units
 * @param driver
 */
public void scrollDownAction(WebDriver driver)
{
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,500);");
}
/**
 * This method will scroll up for 500 units
 * @param driver
 */
public void scrollUpActions(WebDriver driver)
{
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,-500);");
}
/**
 * This method will use to move the cursor to child frame by ID
 * @param driver
 * @param index
 */
public void moveToChildFrame(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
/**
 * This method will use to move the cursor to child frame by Name
 * @param driver
 * @param frameNameID
 */
public void moveToChildFrame(WebDriver driver,String frameNameID)
{
	driver.switchTo().frame(frameNameID);
}
/**
 * This method will use to move the cursor to child frame by frame element
 * @param driver
 * @param frameElement
 */
public void moveToChildFrame(WebDriver driver,WebElement frameElement)
{
	driver.switchTo().frame(frameElement);
}
/**
 * This method will use to move the cursor to parent frame
 * @param driver
 */
public void moveToParentFrame(WebDriver driver)
{
	driver.switchTo().defaultContent();
}
/**
 * This method will use to accept the alert pop up
 * @param driver
 */
public void acceptAlert(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.accept();
}
/**
 * This method will use to cancel the alert pop up
 * @param driver
 */
public void dismissAlert(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
}
/**
 * This method will use to fetch the text of alert pop up
 * @param driver
 * @return
 */
public String getAlertMessage(WebDriver driver)
{
	String altMessage=driver.switchTo().alert().getText();
	return altMessage;
}
/**
 * This method will capture the screenshot and return the path to caller
 * @param driver
 * @param screenShotname
 * @return
 * @throws Exception
 */
public String captureScreenShot(WebDriver driver,String screenShotname) throws Exception
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\ScreenShots\\"+screenShotname+".png");
	Files.copy(src, dest);
	
	return dest.getAbsolutePath();
}

}
