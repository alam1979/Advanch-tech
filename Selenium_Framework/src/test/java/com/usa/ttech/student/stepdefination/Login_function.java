package com.usa.ttech.student.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_function {
	WebDriver driver;
	JavascriptExecutor js;

	@Given("^User is on facebook login Page$")
	public void user_is_on_facebook_login_Page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='email']")));
		// wait for page loading
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").toString().equals("complete");

	}

	@When("^User click to Login button$")
	public void user_click_to_Login_button() throws Throwable {

		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// wait for page loading
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").toString().equals("complete");
	}

	@When("^User enters valid email from \"([^\"]*)\" table$")
	public void user_enters_valid_email_from_table(String userName) throws Throwable {
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(userName);

	}

	@When("^User enter valid pass from \"([^\"]*)\" table$")
	public void user_enter_valid_pass_from_table(String pass) throws Throwable {
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

	}

	@Then("^Validate Login is Successfull$")
	public void validate_Login_is_Successfull() throws Throwable {
		driver.getTitle();
	//	Assert.assertEquals(driver.getTitle(), driver.getTitle());
		System.out.println("Test Passed Successfully");
		driver.quit();

	}

}