package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(linkText="Admin")
	WebElement admin;
	
	@FindBy(linkText="PIM")
	WebElement pim;
	
	@FindBy(linkText="Leave")
	WebElement leave;

	@FindBy(linkText="Time")
	WebElement time;
	
	@FindBy(linkText="Recruitment")
	WebElement recruitment;
	
	@FindBy(linkText="My Info")
	WebElement mi;
	
	@FindBy(linkText="Performance")
	WebElement performance;
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;
	
	@FindBy(linkText="Directory")
	WebElement directory;
	
	@FindBy(linkText="Maintenance")
	WebElement maint;
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome;
	
	@FindBy(linkText="About")
	WebElement about;
	
	@FindBy(linkText="Change Password")
	WebElement cp;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void clickAdmin()
	{
		admin.click();
	}
	
	public void clickPim()
	{
		pim.click();
	}
	
	public void clickWelcome()
	{
		welcome.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}
