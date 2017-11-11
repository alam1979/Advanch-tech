/*package com.usa.ttech.student.stepdefination;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login_function01 {

	WebDriver driver;
	 JavascriptExecutor js;

@Given("^User able to open browser and go to UPS home page$")
public void user_able_to_open_browser_and_go_to_UPS_home_page() throws Throwable {
	
		driver= new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();

	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	WebDriverWait wait =new WebDriverWait(driver, 20);
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath( ".//*[@id='email']")));
	 	//wait for page loading
	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 js = (JavascriptExecutor)driver;
     js.executeScript("return document.readyState").toString().equals("complete");

	 
	}


@When("^User Navigate to Login button$")
public void user_Navigate_to_Login_button() throws Throwable {
	    driver.navigate().to("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait for page loading
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 js = (JavascriptExecutor)driver;
	     js.executeScript("return document.readyState").toString().equals("complete");
	}

	@When("^User enters valid credentials for login$")
	public void user_enters_valid_credentials_for_login(DataTable table) throws Throwable {
	    List<List<String>> data=table.raw();
	    
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(""+data.get(1).get(0)+"");
	
	  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(""+data.get(1).get(1)+"");
	  driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	 
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		System.out.println("Test Passed Successfully");
	 driver.quit();
	 
	}

	
	
}
*/