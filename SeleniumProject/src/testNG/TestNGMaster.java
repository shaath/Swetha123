package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster 
{
	public static WebDriver driver;
	public static String expval,actval;
	public static FileInputStream fi;
	public static  Properties pr;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Qedge123!@#";
	public static String f="Swetha",l="D",Eid="SDW3214";
	public static String uname="AAAA"+f+l+"1234567",ename=f+" "+l,pswd=f+l+"@1234567890123",cpswd=f+l+"@1234567890123";
	@BeforeSuite
	public void org_Launch() throws IOException
	{
		fi=new FileInputStream("D:\\SwthaRecordings\\Workspace\\SeleniumProject\\src\\or\\orgHRM.properties");
		pr=new Properties();
		pr.load(fi);
		
		expval="LOGIN";
//		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
//		driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SharatChandra\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(actval, expval,"Launch Failed");
		
	}
	
	@BeforeTest
	public void org_Login() throws InterruptedException
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(5000);
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	
	@AfterTest
	public void org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}

}
