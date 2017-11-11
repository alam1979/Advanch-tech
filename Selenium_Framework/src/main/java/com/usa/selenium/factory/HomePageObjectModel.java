package com.usa.selenium.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjectModel {

	WebDriver driver;

	private By homePageloginBtn = By.xpath(".//*[@id='ups-navItems']/ul/li[1]/a");
	private By UserName = By.xpath(".//*[@id='email']");
	private By password = By.xpath(".//*[@id='pwd']");
	private By login = By.xpath(".//*[@id='submitBtn']");
	private String homePageTitleText = "Log in | UPS";

	public HomePageObjectModel(WebDriver driver) {

		this.driver = driver;

	}

	public By getHomePageloginBtn() {
		return homePageloginBtn;
	}

	public By getUserName() {
		return UserName;
	}

	public By getPassword() {
		return password;
	}

	public By getLogin() {
		return login;
	}

	public String getHomePageTitleText() {
		return homePageTitleText;
	}

}
