/**
 * 
 */
package br.com.inm.automationtesting.e2e.pages;

import org.openqa.selenium.WebDriver;

/**
 * 
 *  Classe page Object que representa a pagina my account
 * 
 * @author August Neto
 *
 */
public class MyAccountPage extends ObjectPageBase {

	public static final String URL_PAG_MINHACONTA = "https://practice.automationtesting.in/my-account/";
	
	public static final String ID_CAMPO_USERNAME_LOGIN = "username";

	/**
	 * Construtor padrão
	 * 
	 * @param driver
	 */
	public MyAccountPage(WebDriver driver) {
		super(driver);

	}
	
	/**
	 * 
	 * Metodo que verifica se esta na pagina minhaconta
	 * 
	 * @return true se esta ou false se o contrário
	 */
	public boolean ePaginaMinhaConta() {
		return ePagina(URL_PAG_MINHACONTA);
	}

}
