package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		
		Thread.sleep(10000);
		
		WebElement ac=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ac).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();

	}

}
