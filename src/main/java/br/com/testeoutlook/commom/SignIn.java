package br.com.testeoutlook.commom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

	private static final WebDriver driver;
	private static final WebDriverWait wait;
	
	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait (driver, 50);
	}
	
	static By entrarEmail = By.xpath("/html/body/div[2]/header/ul/li[5]/ul/li[1]/div/a/span");
	static By campoEmail = By.xpath("//*[@id=\"i0116\"]");
	static By botaoProximo = By.xpath("//*[@id=\"idSIButton9\"]");
	static By campoSenha = By.xpath("//*[@id=\"i0118\"]");
	static By checkBoxMantenhaMeConectado = By.id("idChkBx_PWD_KMSI0Pwd");
	static By botaoEntrar = By.xpath("//*[@id=\"idSIButton9\"]");
	
	public static void entrarEmail () {
		driver.findElement(entrarEmail).click();
	}
	
	public static void inserirEmail(String email) {
		driver.findElement(campoEmail).clear();
		driver.findElement(campoEmail).sendKeys(email);
	}
	
	public static void clicarProximo () {
		WebDriverWait wait = new WebDriverWait(driver, 10);//método para inserir um tempo de espera para que o objeto apareça na página, neste caso, 10 segundos
		wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		driver.findElement(botaoProximo).click();
	}
	
	public static void inserirSenha (String senha) {
		driver.findElement(campoSenha).clear();
		driver.findElement(campoSenha).sendKeys(senha);
	}
	
	public static void marcarCheckBox() {
		driver.findElement(checkBoxMantenhaMeConectado).click();
	}
	
	public static void clicarEntrar() {
		//WebDriverWait wait = new WebDriverWait(driver, 10);//método para inserir um tempo de espera para que o objeto apareça na página, neste caso, 10 segundos
		wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		driver.findElement(botaoEntrar).click();
	}
}

