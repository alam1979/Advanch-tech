package com.util.helper;

import org.openqa.selenium.WebDriver;

public class BoxAlertPresentOrNot {
	 static WebDriver driver;
	public static boolean isAlertPresent() {
	    try {
	       
			driver.switchTo().alert();
	        return true;
	    } // try
	    catch (Exception e) {
	        return false;
	    } // catch
	}
}
