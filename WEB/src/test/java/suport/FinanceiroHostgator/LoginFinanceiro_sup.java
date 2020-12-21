package suport.FinanceiroHostgator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.Actions;

public class LoginFinanceiro_sup {

	private WebDriver driver;
	Actions action;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement senha;

	@FindBy(id = "cookie-cta")
	private WebElement cookie;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnEntrar;

	@FindBy(xpath = "//form[@id='login']/div/span")
	private WebElement emailSenhaInvalido;

	@FindBy(linkText = "Esqueceu sua senha?")
	private WebElement btnEsqueceuSenha;

	@FindBy(id = "inputUserName")
	private WebElement cpo1EmailCpfCnpj;

	@FindBy(id = "inputConfirmUserName")
	private WebElement cpo2EmailCpfCnpj;

	@FindBy(xpath = "//button[@id='pwreset']/div")
	private WebElement btnAvancar;

	@FindBy(css = ".msgError")
	private WebElement cpoMsgErr;

	public LoginFinanceiro_sup(WebDriver driver) {
		super();
		this.driver = driver;
		action = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	public LoginFinanceiro_sup AcessoPagina(String string) {
		action.Navegate(string);
		action.clicar(cookie);
		return new LoginFinanceiro_sup(driver);
	}

	public LoginFinanceiro_sup DigitoEmail(String string) {
		action.digitar(email, string);
		return new LoginFinanceiro_sup(driver);
	}

	public LoginFinanceiro_sup DigitoSenha(String string) {
		action.digitar(senha, string);
		return new LoginFinanceiro_sup(driver);
	}

	public LoginFinanceiro_sup clicarEntrar() {
		action.clicar(btnEntrar);
		return new LoginFinanceiro_sup(driver);
	}

	public LoginFinanceiro_sup clicaresqueceuSenha() {
		action.clicar(btnEsqueceuSenha);
		return new LoginFinanceiro_sup(driver);
	}

	public LoginFinanceiro_sup DigitaEmailCpfCnpj(String string, String string2) {
		action.digitar(cpo1EmailCpfCnpj, string).digitar(cpo2EmailCpfCnpj, string2);
		return new LoginFinanceiro_sup(driver);
	}

	public LoginFinanceiro_sup clicarAvancar() {
		action.clicar(btnAvancar);
		return new LoginFinanceiro_sup(driver);
	}

	public void validaMsgErro(String cpo, String msg) {
		boolean retorno = false;
		if (cpo.equals("email")) {
			retorno = action.validaPopupAngular(email, msg);
		} else if (cpo.equals("senha")) {
			retorno = action.validaPopupAngular(senha, msg);
		} else if (cpo.equals("EmailSenha")) {
			retorno = emailSenhaInvalido.getText().equals(msg);
		} else if (cpo.equals("emailCpf")) {
			retorno = cpoMsgErr.getText().equals(msg);
		}
		assertEquals(retorno, true);
	}

}
