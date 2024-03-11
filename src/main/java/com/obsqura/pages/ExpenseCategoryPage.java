package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;

public class ExpenseCategoryPage extends PageActions{

	private  WebDriver driver;
	
	public ExpenseCategoryPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(id="name")
	private WebElement titleBox;
	
	@FindBy(name="Create")
	private WebElement searchBtn;
	
	@FindBy(xpath="//tr[1]/td[2]//a[2]")
	private WebElement deleteBtn;
	

	public String createExpense(String value) {
		clickElement(newBtn);
		setTextBox(titleBox, value);
		clickElement(searchBtn);
		String alertText=alertMsg.getText();
		return  getSplitStringText(alertText);	
	}
	
	public String deleteExpense() {
		clickElement(deleteBtn);
		acceptAlert();
		String alertText=alertMsg.getText();
		return getSplitStringText(alertText);
	}
	

	
}
