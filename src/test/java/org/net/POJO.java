package org.net;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class POJO extends BaseClass {


	public POJO() {
		
		PageFactory.initElements(driver, this);
		
	
		//getters & setters in pojo clss.
	}
	
	@FindBy (id ="email")
	private WebElement email;
		
	@FindBy (id="pass")
	private WebElement passw;
	
	@FindBy(xpath ="//button[@name='login']")
	private WebElement log;
	
	
	
	
	
	
	

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassw() {
		return passw;
	}

	public WebElement getLog() {
		return log;
	}

	
	
	
	
	
	
	
		
		
	
		
		
		
		
	
	
	

	
	
	
	
	
	
		
	
}
