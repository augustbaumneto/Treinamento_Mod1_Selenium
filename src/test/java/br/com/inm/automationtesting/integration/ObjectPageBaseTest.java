/**
 * 
 */
package br.com.inm.automationtesting.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import br.com.inm.automationtesting.e2e.pages.ObjectPageBase;

/**
 * 
 * Classe para testar os testes unitários e de integração da classe ObjectPageBase
 * 
 * @author August Neto
 *
 */
public class ObjectPageBaseTest {

	private ObjectPageBase opb;
	
	private WebDriver driver; 
	
	private static final String URLOK = "https://www.google.com/";
	
	/**
	 * 
	 * Classe para iniciar os testes da classe
	 * 
	 */
	
	@BeforeEach
	public void setup() {

		driver = new HtmlUnitDriver();
		opb = new ObjectPageBase(driver);
		driver.get(URLOK);
	}
	
	/**
	 * 
	 * Classe para fechar o navegador
	 * 
	 */
	
	@AfterEach
	public void termino() {

		driver.quit();
	}
	
	@Test
	@DisplayName("É página atual")
	public void deveRetornarQueEpaginaAtual() {
		assertTrue(opb.ePagina(URLOK));
	}

	@Test
	@DisplayName("Não é página atual")
	public void deveRetornarQueNaoEpaginaAtual() {
		
		assertFalse(opb.ePagina(URLOK+"asd"));
	}
	
}
