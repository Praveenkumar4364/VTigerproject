package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_Vtiger {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://localhost:8888/");

	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	
	Alert alt= driver.switchTo().alert();
	alt.accept();
	
	
	driver.findElement(By.name("lastname")).sendKeys("Emoley");
	
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	
	String ContactHeader=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(ContactHeader.contains("Emoley"))
	{
		System.out.println(ContactHeader);
		System.out.println("PASS");
	}
	
	else
	{
		System.out.println("FAIL");
	}
	
	Actions act=new Actions(driver);
	WebElement element= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	act.moveToElement(element).perform();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	driver.quit();
}
}
