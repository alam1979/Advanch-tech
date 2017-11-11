package com.usa.practice.testng.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class LoginFunction {
	 WebDriver driver ;

  @BeforeTest
   public void setup() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com/");
  }
	@Test
	public void Test01() {
		//user name
		//pass
		//click button
		
		System.out.println(driver.getTitle());
		Assert.assertEquals("", "");
		

	}
@AfterTest
public void closesetup() {
	driver.quit();
}
}