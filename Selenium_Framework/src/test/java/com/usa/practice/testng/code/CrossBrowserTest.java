package com.usa.practice.testng.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;
	@Test
	@Parameters("browser") 
	public void getbrowser() throws Exception{
		
		String a="FireFox";
		String b="Chrome";
		String c= "ie";
		
		if(a.equalsIgnoreCase("FireFox")){
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			System.out.println("Firefox Titile::"+ driver.getTitle());
			driver.quit();
		    }
		
		if(b.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				//driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				System.out.println("Chrome Titile::"+ driver.getTitle());
				driver.quit();
			}
			if (c.equalsIgnoreCase("IE"))
			{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

			
			driver.get("https://www.UPS.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.close();
			driver.quit();
			}}}

