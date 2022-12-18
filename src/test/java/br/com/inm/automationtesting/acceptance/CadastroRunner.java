/**
 * 
 */
package br.com.inm.automationtesting.acceptance;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

/**
 * Classe Responsável por rodar os testes de Cucumber de Cadastro
 * 
 * @author August Neto
 */

@Suite
@SuiteDisplayName("Cadastro")
//Caminho para as features
//motor do runner utilizado
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//Tags executadas
@IncludeTags("cadastro")
//Configura para o Gherkin sair no console.
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//Configura para não exibir o quadro do cucumber no console
@ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
public class CadastroRunner {



}
