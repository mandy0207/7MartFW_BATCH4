package com.obsqura.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;
import com.obsqura.utils.TestProperties;

public class ListExpensePage extends PageActions{

	private WebDriver driver;
	
	public ListExpensePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="ex_type")
	private WebElement selectDropdownExpenseType;
	
	@FindBy(id="amount")
	private WebElement amountInput;
	
	@FindBy(xpath="//*[@type='file']")
	private WebElement chooseFile;
	
	@FindBy(name="user_id")
	private WebElement selectuserDropdown;
	

	public String createListExpense(String filePath) throws AWTException {
		clickElement(newBtn);
		setstaticDropdown(selectuserDropdown ,"Admin(Admin)");
		setstaticDropdown(selectDropdownExpenseType ,"Credit Bank");
		setTextBox(amountInput,"456");
		scrollToBottomofPage();
		uploadFile(chooseFile,filePath);
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		return getSplitStringText(alertText);
		
	}
	
}
