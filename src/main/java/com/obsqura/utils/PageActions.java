package com.obsqura.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageActions {

	@FindBy(css=".btn.btn-rounded.btn-danger")
	protected WebElement newBtn;
	
	@FindBy(css=".alert-success")
	protected WebElement alertMsg;
	
	@FindBy(name="create")
	protected WebElement saveBtn;
	
	private WebDriver driver;
	
	public PageActions(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void setTextBox(WebElement element, String value) {
		
		element.sendKeys(value);
	}
	
	public String getSplitStringText(String text) {
		return text.split("!")[1].trim();
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void handleChildWindow() {
		/**
		 * write a code to switch to child window
		 */
	}
	
	public void scrollToBottomofPage() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public void setstaticDropdown(WebElement element, String value) {
		Select staticDropdown = new Select(element);
		staticDropdown.selectByVisibleText(value);
	}
	
	
	
}
