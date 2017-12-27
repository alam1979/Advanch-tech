package com.usa.excel.practice.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.usa.excelfactory.ExcelFactory;
import com.util.helper.screenShot;

public class ExcelDataDrivenWebPage {
	 static WebDriver driver;
	 
	public static void main(String[] args) throws Throwable {
		driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("http://www.qavalidation.com/demo");
	     
	     String path="./ApplTestData/DataExtract.xlsx";
	    
	      String FirstName = ExcelFactory.getCellData(0, 1, 1, path);
	      System.out.println(FirstName);
	      String Email = ExcelFactory.getCellData(0, 1, 2, path);
	      System.out.println(Email);
	     
	      String Telephone = ExcelFactory.getCellData(0, 1, 3, path);
	      System.out.println(Telephone);
	      
	      WebElement Name = driver.findElement(By.id("username"));
	       Name.clear();Name.sendKeys(FirstName);
	      WebElement EmailAdd = driver.findElement(By.id("email"));
	              EmailAdd.clear();EmailAdd.sendKeys(Email);
	      WebElement CellPh = driver.findElement(By.id("tel"));
	       CellPh.clear();
	     //  CellPh.sendKeys(Integer.toString(Telephone));
	       CellPh.sendKeys(Telephone);
	      
	  	screenShot.captureScreenShot(driver, "USPShomepage");
	  	WebElement submitbtn = driver.findElement(By.xpath(".//*[@id='form1']/fieldset/div[9]/input")); 
	  	submitbtn.click();
	  	driver.quit();
	}
}
