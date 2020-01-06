package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailLoginEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SharatChandra\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\SharatChandra\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
//		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("testingtoolstrainer449");
//		email.click();
//		email.clear();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("1234567890");
		
		driver.findElement(By.cssSelector("#passwordNext > span:nth-child(3) > span:nth-child(1)")).click();
	}

}
