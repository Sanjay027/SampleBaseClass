package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\G Sree Mamatha\\eclipse-workspace\\Selenium\\frames\\DFsampleproject\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchURl(String url) {
		driver.get(url);
	}

	public static void impwait() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}

	public static void send(WebElement e, String us) {
		e.sendKeys(us);
	}

	public static void click(WebElement m) {
		m.click();
	}

	public static void quit() {
		driver.close();
	}

	public static void select(WebElement c, String us) {
		Select ref = new Select(c);
		ref.selectByVisibleText(us);
	}

	public static void getAttributes(WebElement element) {

		String data = element.getAttribute("value");
		System.out.println(data);
	}

	public static void text(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void alertaccecpt() {
		driver.switchTo().alert().accept();

	}

	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();

	}

	public static void javascriptTRUE(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}

	public static void javascriptFALSE(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}

	public static void xssworkbookout(String str) throws IOException {

		File file = new File(
				"C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\SampleBaseClass\\xlfile\\31-12-2020.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		cell.setCellValue(str);

		FileOutputStream stream = new FileOutputStream(file);

		workbook.write(stream);

	}

	public static void xssworkbookin(String str) throws IOException {
		File file = new File(
				"C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\SampleBaseClass\\xlfile\\31-12-2020.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		cell.setCellValue(str);

	}

	public static void takescreenshort(String name) throws IOException {
		TakesScreenshot ref = (TakesScreenshot) driver;
		File src = ref.getScreenshotAs(OutputType.FILE);
		File file = new File(
				"C:\\Users\\G Sree Mamatha\\eclipse-workspace\\base\\JUNIT\\TESTNG\\SampleBaseClass\\Screenshot\\name.png");
		FileUtils.copyFile(src, file);

	}

	public static void dclick(WebElement c) {

	}

}
// public static void javascriptAttributes () {
// JavascriptExecutor js= (JavascriptExecutor)driver;
// js.executeScript("arguments[0].getAttributes(" ","txt1")");
//
