package com.util.helper;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WindowsHandle {
static WebDriver driver;
	public static String getWindowsHandle(WebDriver driver){
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();

		//patName will provide you parent window
		String patName = itr.next();
			driver.close();
		//chldName will provide you child window
		String chldName = itr.next();

		//Switch to child window
		driver.switchTo().window(chldName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Do normal selenium code for performing action in child window


		//To come back to parent window
		//driver.switchTo().window(patName);
		
		return getWindowsHandle(driver);
}
}
