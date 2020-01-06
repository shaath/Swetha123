package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_POM extends Constants
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SharatChandra\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
		 driver=new ChromeDriver();

		driver.get(lp.url);
		driver.manage().window().maximize();
		lp.org_Login(lp.u, lp.p);
		
		
		Thread.sleep(5000);
		hm.clickWelcome();
		hm.clickLogout();
		
		driver.close();
	}
	
}
