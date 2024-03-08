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
	
	@FindBy(css=".btn.btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(id="name")
	private WebElement nameInput;
	
	@FindBy(id="username")
	private WebElement usernameInput;
	
	@FindBy(id="password")
	private WebElement passwordInput;
	

	@FindBy(name="create")
	private WebElement saveBtn;
	
	
	public void submitDeliverBoyData(String name, String userName, String password) {
		clickElement(newBtn);
		setTextBox(nameInput,name);
		setTextBox(usernameInput, userName);
		setTextBox(passwordInput, password);
		scrollToBottomofPage();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(saveBtn);
	
	}
	
	
	

	
}
