package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage2 {
	WebDriver driver;
	WebElement finishButton;
	
	
	public CheckoutPage2(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getFinishButton() {
		return driver.findElement(By.className("cart_button"));
	}
	
	public void clickFinishButton() {
		this.getFinishButton().click();
	}
}
