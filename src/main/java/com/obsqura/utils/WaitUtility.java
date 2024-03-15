package com.obsqura.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriver driver;
	WebDriverWait wait;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	     wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	}

	public void waitUntilVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilTextToBePresentInsideElement(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
	}
	
	public void waitUntilClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void shortWait() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
