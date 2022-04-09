package com.fis;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1
{
	WebDriver driver;
	
	 @Before
	public void setUp()
	{
		System.setProperty("webdriver.Chromedriver","D:\\technominds\\examples\\chromedriver_win32\\hromedriver.exe");
		driver=new ChromeDriver();
		
	}
	 @After
	public void tearDown()
	{
		driver.quit();
	}
	 @Test
	public void Testlogin()
	{
		driver.get("https://demo.guru99.com/v1/index.php");
		driver.findElement(By.name("Uid")).sendKeys("mngr391862");
		driver.findElement(By.name("password")).sendKeys("ydamaqu");
		driver.findElement(By.name("btnlogin")).click();
		if(driver.getTitle().equals("GTPL BANK MANAGER HOME PAGE"));
		{
			Assert.assertTrue(true);
			
		}
		}
}

	
