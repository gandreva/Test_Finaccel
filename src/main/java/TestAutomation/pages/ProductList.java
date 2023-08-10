package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductList extends BasePage {
	By HomePage = By.xpath("//img[@alt='tokopedia-logo']");
	By ShowProd = By.xpath("//div[@id='product-feed-4682353232']//img[@alt='SUNCO COOKING OIL REFILL 2 LITER - MINYAK GORENG']");
	By addToChart = By.xpath("//span[normalize-space()='+ Keranjang']");
	By Chart = By.xpath("//span[@data-testid='totalCartHeader']");

	public ProductList(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void product() {
		clickAndWaitByXpath (HomePage);
		clickAndWaitByXpath (ShowProd);
		clickAndWaitByXpath(addToChart);
		clickAndWaitByXpath(Chart);
	}

}
