package br.com.testeoutlook.test;

import org.junit.Before;
import org.junit.Test;
import br.com.testeoutlook.commom.SignIn;
import junit.framework.Assert;

public class SignInValidation extends BaseTestCase{
	
	@Before
	public void before() throws Exception{
		
	}
	
	@Test
	public void login() {
		SignIn.entrarEmail();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1566926370&rver=7.0.6730.0&wp=LBI&wreply=https:%2f%2fwww.msn.com%2fpt-br%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fpt-br%252f%253fpfr%253d1&lc=1033&id=1184&mkt=pt-br&pcexp=True");
		SignIn.inserirEmail("dninho88@hotmail.com");
		SignIn.clicarProximo();
		SignIn.inserirSenha("xxxxxx");
		//SignIn.marcarCheckBox();
		SignIn.clicarEntrar();
		Assert.assertEquals("MSN Brasil | Hotmail, Notícias, Horóscopo do dia, Famosos, Tempo", driver.getTitle());
	}
}