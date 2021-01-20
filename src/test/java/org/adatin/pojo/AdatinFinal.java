package org.adatin.pojo;

import java.io.IOException;

import org.junit.BeforeClass;
import org.libglobal.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ProtocolHandshake.Result;

public class AdatinFinal extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		
		launchBrowser();
		launchURl("http://adactinhotelapp.com/");
		impwait();
		
		Adatin ad = new Adatin();
		
		send(ad.getEmail(),"praveen05");
		send(ad.getPass(),"praveen@05");
	    click(ad.getLogin());
		takescreenshort("one");
		Thread.sleep(3000);
		select(ad.getLocation(),"Sydney");
		select(ad.getHotels(), "Hotel Hervey");
		select(ad.getRooms(), "Deluxe");
		send(ad.getCheckin(), "31/12/2020");
		send(ad.getChechout(), "07/01/202");
		select(ad.getAdultroom(), "3 - Three");
		select(ad.getChildroom(),"3 - Three");
		click(ad.getSubmit());
		takescreenshort("two");
		click(ad.getButton());
		click(ad.getContinuebtn());
		send(ad.getFirstname(), "sanjay");
		send(ad.getLastname(), "vinod");
		send(ad.getAddress(), "fl no 203 aVANTHIKA APPARTMEMT");
		send(ad.getCCcardno(), "1234567891234567");
        select(ad.getCCcardtype(), "Master Card");
        select(ad.getCCmonth(), "April");
        select(ad.getCCyear(), "2019");
        send(ad.getCCcvv(), "1277");
        takescreenshort("three");
        click(ad.getBooknow());
        takescreenshort("four");
        Thread.sleep(8000);
        WebElement boki = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
        click(boki);
        getAttributes(ad.getOrderno());
        quit();
        
	}
}	
		