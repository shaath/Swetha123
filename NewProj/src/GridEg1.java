import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GridEg1 {
	@Parameters("browser")
@Test
public void login(String br) throws MalformedURLException
{
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
		}
//	DesiredCapabilities cap=DesiredCapabilities.chrome();
//	DesiredCapabilities cap=DesiredCapabilities.firefox();
	cap.setPlatform(Platform.WINDOWS);
	
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"), cap);
	
	driver.get("http://google.com");
}
}
