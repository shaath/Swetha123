package day8;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(15000);
//		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\SharatChandra\\Desktop\\AadharCard.png");
		driver.findElement(By.id("uploadfile_0")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload.exe");
	}

}
