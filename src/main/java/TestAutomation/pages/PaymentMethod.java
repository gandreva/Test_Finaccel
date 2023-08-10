package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentMethod extends BasePage {
	
		By PaymentMethod = By.xpath("//span[normalize-space()='Pilih Pembayaran']"); // Path Pilih Metode Pembayaran
		By Payment = By.xpath("///span[normalize-space()='Pilih Pembayaran']"); // Path Pembayaran

	public PaymentMethod(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void view() {
		clickAndWaitByXpath(PaymentMethod);
		clickAndWaitByXpath(Payment);
		Utility.hardWait(3);
	}

}