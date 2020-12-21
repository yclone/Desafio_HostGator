package Commons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actions extends JSWaiter {

	WebDriver driver;
	public static WebDriverWait wait;

	public Actions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		setDriver(driver);
		waitGifLoading(By.id("carregamento"));
		waitForLoadPage();
	}

	public Actions Navegate(String url) {
		driver.switchTo().defaultContent();
		driver.manage().deleteAllCookies();
		driver.get(url);
		return new Actions(driver);
	}

	
	public Actions digitar(WebElement item, String value) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(item));
			driver.switchTo().defaultContent();
			item.clear();
			item.sendKeys(value);
			item.sendKeys(Keys.TAB);
		} catch (NullPointerException e) {
			System.err.println(e);
		}
		return new Actions(driver);
	}
	
	
	public String getText(WebElement results) {
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(results));
		String textoColetado = results.getText();
		System.out.println("Texto coletado : " + textoColetado);
		return textoColetado;
	}

	public Actions clicar(WebElement item) {
		wait.until(ExpectedConditions.elementToBeClickable(item));
		driver.switchTo().defaultContent();
		item.click();
		return new Actions(driver);
	}
	
	public boolean validaPopupAngular(WebElement item, String resp) {
		String validationMessage = item.getAttribute("validationMessage");
		System.err.println(validationMessage);
		return validationMessage.contains(resp);

	}

}
