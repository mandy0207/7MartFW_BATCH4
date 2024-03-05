package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseCategoryPage {

	WebDriver driver;
	
	public ExpenseCategoryPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".btn.btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(id="name")
	private WebElement titleBox;
	
	@FindBy(name="Create")
	private WebElement searchBtn;
	
	@FindBy(css=".alert-success")
	private WebElement alertMsg;
	


	public String createExpense(String value) {
		newBtn.click();
		titleBox.sendKeys(value);
		searchBtn.click();
		String alertText=alertMsg.getText();
		return alertText.split("!")[1].trim();
				
	}
	

	
}
