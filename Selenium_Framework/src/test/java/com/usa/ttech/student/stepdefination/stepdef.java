package com.usa.ttech.student.stepdefination;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usa.automation.factory.browserFactory;
import com.usa.selenium.factory.HomePageFactory;
import com.util.helper.HighlightEmenet;
import com.util.helper.screenShot;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {

	 static WebDriver driver;
	HomePageFactory pagefactory ;
	


	@Given("^User able to open browser and go to UPS home page$")
	public void user_able_to_open_browser_and_go_to_UPS_home_page() throws Throwable {
		driver = browserFactory.getBrowser("firefox",driver);
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 200);
		PageFactory.initElements( driver,factory);
		pagefactory = PageFactory.initElements(driver, HomePageFactory.class);
		
		driver.get("https://www.ups.com/us/en/Home.page/");
		//driver.get(dataProviderfactory.getConfig().getAppURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		screenShot.captureScreenShot(driver, "USPShomepage");
	}

	@When("^User Navigate to Login button$")
	public void user_Navigate_to_Login_button() throws Throwable {
	   
		
		// explicit wait and put element locator or properties from page factory
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagefactory.getHomePageloginBtn()));
		HighlightEmenet.drawBorder(driver, element);
		// click login page link
		element.click();
	}

	@When("^User enters valid credentials for login$")
	public void user_enters_valid_credentials_for_login(DataTable user) throws Throwable {
	   
	 
		List<List<String>> a=user.raw();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(pagefactory.getUserName()));
		HighlightEmenet.drawBorder(driver, element1);
		element1.sendKeys(a.get(1).get(0));
		  
		WebDriverWait wait11 = new WebDriverWait(driver, 60);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(pagefactory.getPassword()));
		HighlightEmenet.drawBorder(driver, element11);
		element11.sendKeys(a.get(1).get(1));
		
		WebDriverWait wait111 = new WebDriverWait(driver, 60);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(pagefactory.getLoginbtn()));
		HighlightEmenet.drawBorder(driver, element111);
		element111.click();
		TimeUnit.SECONDS.sleep(2);
	
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Actual Home Page Title::"+driver.getTitle());
		System.out.println("Expected Home Page Tile::"+pagefactory.getHomePageTitleText());
		// verify
		if(driver.getTitle().equalsIgnoreCase(pagefactory.getHomePageTitleText())) {
			   System.out.println("Test Passed");
		   }
		   else {
			   System.out.println("Test Failed");
		   }
		//assert or validate
		assertEquals(pagefactory.getHomePageTitleText(),driver.getTitle());
		
		driver.quit();
	}

	
}
