package day6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandlingEg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(7000);
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String Wid=it.next();
			System.out.println(Wid);
			
			driver.switchTo().window(Wid);
			
			try 
			{
				driver.findElement(By.linkText("Verify your account")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				break;
			}
			catch (Exception e)
			{
				System.out.println("The expected element is not available in the current window");
			}

		}
		

	}

}
