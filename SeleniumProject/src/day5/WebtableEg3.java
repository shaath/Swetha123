package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableEg3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(3000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String Eid=cols.get(1).getText();
			if (Eid.equals("3654"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}

		
	}
}