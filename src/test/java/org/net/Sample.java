package org.net;

import org.libglobal.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	public static void main(String[] args) {
    launchBrowser();
    launchURl("https://www.facebook.com/");
    WebElement textusername = driver.findElement(By.id("email"));
      send(textusername, "sanjay");
    WebElement textppass = driver.findElement(By.id("pass"));
      send(textppass, "joy");

    WebElement login = driver.findElement(By.id("u_0_b"));
      click(login);
      
     quit();
     






	}

}
