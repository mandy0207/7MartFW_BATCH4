package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;

public class AdminUsersPage extends PageActions{

	private WebDriver driver;
	
	public AdminUsersPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#username")
	private WebElement userNameInput;
	
	@FindBy(css="#password")
	private WebElement passwordInput;
	
	@FindBy(css="#user_type")
	private WebElement selectDropdown;
	
	@FindBy(name="Create")
	private WebElement saveBtn;
	
	public String createAdminUser(String userName, String password, String userType) {
		clickElement(newBtn);
		setTextBox(userNameInput, userName);
		setTextBox(passwordInput, password);
		setstaticDropdown(selectDropdown, userType);
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		return getSplitStringText(alertText);	
		
	}
	

	
}
