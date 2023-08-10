package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChartPage extends BasePage {
	By Buy = By.xpath("//span[normalize-space()='Beli (1)']"); // Path Beli

	public ChartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void chart() {
		clickAndWaitByXpath(Buy);
		Utility.hardWait(3);
	}

}