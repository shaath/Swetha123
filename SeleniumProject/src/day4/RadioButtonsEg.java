package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");

		WebElement box=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> radios=box.findElements(By.tagName("input"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String rname=radios.get(i).getAttribute("value");
			System.out.println(rname);
			
			if(rname.equalsIgnoreCase("Milk"))
			{
				radios.get(i).click();
			}
			else if (rname.equalsIgnoreCase("water")) 
			{
				radios.get(i).click();
			}
		}
	}

}
