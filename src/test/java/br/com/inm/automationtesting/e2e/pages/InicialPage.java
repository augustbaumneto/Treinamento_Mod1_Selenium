/**
 * 
 */
package br.com.inm.automationtesting.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author August Neto
 *
 */
public class InicialPage extends ObjectPageBase{

	/**
	 * URL da página inicial
	 */
	private static final String URL_PAG_INICIAL = "https://practice.automationtesting.in/";

	/**
	 * 
	 * Construtor padrão e direciona para a página inicial do site
	 * 
	 */
	public InicialPage(WebDriver driver) {
		super(driver);
		driver.get(URL_PAG_INICIAL);
	}
	
	/**
	 * 
	 * Classe que verifica se esta na pagina inicial
	 * 
	 * @return true se esta ou false se o contrário
	 */
	public boolean ePaginaInicial() {
		return ePagina(URL_PAG_INICIAL);
	}
	
	/**
	 * 
	 * Método que direciona para a página da conta.
	 * 
	 * @return a página de my account
	 */
	public MyAccountPage vaiPaginaConta() {
		
		driver.findElement(By.id(MENUID_MY_ACCOUNT)).click();
		
		return new MyAccountPage(this.driver);
	}

}
