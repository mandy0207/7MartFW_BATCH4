package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewsTest extends BaseTest {

	@Test(groups="Smoke")
	public void createNews() throws IOException {
		
		lp.Login();
		hp.navigateToNewsPage();
		String creationAlert=news.validateNewsIsCreated();
		Assert.assertEquals(creationAlert, "News Created ");
	
	}
}
