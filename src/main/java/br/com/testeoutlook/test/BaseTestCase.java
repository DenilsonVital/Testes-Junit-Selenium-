package br.com.testeoutlook.test;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import br.com.testeoutlook.commom.SignIn;
import br.com.testeoutlook.commom.Property;
import br.com.testeoutlook.commom.Selenium;
import br.com.testeoutlook.test.suite.AllTests;

public class BaseTestCase {

	protected static SignIn homePage;
	protected static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		if (!AllTests.isAllTestsExecution) {
			driver = Selenium.getDriver();
			driver.navigate().to(Property.SITE_ADDRESS);
			driver.manage().window().maximize();
		}
	}
}
