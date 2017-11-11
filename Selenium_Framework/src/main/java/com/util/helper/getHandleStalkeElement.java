package com.util.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class getHandleStalkeElement {

	 WebElement driver;
	public void handleStaleElement(String search_Box) {
		  int count = 0;
		  //It will try 4 times to find same element using name.
		  while (count < 4) {
		   try {
		   
			//If exception generated that means It Is not able to find element then catch block will handle It.
		    WebElement staledElement = driver.findElement(By.xpath(search_Box));
		    //If exception not generated that means element found and element text get cleared.
		    staledElement.clear();    
		   } catch (StaleElementReferenceException e) {
		    e.toString();
		    System.out.println("Trying to recover from a stale element :" + e.getMessage());
		    count = count + 1;
		   }
		   count = count + 4;
		  }
		 }
}
