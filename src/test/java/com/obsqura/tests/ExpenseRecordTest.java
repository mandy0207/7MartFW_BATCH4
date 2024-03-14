package com.obsqura.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.Context.Constants;

public class ExpenseRecordTest extends BaseTest{

	@Test(description="OBS123")
	public void verifyUserIsAbleTocreateExpenseRecord() throws IOException, AWTException {
		
		lp.Login();
		hp.navigateToManageExpense();
		
		String actualalertText=lep.createListExpense(Constants.fileToUpload);
		Assert.assertEquals(actualalertText, "Expense Record Created Successfully");	
		
		
		
	}
}
