package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SwthaRecordings/Workspace\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=9bd9bf005f46103f5d49b4d5c57bce8a");
		
		WebElement dropdown=driver.findElement(By.name("country"));
		
		Select s=new Select(dropdown);
		
//		s.selectByValue("92");
//		s.selectByVisibleText("INDIA");
//		s.selectByIndex(4);
		
		List<WebElement> drop_info=s.getOptions();
		System.out.println(drop_info.size());
		
		for (int i = 0; i < drop_info.size(); i++) 
		{
			s.selectByIndex(i);
			String dName=drop_info.get(i).getText();
			System.out.println(dName);
		}

	}

}
