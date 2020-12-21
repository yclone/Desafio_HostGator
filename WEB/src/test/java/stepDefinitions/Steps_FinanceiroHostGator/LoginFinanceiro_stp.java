package stepDefinitions.Steps_FinanceiroHostGator;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import runnerFiles.DriverFactory;
import suport.FinanceiroHostgator.LoginFinanceiro_sup;

public class LoginFinanceiro_stp {

	LoginFinanceiro_sup loginFinanceiro_sup;
	
	@Dado("que eu acesso a página {string}")
	public void que_eu_acesso_a_página(String url) {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		loginFinanceiro_sup.AcessoPagina(url);
	}

	@Quando("faco o login com o email {string} e digito a senha {string}")
	public void eu_faco_o_login_com(String email, String senha) {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		loginFinanceiro_sup.DigitoEmail(email).DigitoSenha(senha);
	}
	

	@Entao("deve apresentar a mensagem {string}")
	public void deve_apresentar_a_mensagem(String string) {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		
	}
	
	@Entao("deve apresentar a mensagem de erro {string} do campo {string}")
	public void deve_apresentar_a_mensagem_de_erro(String msgErro, String cpo) {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());	
		loginFinanceiro_sup.validaMsgErro(cpo, msgErro);
	}
	
	@Quando("clico em Entrar")
	public void clico_em_entrar() {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		loginFinanceiro_sup.clicarEntrar();
	}
	
	@Quando("eu clico no botão Esqueceu sua senha")
	public void eu_clico_no_botão_Esqueceu_sua_senha() {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		loginFinanceiro_sup.clicaresqueceuSenha();
	}

	@Quando("digito no campo E-mail ou CPF CNPJ o valor {string} e digito no campo confirma E-mail ou CPF CNPJ o valor {string}")
	public void digito_no_campo_E_mail_ou_CPF_CNPJ_o_valor_e_digito_no_campo_confirma_E_mail_ou_CPF_CNPJ_o_valor(String string, String string2) {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		loginFinanceiro_sup.DigitaEmailCpfCnpj(string, string2);
	}
	
	@Quando("clico em avançar")
	public void clico_em_avançar() {
		loginFinanceiro_sup = new LoginFinanceiro_sup(DriverFactory.getDriver());
		loginFinanceiro_sup.clicarAvancar();
	}

}
