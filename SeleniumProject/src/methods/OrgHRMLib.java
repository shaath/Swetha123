package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrgHRMLib 
{
	public static WebDriver driver;
	public static String expval,actval;
	public static FileInputStream fi;
	public static  Properties pr;
	//Launch
	public String orgLaunch(String url) throws IOException
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
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";			
		}
		else
		{
			return "Fail";
		}
	}
	//Login
	public String orgLogin(String u,String p) throws InterruptedException
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(5000);
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";			
		}
		else
		{
			return "Fail";
		}
		
	}
	
	//Logout
	public String orgLogout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";			
		}
		else
		{
			return "Fail";
		}
	}
	
	//close
	public void orgClose()
	{
		driver.close();
	}
	//Employee Registration
	public String orgEmpReg(String f,String l,String Eid) throws InterruptedException
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";			
		}
		else
		{
			return "Fail";
		}
		
	}
	//User Registration
	
	public String orgUserReg(String ename,String uname,String pswd,String cpswd) throws InterruptedException
	{
		expval=uname;
		boolean flag=false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpswd);
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval)) 
			{
				flag=true;
				break;
			}
		}
		if (flag) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}


	public void brLaunch(String brName)
	{
		if (brName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (brName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SharatChandra\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (brName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\SharatChandra\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}
}
