package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(css="[type='submit']")
	private WebElement submitBtn;
	
	
	public void Login() {
		userName.sendKeys("admin");	
		password.sendKeys("admin");
		submitBtn.click();
	}
	
}
