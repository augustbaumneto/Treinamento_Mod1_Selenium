package br.com.inm.automationtesting.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


/**
 * 
 * Classe responsável pelo controle da geração do navegador para teste
 * 
 * @author August Neto
 *
 */
public class BrowserFactory {

	// Constante da escolha do navegador pode assumir: chrome, firefox ou htmlunit
	public static final String NAVEGADOR = "chrome";
	

	/**
	 * 
	 * Método padrão de criação do Webdriver
	 * 
	 * @return Webdriver conforme o valor da constante informado
	 */
	public WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", NAVEGADOR);
		
		//Verifica o webdriver, sendo o Firefox, Chrome ou o interno
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "chrome":
				return initChromeDriver();
			default:
				return new HtmlUnitDriver();
		}
	}

	/**
	 * 
	 * Cria e retorna o Webdriver para o navegador Chrome
	 * 
	 * @return Webdriver Chrome.
	 */
	public  WebDriver initChromeDriver() {

		ChromeOptions options = new ChromeOptions();
		//Permitir acesso remoto no Chrome
		options.addArguments("--remote-allow-origins=*");
		
		//Se a execução será headless
		options.setHeadless(false);
		return new ChromeDriver(options);

	}

	/**
	 * 
	 * Cria e retorna o Webdriver para o navegador Chrome
	 * 
	 * @return Webdriver Firefox.
	 */
	
	public  WebDriver initFirefoxDriver() {

		return new FirefoxDriver();
	}
}
