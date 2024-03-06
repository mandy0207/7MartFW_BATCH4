package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utils.UniqueGenerator;

public class CreateDeleteExpenseTest extends BaseTest {

	@Test
	public void anotherTest() {
	
		lp.Login();
		hp.navigateToExpenseCategoryPage();
		
		
		String uniqueCategory= "Expense".concat(UniqueGenerator.getCurrentDateTime());
		
		String actualAlertMsg=exp.createExpense(uniqueCategory);
		System.out.println(actualAlertMsg);
		/**
		 * Validating expense is getting created successfully
		 */
		Assert.assertEquals(actualAlertMsg, "Expense Category Created Successfully");
		
		String deleteAlertMsg=exp.deleteExpense();
		Assert.assertEquals(deleteAlertMsg, "Expense Category Deleted Successfully");	
		
	}
}
