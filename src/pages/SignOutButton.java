package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutButton {

		WebDriver driver = null;
		
		By signOutButton = By.className("logout");
		
		public SignOutButton(WebDriver driver) {
			this.driver = driver;
		}
		
		public void clickSignOutButton() {
			driver.findElement(signOutButton).click();
		}
}
