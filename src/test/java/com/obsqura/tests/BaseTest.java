package com.obsqura.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class BaseTest {
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void initDriver() {
		
		String browserName = "chrome";
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("choose correct browser");
		}
		initPages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		
	}
	
	public LoginPage lp;
	public HomePage hp ;
	public ExpenseCategoryPage exp;
	public void initPages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	    exp= new ExpenseCategoryPage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
