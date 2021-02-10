package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {
	WebDriver driver;
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement loginButton;

	public IndexPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameInputField() {
		return driver.findElement(By.id("user-name"));

	}

	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));	
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.id("login-button"));	

	}
	public void enterUsername(String username) {
		this.getUsernameInputField().sendKeys(username);
	}
	public void enterPassword(String password) {
		this.getPasswordInputField().sendKeys(password);
	}
	public void clickLoginButton() {
		this.getLoginButton().click();
	}
}
