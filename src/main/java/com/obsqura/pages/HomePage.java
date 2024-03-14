package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;

public class HomePage  extends PageActions{

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".brand-text")
	private WebElement brandHeader;
	
	@FindBy(xpath="(//p[contains(text(),'Manage Expense')])[1]")
	private WebElement manageExpenseToggle;
	
	@FindBy(xpath="//*[contains(text(),'Expense Category')]")
	private WebElement expenseCategory;
	
	@FindBy(xpath="//*[contains(text(),'Manage Delivery Boy')]")
	private WebElement manageDeliveryBoy;
	
	@FindBy(xpath="//p[contains(text(),'Admin Users')]")
	private WebElement adminUsersBtn;
	
	@FindBy(xpath="//*[contains(text(),'Manage Content')]")
	private WebElement manageContent;
	
	@FindBy(xpath="//*[contains(text(),'Manage News')]")
	private WebElement manageNews;
	
	@FindBy(xpath="(//li //*[contains(text(),'Manage Expense')])[2]")
	private WebElement manageExpense;
	
	
	public String getBrandHeader() {
		return brandHeader.getText();
	}
	
	public void navigateToExpenseCategoryPage() {
		clickElement(manageExpenseToggle);
		clickElement(expenseCategory);
		
	}
	
	public void navigateToManageDeilveryBoy() {
		clickElement(manageDeliveryBoy);
	}
	
	public void navigateToAdminUsersPage() {
		clickElement(adminUsersBtn);
	}
	
	public void navigateToNewsPage() {
		clickElement(manageContent);
		 waitUntilClickable(manageNews);
		clickElement(manageNews);
		
	}
	
	public void navigateToManageExpense() {
		clickElement(manageExpenseToggle);
		clickElement(manageExpense);
		
	}

	
}
