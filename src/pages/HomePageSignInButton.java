package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageSignInButton {

	WebDriver driver = null;
	
	By signInButton = By.className("login");
	
	public HomePageSignInButton(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
	}
}
