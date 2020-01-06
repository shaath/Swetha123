package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("S");
		Thread.sleep(3000);
		
		List<WebElement> FCity=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		System.out.println(FCity.size());

		for (int i = 0; i < FCity.size(); i++)
		{
			String FFC=FCity.get(i).getText();
			System.out.println(FFC);
			if(FFC.equalsIgnoreCase("Shirdi"))
			{
				FCity.get(i).click();
				break;
			}
		}
	}

}
