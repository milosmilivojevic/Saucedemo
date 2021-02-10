package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	WebElement firstNameInputField;
	WebElement lastNameInputField;
	WebElement zipInputField;
	WebElement continueButton;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstNameInputField() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastNameInputField() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getZipInputField() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.className("cart_button"));
	}
	
	public void enterFirstName(String firstName) {
		this.getFirstNameInputField().sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		this.getLastNameInputField().sendKeys(lastName);
	}
	public void enterZip(String zip) {
		this.getZipInputField().sendKeys(zip);
	}
	public void clickContinueButton() {
		this.getContinueButton().click();
	}
}
