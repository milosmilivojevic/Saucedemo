package test5tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.CartPage;
import test5pages.CheckoutCompletePage;
import test5pages.CheckoutPage;
import test5pages.CheckoutPage2;
import test5pages.IndexPage;
import test5pages.InventoryPage;

public class BaseTests {
	WebDriver driver;
	IndexPage indexPage;
	InventoryPage inventoryPage;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	CheckoutPage2 checkoutPage2;
	CheckoutCompletePage checkoutCompletePage;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.indexPage = new IndexPage(driver);
		this.inventoryPage = new InventoryPage(driver);
		this.cartPage = new CartPage(driver);
		this.checkoutPage = new CheckoutPage(driver);
		this.checkoutPage2 = new CheckoutPage2(driver);
		this.checkoutCompletePage = new CheckoutCompletePage(driver);
		
		driver.manage().window().maximize();
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
