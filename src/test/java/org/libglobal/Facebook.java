package org.libglobal;

import org.net.POJO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		launchURl("https://www.facebook.com/");
		impwait();
		
		POJO p = new POJO();

		p.getEmail().sendKeys("srini");
		p.getPassw().sendKeys("12345");
		p.getLog().click();
		driver.quit();
		
		
		
	}
}
