package br.com.inm.automationtesting.e2e.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * Classe base dos page objects. Possui construtor e métodos comuns das páginas
 * 
 * @author August Neto
 *
 */
public class ObjectPageBase {

	public static final long TEMPO_ESPERA = 10;
	public static final long TEMPO_ESPERA_URL = 10;

	protected static final String MENUID_MY_ACCOUNT = "menu-item-50";
	
	
	protected WebDriver driver;

	/**
	 * 
	 * Construtor padrão com driver
	 * 
	 * @param driver
	 */
	public ObjectPageBase(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * 
	 * Verifica se a pagina carregou
	 * 
	 * @param urlverificao Url da pagina para verificar
	 * @return true se a página atual é a esperada
	 */
	public boolean ePagina(String urlverificao) {

		esperaUrl(urlverificao);

		return (this.driver.getCurrentUrl().equals(urlverificao));
	}

	/**
	 * 
	 * Metodo que aguarda ate o elemento aparecer
	 * 
	 * @param identificadorelemento, localizador na pagina do elemento
	 */
	protected void esperaElemento(By identificadorelemento) {

		new WebDriverWait(this.driver, Duration.ofSeconds(TEMPO_ESPERA)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.presenceOfElementLocated(identificadorelemento));

	}

	/**
	 * 
	 * Metodo que aguarda ate o elemento aparecer
	 * 
	 * @param urlaguardo, url da pagina para aguarda
	 */
	protected void esperaUrl(String urlaguardo) {

		// Aguarda um tempo para verificar se não existe uma página carregando
		try {
			new WebDriverWait(this.driver, Duration.ofSeconds(TEMPO_ESPERA_URL))
					.until(ExpectedConditions.not(ExpectedConditions.urlToBe(urlaguardo)));
		} catch (TimeoutException e) {
			// Para evitar a exceção quando a página não muda
		}

	}
	
}
