package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authentication {

WebDriver driver = null;
	
	//Create Account
	By insertEmail = By.id("email_create");
	By createAccountButton = By.id("SubmitCreate");
	
	//Sign In
	
	By signInEmail = By.id("email");
	By signInPassword = By.id("passwd");
	By submitLogin = By.id("SubmitLogin");
	
	public Authentication(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertEmail(String text) {
		
		driver.findElement(insertEmail).sendKeys(text);
		
	}
	
	public void clickCreateAccountButton() {
		
		driver.findElement(createAccountButton).click();
	}
	
	public void insertSignInEmail(String text) {
		
		driver.findElement(signInEmail).sendKeys(text);
		
	}

	public void insertSignInPassword(String text) {
		
		driver.findElement(signInPassword).sendKeys(text);
		
	}
	
	public void clickLogin() {
		driver.findElement(submitLogin).click();
	}

}
