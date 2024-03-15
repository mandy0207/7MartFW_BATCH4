package com.obsqura.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.obsqura.Context.Constants;

public class ExtenReporterNG {

	public static ExtentReports extent;
	
	public static ExtentReports generateReport() {
		 
		 ExtentSparkReporter reporter = new  ExtentSparkReporter(Constants.EXTENTREPORTPATH);
		 reporter.config().setReportName("Obsqura Automation Report");
		 reporter.config().setDocumentTitle("Company Name");
		 
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("QA Name", "Remya");
		 extent.setSystemInfo("Environment", "QA");
		 return extent;
	}
}
