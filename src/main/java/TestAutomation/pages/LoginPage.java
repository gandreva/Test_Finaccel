package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	By loginUsername = By.xpath("//input[@id='email-phone']"); // Path Input Username
	By nextBtn = By.xpath("//span[normalize-space()='Selanjutnya']"); // Path Click Button Selanjutnya
	By loginPass = By.xpath("//input[@id='password-input']"); // Path Input Password
	By loginBtn = By.xpath("//span[@aria-label='login-button']"); // Path Click Button Login

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void login(String user, String password) {
		setText(loginUsername, user);
		clickAndWaitByXpath(nextBtn);
		setText(loginPass, password);
		clickAndWaitByXpath(loginBtn);
	}
}