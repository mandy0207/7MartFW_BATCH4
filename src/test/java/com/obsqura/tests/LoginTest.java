package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifyUserIsAbleToLogin() throws IOException {
	
		lp.Login();
		String actualHeader=hp.getBrandHeader();
		
		Assert.assertEquals(actualHeader, "7rmart supermarket");
			
	}
	
}
