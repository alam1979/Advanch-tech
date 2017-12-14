package com.usa.practice.testng.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 @Listeners(ListenerTest.class)
 public class TestNGListeners {

	WebDriver driver;					
    // Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{	driver= new FirefoxDriver();
	    driver.get("http://www.facebook.com/");					
	    driver.findElement(By.id("email")).sendKeys("Ttech");							
	    driver.findElement(By.id("pass")).sendKeys("1213wwdeasd");							
	    //driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();	
	    driver.quit();
	}	
	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{						
	    Assert.assertEquals("sarower", "sarower");		
	}}
