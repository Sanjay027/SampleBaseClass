  package org.adatin.pojo;

import java.security.PublicKey;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adatin extends BaseClass {

	public Adatin() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement email;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement login;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement rooms;

	@FindBy(id = "room_type")
	private WebElement noofrooms;

	@FindBy(id = "datepick_in")
	private WebElement checkin;

	@FindBy(id = "datepick_out")
	private WebElement chechout;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement submit;

	@FindBy(id = "radiobutton_0")
	private WebElement button;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement CCcardno;

	@FindBy(id = "cc_type")
	private WebElement CCcardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement CCmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement CCyear;

	@FindBy(id = "cc_cvv")
	private WebElement CCcvv;

	@FindBy(id = "book_now")
	private WebElement booknow;

	@FindBy(id = "order_id_389625")
	private WebElement orderno;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getChechout() {
		return chechout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCCcardno() {
		return CCcardno;
	}

	public WebElement getCCcardtype() {
		return CCcardtype;
	}

	public WebElement getCCmonth() {
		return CCmonth;
	}

	public WebElement getCCyear() {
		return CCyear;
	}

	public WebElement getCCcvv() {
		return CCcvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrderno() {
		return orderno;
	}

}
