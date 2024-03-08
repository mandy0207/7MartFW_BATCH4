package com.obsqura.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;
import com.obsqura.utils.TestProperties;

public class LoginPage extends PageActions{

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(css="[type='submit']")
	private WebElement submitBtn;
	
	
	public void Login() throws IOException {
		Properties prop = TestProperties.getProperties();
		
		setTextBox(userName,prop.getProperty("username"));
		setTextBox(password,prop.getProperty("password"));
		clickElement(submitBtn);
		
	}
	
}
