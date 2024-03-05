package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utils.UniqueGenerator;

public class CreateExpenseTest extends BaseTest {

	@Test
	public void anotherTest() {
	
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		HomePage hp = new HomePage(driver);
		hp.navigateToExpenseCategoryPage();
		
		ExpenseCategoryPage exp= new ExpenseCategoryPage(driver);
		String uniqueCategory= "Expense".concat(UniqueGenerator.getCurrentDateTime());
		
		String actualAlertMsg=exp.createExpense(uniqueCategory);
		System.out.println(actualAlertMsg);
		/**
		 * Validating expense is getting created successfully
		 */
		Assert.assertEquals(actualAlertMsg, "Expense Category Created Successfully");
		
		
		
		
		
	}
}
