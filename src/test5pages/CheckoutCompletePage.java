package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {
	WebDriver driver;
	WebElement orderLabel;
	
	public CheckoutCompletePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOrderLabel() {
		return driver.findElement(By.className("complete-header"));
	}
	
}
