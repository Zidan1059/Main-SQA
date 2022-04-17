package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccount {

	WebDriver driver = null;
	
	By dresses = By.className("sf-with-ul");
	By casualDresses = By.xpath("//a[@title='Casual Dresses']");
	
	public MyAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectCasualDress() {
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(dresses);

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(casualDresses);

		//To mouseover on sub menu
		actions.moveToElement(subMenu);

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
	}
}
