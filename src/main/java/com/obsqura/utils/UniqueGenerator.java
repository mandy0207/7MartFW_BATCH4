package com.obsqura.utils;

import java.time.LocalDateTime;
import java.util.Random;

public class UniqueGenerator {

	
	public static String getCurrentDateTime() {
		 LocalDateTime currentDateTime = LocalDateTime.now();
		 return currentDateTime.toString();
	}
	
	
	public static int getRandomNumber() {
		 Random rand = new Random();
	     int randomNumber = rand.nextInt(1000000000);
	     return randomNumber ;
	}
}
