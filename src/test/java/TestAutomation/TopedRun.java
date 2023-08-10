package TestAutomation;

import org.testng.annotations.Test;

import TestAutomation.pages.ProductList;
import TestAutomation.pages.ChartPage;
import TestAutomation.pages.CheckOutPage;
import TestAutomation.pages.LoginPage;
import TestAutomation.pages.PaymentMethod;

public class TopedRun extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProductList productList = new ProductList(driver, explicitWait);
	ChartPage chartPage = new ChartPage(driver, explicitWait);
	CheckOutPage checkOutPage = new CheckOutPage(driver, explicitWait);
	PaymentMethod paymentMethod = new PaymentMethod(driver, explicitWait);

	@Test(testName = "success check out", description = "Product ordered successfully")
	public void testAutomasi() {
		String user = "AutomationTest";
		String password = "Fin100823";

		loginPage.login(user, password);
		productList.product();
		chartPage.chart();
		paymentMethod.view();

	}
}
