package com.obsqura.utils;

import java.time.LocalDateTime;

public class UniqueGenerator {

	
	public static String getCurrentDateTime() {
		 LocalDateTime currentDateTime = LocalDateTime.now();
		 return currentDateTime.toString();
	}
}
