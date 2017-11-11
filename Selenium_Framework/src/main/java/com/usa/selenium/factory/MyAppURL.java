package com.usa.selenium.factory;

import org.openqa.selenium.WebDriver;

public class MyAppURL {

	private static String myUPSAppURL="https://www.ups.com/us/en/Home.page/";
	private static String myGoogleAppURL="https://www.ups.com/us/en/Home.page";
	
	

	WebDriver driver;
	
	public MyAppURL(WebDriver driver){
		this.driver=driver;
	}

	public static String getMyUPSAppURL() {
		return myUPSAppURL;
	}

	public static String getMyGooglwAppURL() {
		return myGoogleAppURL;
	}

	
	
	

	
}
