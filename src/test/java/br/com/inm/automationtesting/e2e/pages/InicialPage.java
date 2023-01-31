/**
 * 
 */
package br.com.inm.automationtesting.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author August Neto
 *
 */
public class InicialPage extends ObjectPageBase{

	/**
	 * URL da página inicial
	 */
	public static final String URL_PAG_INICIAL = "https://practice.automationtesting.in/";
	
	//Elementos da página
	public static final String ID_IFRAME_POPUPGOOGLEADVPARTE1 = "aswift_7";
	public static final String ID_IFRAME_POPUPGOOGLEADVPARTE2 = "ad_iframe";
	
	public static final String CSS_BUTTON_CLOSE = "#dismiss-button > div > span";

	//Tempo para pressionar teclas
	//public static final int ESPERAMS = 1000;
	
	//public static final int POSXCLOSE = 400;
	//public static final int POSYCLOSE = 800;

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
		
		fechaPopupAdvGoogle();
		
		return new MyAccountPage(this.driver);
	}

	/**
	 * 
	 * Método responsável por fechar o popup do google na tela Inicial.
	 * 
	 */
	public void fechaPopupAdvGoogle() {
		
		//Vai para o iframe do popup
		WebElement iframe1 = this.driver.findElement(By.id(ID_IFRAME_POPUPGOOGLEADVPARTE1));
		this.driver.switchTo().frame(iframe1);
		
		WebElement popup = this.driver.findElement(By.id(ID_IFRAME_POPUPGOOGLEADVPARTE2));
		this.driver.switchTo().frame(popup);
		
		driver.findElement(By.cssSelector(CSS_BUTTON_CLOSE)).click();
		
		//Sai do frame e volta para a página inicial
		this.driver.switchTo().defaultContent();
		
		//System.out.println(gettudo());
		//driver.findElement(By.id("menu-icon-close")).click();
	}
	
}
