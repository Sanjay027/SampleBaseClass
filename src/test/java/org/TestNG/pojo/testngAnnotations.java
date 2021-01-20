package org.TestNG.pojo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngAnnotations{
	
	@Test
	public void test1() {
		System.out.println("Test case1") ;
		
	
	}
	@Test
	public void test2 () {
		System.out.println("Test case2") ;
		
	
	}
	@Beforemethod
	public void beforeMethod() {
		System.out.println("Before Method");

	}
	@Aftermethod
	public void afterMethod() {
		System.out.println("after Method");

	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
//	
//	@Beforesuit
//	public void beforesuit() {
//	   System.out.println("Before suit");
//
//	}
//	@Aftersuit
//	public void aftersuit() {
//		   System.out.println("Before suit");

}