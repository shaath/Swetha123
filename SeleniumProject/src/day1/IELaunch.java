package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SharatChandra\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://gmail.com");
	}

}
