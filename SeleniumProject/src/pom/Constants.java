package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants 
{
	
	public static LoginPage lp=PageFactory.initElements(Login_POM.driver, LoginPage.class);
	public static HomePage hm=PageFactory.initElements(Login_POM.driver, HomePage.class);
}