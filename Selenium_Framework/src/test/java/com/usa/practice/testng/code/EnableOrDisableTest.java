package com.usa.practice.testng.code;

import org.testng.annotations.Test;

public class EnableOrDisableTest {

	
	@Test(enabled=false)
	public void firstTest() {
		System.out.println("This is First Test");
	}
	@Test(enabled=true)
	public void secondTest() {
		System.out.println("This is Second Test");
	}
	@Test(enabled=true)
	public void thirdtest() {
		System.out.println("This is Third Test");
	}
}
