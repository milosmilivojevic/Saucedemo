package test5tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests{
		
		@BeforeMethod
		public void beforeMethod() throws InterruptedException {
			driver.navigate().to("https://www.saucedemo.com/index.html");
			Thread.sleep(2000);
		}
		@Test(priority = 0)
		public void logInTest() throws InterruptedException {
			String username = "standard_user";
			String password = "secret_sauce";
			
			indexPage.enterUsername(username);
			Thread.sleep(2000);
			indexPage.enterPassword(password);
			Thread.sleep(2000);
			indexPage.clickLoginButton();
			String textForAssert = inventoryPage.getProductsLabel().getText();
			Assert.assertEquals(textForAssert, "Products");
		}

		@Test(priority = 1)
		public void orderingTests() throws InterruptedException {
			String firstName = "Petar";
			String lastName = "Petrovic";
			String zip = "31260";
			
			logInTest();
			inventoryPage.addProduct1ToCart();
			Thread.sleep(2000);
			inventoryPage.clickShoppingCartIcon();
			Thread.sleep(2000);
			cartPage.clickCheckoutButton();
			Thread.sleep(2000);
			checkoutPage.enterFirstName(firstName);
			Thread.sleep(2000);
			checkoutPage.enterLastName(lastName);
			Thread.sleep(2000);
			checkoutPage.enterZip(zip);
			Thread.sleep(2000);
			checkoutPage.clickContinueButton();
			Thread.sleep(2000);
			checkoutPage2.clickFinishButton();
			
			String textForAssert = checkoutCompletePage.getOrderLabel().getText();
			Assert.assertEquals(textForAssert, "THANK YOU FOR YOUR ORDER");
			}

		@AfterMethod
		public void afterMethod() throws InterruptedException {
			// driver.manage().deleteAllCookies();
			// driver.navigate().refresh();
			Thread.sleep(2000);
		}


	}

