package com.obsqura.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.obsqura.utils.ExtenReporterNG;

public class ReportListener implements ITestListener{
	
	ExtentReports extent =ExtenReporterNG.generateReport();
	ExtentTest test;
	

	@Override
	public void onTestStart(ITestResult result) {
		 test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}


	
	

	
}
