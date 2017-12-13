package com.usa.automation.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {
	
	//static WebDriver driver;
	public static WebDriver getBrowser(String browserName,WebDriver driver) throws InterruptedException{
		
		if(browserName.equalsIgnoreCase("IE")){
			
			System.setProperty("webdriver.ie.driver", dataProviderfactory.getConfig().getIEPath());
			driver = new InternetExplorerDriver();
		}
		if(browserName.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.ie.driver", dataProviderfactory.getConfig().getChromePath());
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")){
			driver =new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		return driver;
	}}
