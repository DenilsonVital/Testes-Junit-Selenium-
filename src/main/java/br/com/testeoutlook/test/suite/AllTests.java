package br.com.testeoutlook.test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import br.com.testeoutlook.commom.Property;
import br.com.testeoutlook.commom.Selenium;
import br.com.testeoutlook.test.SignInValidation;

//classe responsável por indicar um método que iniciará os testes e um que será executado ao final deles
@RunWith(Suite.class)
@Suite.SuiteClasses({//dentro das chaves, deverá haver as classes que terão os @Test implementados, e se mais de uma, deverão ser separadas por vírgula
	SignInValidation.class
})
public class AllTests {
	
	protected static WebDriver driver;//inicializa
	
	public static Boolean isAllTestsExecution = false;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		isAllTestsExecution = true;
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}
	
	//neste método, o AfterClass fechará o driver após a execução dos testes
	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}
}
