package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeyboardEg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(gmail).build().perform();
		Thread.sleep(5000);
		act.contextClick(gmail).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("P")).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(5000);
//		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}
