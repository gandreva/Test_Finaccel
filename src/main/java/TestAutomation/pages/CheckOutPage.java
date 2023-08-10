package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BasePage {
	By Kurir = By.xpath("//div[@class='ddsd-cap-text']"); // Path Pilih Kurir
	By Paket = By.xpath("//p[normalize-space()='Estimasi tiba hari ini']"); // Path Pilih Kurir
	By CheckOut = By.xpath("//span[normalize-space()='Pilih Pembayaran']"); // Path Pembayaran

	public CheckOutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void Addres(String firstName, String lastName, String postalCode) {

		clickAndWaitByXpath(Kurir);
		clickAndWaitByXpath(Paket);
		clickAndWaitByXpath(CheckOut);
		Utility.hardWait(3);
	}

}