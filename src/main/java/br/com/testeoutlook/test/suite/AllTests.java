package br.com.testeoutlook.test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import br.com.testeoutlook.commom.Property;
import br.com.testeoutlook.commom.Selenium;
import br.com.testeoutlook.test.SignInValidation;

//classe respons�vel por indicar um m�todo que iniciar� os testes e um que ser� executado ao final deles
@RunWith(Suite.class)
@Suite.SuiteClasses({//dentro das chaves, dever� haver as classes que ter�o os @Test implementados, e se mais de uma, dever�o ser separadas por v�rgula
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
	
	//neste m�todo, o AfterClass fechar� o driver ap�s a execu��o dos testes
	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}
}
