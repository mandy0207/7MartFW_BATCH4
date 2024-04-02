package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utils.ExcelReader;
import com.obsqura.utils.UniqueGenerator;

public class AdminTest extends BaseTest {

	
	@Test
	public void createAdmin() throws IOException {
		lp.Login();
		
		String userName=ExcelReader.getSheetData(1, 0)+UniqueGenerator.getRandomNumber();
		String password=ExcelReader.getSheetData(1, 1);
		String userType=ExcelReader.getSheetData(1, 2);
		
		hp.navigateToAdminUsersPage();
		String userCreated=adminUser.createAdminUser(userName, password, userType);
		
		Assert.assertEquals(userCreated, "User Created Successfully");
		
		
	}
}
