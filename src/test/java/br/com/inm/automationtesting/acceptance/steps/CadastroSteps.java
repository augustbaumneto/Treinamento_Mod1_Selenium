/**
 * 
 */
package br.com.inm.automationtesting.acceptance.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.com.inm.automationtesting.e2e.pages.Browser;
import br.com.inm.automationtesting.e2e.pages.InicialPage;
import br.com.inm.automationtesting.e2e.pages.MyAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

/*
 * teste23@teste.com.br


augustbaumneto

123abcABC!@#
 */


/**
 * 
 * Classe de steps dos cenarios da feature cadastro
 * 
 * @author August Neto
 *
 */
public class CadastroSteps {

	private Browser navegador;
	private InicialPage paginainicial;
	private MyAccountPage paginaminhaconta;

	@Dado("que estou no site automation testing")
	public void que_estou_no_site_automation_testing() {
		navegador = new Browser();
		paginainicial = navegador.vaiInicialPage();
	}
	
	@Dado("não existe usuario logado")
	public void não_existe_usuario_logado() {

	}
	
	@Quando("acesso a opção my account")
	public void acesso_a_opção_my_account() {
		paginaminhaconta = paginainicial.vaiPaginaConta();
	}
	
	@Quando("digito email e senha válidos")
	public void digito_email_e_senha_válidos() {

	}
	
	@Quando("clico em Register")
	public void clico_em_register() {

	}
	
	@Entao("deve ser exiba uma mensagem informando que estou logado")
	public void deve_ser_exiba_uma_mensagem_informando_que_estou_logado() {

	}
	
	@Entao("deve-se permanecer na mesma pagina my account")
	public void deve_se_permanecer_na_mesma_pagina_my_account() {
		assertFalse(paginainicial.ePaginaInicial());
		assertTrue(paginaminhaconta.ePaginaMinhaConta());
		//navegador.clean();
	}

}
