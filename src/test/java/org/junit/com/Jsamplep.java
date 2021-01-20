package org.junit.com;

import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;

public class Jsamplep { 
   @Test
	public void method1() {
		System.out.println("method1");
		
   }
	@Test 
   public void method2() {
		System.out.println("method2");
	
	}
	@Ignore
	@Test

	public void method3() {
		System.out.println("method3");
		
	}
	
	@Test
	public void method7() {
	System.out.println("method7");
	}
	@Ignore
	@Test
	public void method4() {
		System.out.println("method4");
	}
	@Test
	public void method5() {
	System.out.println("method5");

	}
    @Test
	public void method6() {
		System.out.println("method6");
	}	
}
