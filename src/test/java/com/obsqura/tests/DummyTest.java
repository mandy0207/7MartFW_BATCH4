package com.obsqura.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DummyTest extends BaseTest {

	@Test
	public void anotherTest() {
		

		driver.findElement(By.name("usernameNow")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
}
