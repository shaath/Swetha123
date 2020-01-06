package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethodsEg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
//		driver.navigate().to("http://facebook.com");
//		Thread.sleep(10000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
	}

}
