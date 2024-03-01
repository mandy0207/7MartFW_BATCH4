package com.obsqura.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void verifyUserIsAbleToLogin() {
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
}
