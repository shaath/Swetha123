package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmpRegTest_TestNG extends TestNGMaster
{
	@Test
	public void org_EmpReg() throws InterruptedException
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
		
		Assert.assertEquals(actval, expval,"Employee Registration Failed");
	}

}
