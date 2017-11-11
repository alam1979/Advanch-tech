package com.util.helper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static WebElement getExplicitWait(WebElement element,WebDriver driver){
	
	WebDriverWait wait = new WebDriverWait(driver, 120);
	WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
	//element1.click();
	
	return element1;
		
	}
}