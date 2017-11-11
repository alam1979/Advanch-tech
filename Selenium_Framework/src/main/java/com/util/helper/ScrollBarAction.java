package com.util.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollBarAction {
	static WebDriver driver;
	
	public static WebElement getScrollBarMove(WebElement draggablePartOfScrollbar,WebDriver driver, int PixelStartamount,int PixelTotalAmount){
		
		Actions dragger = new Actions(driver);
		// drag downwards
		int numberOfPixelsToDragTheScrollbarDown = PixelStartamount;
		for (int i = 10; i < PixelTotalAmount; i = i + numberOfPixelsToDragTheScrollbarDown) {
			try {
				// this causes a gradual drag of the scroll bar, 10 units at a
				// time
				dragger.moveToElement(draggablePartOfScrollbar).clickAndHold()
						.moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release().perform();
				
			} catch (Exception e1) {
			}
		}
		return draggablePartOfScrollbar;
	}
	public static WebElement getScrollBarFullAction(WebElement draggablePartOfScrollbar,WebDriver driver, int PixelTotalAmount){
		
		Actions dragger1 = new Actions(driver);
		dragger1.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0, PixelTotalAmount).release().perform();
		return draggablePartOfScrollbar;
	}
	public static WebElement getBelowScrollBar(WebElement draggablePartOfScrollbar,WebDriver driver, int PixelTotalAmount){
		
		Actions dragger1 = new Actions(driver);
		dragger1.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(PixelTotalAmount,0).release().perform();
		return draggablePartOfScrollbar;
	}
}

