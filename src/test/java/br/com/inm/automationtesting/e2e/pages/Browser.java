package br.com.inm.automationtesting.e2e.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

/**
 * 
 * Classe que controla o navegador
 * 
 * @author August Neto
 *
 */
public class Browser {

	private WebDriver driver;

	//Tempo de timout para criar o webbrowser
	private static final long TIMEOUT = 10;
	
	/**
	 * 
	 * Construtor padrão
	 * 
	 */
	public Browser() {
		this.driver = new BrowserFactory().createWebDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}

	protected WebDriver getDriver() {
		return driver;
	}

	/**
	 * 
	 * Inicializa a pagina inicial
	 * 
	 * @return a paginainicial
	 */
	public InicialPage vaiInicialPage() {
		return new InicialPage(this.driver);
	}

	/**
	 * 
	 * Método que apaga os cookies e fechar o navegador
	 * 
	 */
	public void clean() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
