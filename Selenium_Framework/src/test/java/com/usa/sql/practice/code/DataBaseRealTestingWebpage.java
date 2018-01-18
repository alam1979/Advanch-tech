package com.usa.sql.practice.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.util.helper.screenShot;


public class DataBaseRealTestingWebpage {
	
 static WebDriver driver;
 private Connection con = null;
 private Statement stmt = null;
 String dataBaseName = "student";
 String driver_DBPath = "jdbc:mysql://localhost:3306/";
 String DB_username = "root";
 String DB_password = "root";
 String Query;
 ResultSet res;
 @BeforeTest
 public void DBConnection() throws Exception {
 try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
	  stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	  }catch(Exception e){
	  System.out.println(e.getMessage());}  }
      @Test
      public void tc_1() throws Exception  {
      try{
      Query = "Select * from employees";
      res = stmt.executeQuery(Query);
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.get("http://www.qavalidation.com/demo");
      int i=1; //to name the screenshot file
      while(res.next()) //move to the next row in result set, row by row
      {
      String FirstName = res.getString("FIRST_NAME");
      System.out.println(FirstName);
      String Email = res.getString("EMAIL");
      System.out.println(Email);
     /* int Telephone = res.getInt("PHONE_NUMBER");
      System.out.println(Telephone);*/
      String Telephone = res.getString("PHONE_NUMBER");
      System.out.println(Telephone);
      
      WebElement Name = driver.findElement(By.id("username"));
       Name.clear();Name.sendKeys(FirstName);
      WebElement EmailAdd = driver.findElement(By.id("email"));
              EmailAdd.clear();EmailAdd.sendKeys(Email);
      WebElement CellPh = driver.findElement(By.id("tel"));
       CellPh.clear();
     //  CellPh.sendKeys(Integer.toString(Telephone));
       CellPh.sendKeys(Telephone);
      
       
   
      i++;
  	screenShot.captureScreenShot(driver, "USPShomepage");
     }
     
  }catch(Exception e){
	  System.out.println(e.getMessage());
	  }
  WebElement submitbtn = driver.findElement(By.xpath(".//*[@id='form1']/fieldset/div[9]/input")); 
  submitbtn.click();
 }
 
 @AfterTest
 public void tear()
 {
  con = null;
  driver.quit();
 }
 
 
 }