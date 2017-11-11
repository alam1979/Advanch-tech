package com.util.helper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {

	public static String captureScreenShot(WebDriver driver, String ScreenShotName) throws Exception{
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		Date date = new Date();
	  String dateTime = dateFormat.format(date.getTime());
		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
		String destination=currentDir +"\\target\\ScreenShots\\"+dateTime+"\\" +ScreenShotName + ".png";
		FileUtils.copyFile(source, new File(destination));
		
		
		
		return destination;
	
	      }


	/*  public void failed(Throwable e, Description test,WebDriver driver){
	 
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String currentDir = System.getProperty("user.dir");
     String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
     try {
         FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + test.getMethodName() + timeStamp + ".png"));
     } catch (IOException e1) {
         e1.printStackTrace();
}*/
     

	  
}	











