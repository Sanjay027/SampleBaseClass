package org.net;

import java.io.IOException;

import org.adatin.pojo.Adatin;
import org.libglobal.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adatinpage extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		launchBrowser();
		launchURl("https://adactinhotelapp.com/");
		impwait();
		
		Adatin ad = new Adatin();
		
//		WebElement username = driver.findElement(By.id("username"));
//		send(username, "praveen05");
		send(ad.getEmail(),"praveen05");
		send(ad.getPass(), "praveen@05");
	

		WebElement location = driver.findElement(By.id("location"));
		click(location);
		select(location, "London");

		WebElement hotel = driver.findElement(By.id("hotels"));
		click(hotel);
		select(hotel, "Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		click(room);
		select(room, "Double");

		WebElement noofroom = driver.findElement(By.id("room_nos"));
		click(noofroom);
		select(noofroom, "5 - Five");

		WebElement checkin = driver.findElement(By.id("datepick_in"));
		click(checkin);
		send(checkin, "31/12/2020");

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		click(checkout);
		send(checkout, "07/01/2021");

		WebElement adultroom = driver.findElement(By.id("adult_room"));
		click(adultroom);
		select(adultroom, "2 - Two");

		WebElement childrrom = driver.findElement(By.id("child_room"));
		click(childrrom);
		select(childrrom, "3 - Three");

		WebElement submit = driver.findElement(By.id("Submit"));
		click(submit);

		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		click(radio);

		WebElement conti = driver.findElement(By.id("continue"));
		click(conti);

		WebElement firstname = driver.findElement(By.id("first_name"));
		send(firstname, "sanjay");

		WebElement lastname = driver.findElement(By.id("last_name"));
		send(lastname, "vinod");

		WebElement adress = driver.findElement(By.id("address"));
		send(adress, "fl no 203 avanthika appartment vuyyure");

		WebElement cardno = driver.findElement(By.id("cc_num"));
		send(cardno, "1234567891234567");

		WebElement creaditcard = driver.findElement(By.id("cc_type"));
		click(creaditcard);
		select(creaditcard, "VISA");

		WebElement month = driver.findElement(By.id("cc_exp_month"));
		click(month);
		select(month, "August");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		click(year);
		select(year, "2014");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		send(cvv, "127");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		click(booknow);
		
		

		Thread.sleep(4000);
		WebElement orderno = driver.findElement(By.id("order_no"));
		text(orderno); 
		
		 Thread.sleep(2000);
		 
	
		
		
		
		quit();
	
	}
}
