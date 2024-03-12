package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;

public class ListDeliveryBoyPage  extends PageActions{

	private WebDriver driver;
	
	public ListDeliveryBoyPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="name")
	private WebElement nameInput;
	
	@FindBy(id="username")
	private WebElement usernameInput;
	
	@FindBy(id="password")
	private WebElement passwordInput;

	
	
	public void submitDeliverBoyData(String name, String userName, String password) {
		clickElement(newBtn);
		setTextBox(nameInput,name);
		setTextBox(usernameInput, userName);
		setTextBox(passwordInput, password);
		scrollToBottomofPage();
		ShortWait();
		clickElement(saveBtn);
		
		
	
	}
	
	
	

	
}
