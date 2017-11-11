package com.util.helper;

import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.usa.automation.factory.browserFactory;

public class XYLocator {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver = browserFactory.getBrowser("IE");
	       // Wait For Page To Load
	       driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	       InverseCumulativeURL icurl = new InverseCumulativeURL(driver);
			driver.get(icurl.getInverseCumulativeURL());     
	       driver.get("www.google.com/");
	       // Maximize Window
	       driver.manage().window().maximize();
        //get cords of mouse code, outputs to console every 1/2 second
        //make sure to import and include the "throws in the main method"

	       Thread.sleep(6000,000);*/
        while(true != false)
        {
       // TimeUnit.SECONDS.sleep(1/2);
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        Thread.sleep(6000,000);
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        System.out.println("X:" + mouseX);
        System.out.println("Y:" + mouseY);
        //make sure to import 
        }

    }


	}

