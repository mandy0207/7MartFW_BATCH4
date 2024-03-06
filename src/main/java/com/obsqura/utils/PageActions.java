package com.obsqura.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions {

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
	
	
	
}
