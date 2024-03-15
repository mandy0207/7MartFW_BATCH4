package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsqura.utils.UniqueGenerator;

public class CreateDeliveryBoyTest extends BaseTest {

	@Test(dataProvider= "getData")
	public void createDeliveryBoy(String name, String userName, String password) throws IOException {
		
		lp.Login();
		hp.navigateToManageDeilveryBoy();
		System.out.println(name +" "+userName+" "+password);
		String actualAlertText = ldb.submitDeliverBoyData( name,userName, password);
		
		
		
	}
	
	
	@DataProvider
	public String[][] getData() {	
		
	String data[] [] = new String[2][3];
		//data of ist row
		data[0][0]= "Nisyy";
		data[0][1]= "user"+ Integer.toString(UniqueGenerator.getRandomNumber());
		data[0][2]=Integer.toString(UniqueGenerator.getRandomNumber());
		
		//data of 2nd row
		data[1][0]= "Remya";
		data[1][1]= "user"+ Integer.toString(UniqueGenerator.getRandomNumber());
		data[1][2]=  Integer.toString(UniqueGenerator.getRandomNumber());
	
		return data;
		
	}
}
