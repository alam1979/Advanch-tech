package com.usa.regressiontest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usa.automation.factory.browserFactory;
import com.usa.automation.factory.dataProviderfactory;
import com.usa.selenium.factory.HomePageFactory;

public class LoginFunctionJava extends HomePageFactory {

	//static WebDriver driver;
	
	public LoginFunctionJava(WebDriver driver)  {
		super(driver);
		
		
	}

	public static void main(String[] args) throws Throwable {
	
		driver = browserFactory.getBrowser("firefox",driver);
		driver.get(dataProviderfactory.getConfig().getAppURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		HomePageFactory pagefactory = PageFactory.initElements(driver, HomePageFactory.class);
		// explicit wait and put element locator or properties from page factory
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagefactory.getHomePageloginBtn()));
		// click login page link
		element.click();
		// explicit wait and put element locator or properties from page factory
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(pagefactory.getUserName()));
		element1.sendKeys(dataProviderfactory.getConfig().userName());
		// explicit wait and put element locator or properties from page factory
		WebDriverWait wait11 = new WebDriverWait(driver, 60);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(pagefactory.getPassword()));
		element11.sendKeys(dataProviderfactory.getConfig().passWord());
		// explicit wait and put element locator or properties from page factory
		WebDriverWait wait111 = new WebDriverWait(driver, 60);
		WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(pagefactory.getLoginbtn()));
		element111.click();
		TimeUnit.SECONDS.sleep(2);
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
		Assert.assertEquals( pagefactory.getHomePageTitleText(),driver.getTitle());
		
		driver.quit();
	}

}
