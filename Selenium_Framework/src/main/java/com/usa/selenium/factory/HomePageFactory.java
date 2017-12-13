package com.usa.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePageFactory {

	
	protected static WebDriver driver;
	private String homePageTitleText = "Home: UPS";
	
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 200);
		PageFactory.initElements( driver,factory);
	}
	@FindBy(how = How.XPATH, using = ".//*[@id='ups-navItems']/ul/li[1]/a")
	@CacheLookup
	private WebElement homePageloginBtn;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='email']")
	@CacheLookup
	private WebElement UserName;

	@FindBy(how = How.XPATH, using = ".//*[@id='pwd']")
	@CacheLookup
	private WebElement password;
	@FindBy(how = How.XPATH, using = ".//*[@id='submitBtn']")
	@CacheLookup
	private WebElement loginbtn;
	
	
	public String getHomePageTitleText() {
		return homePageTitleText;
	}
	public WebElement getHomePageloginBtn() {
		return homePageloginBtn;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}}
	
	
	