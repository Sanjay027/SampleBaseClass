package org.junit.com;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.DATA_CONVERSION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junitprogram {
	public static WebDriver driver;

	@BeforeClass
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Before
	public void befomethod() {
		Date date = new Date();
		System.out.println(date);
		

	}

	@Test
	public void mainmethod() {
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("sanjay");
		Assert.assertEquals("sanjay", textuser.getAttribute("value"));
        

		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys("vinod");
		String attribute2 = textpass.getAttribute("value");  
		//Assert.assertEquals("vinod",textpass.getAttribute("value"));
	   	System.out.println(attribute2);
	}
	

	@After
	public void aftermethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass

	public static void closebrowser() {
		driver.close();

	}

}
