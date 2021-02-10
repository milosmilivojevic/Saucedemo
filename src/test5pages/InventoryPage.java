package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	WebDriver driver;
	WebElement productsLabel;
	WebElement product1AddToCartButton;
	WebElement shoppingCart;

	
	public WebElement getProductsLabel() {
		return driver.findElement(By.className("product_label"));	
	}

	public WebElement getProduct1AddToCartButton() {
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));	

	}
	
	public WebElement getShoppingCart() {
		return driver.findElement(By.className("shopping_cart_link"));	

	}
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}


	public void addProduct1ToCart() {
		this.getProduct1AddToCartButton().click();
	}
	public void clickShoppingCartIcon() {
		this.getShoppingCart().click();
	}
}
