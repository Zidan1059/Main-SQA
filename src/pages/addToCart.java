package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class addToCart {

	WebDriver driver = null;
	
	By productContainer = By.className("right-block");
	By addingToCart = By.className("ajax_add_to_cart_button");
	By continueShopping = By.className("continue");
	By tshirt = By.className("sfHoverForce");
	By blueColor = By.id("color_2");
	By tshirtCart = By.id("add_to_cart");
	By proceedCheckout = By.xpath("//a[@title='Proceed to checkout']");
	
	public addToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectAddToCart() {
		// Locating the Main Menu (Parent element)
				WebElement mainMenu = driver.findElement(productContainer);

				//Instantiating Actions class
				Actions actions = new Actions(driver);

				//Hovering on main menu
				actions.moveToElement(mainMenu);

				// Locating the element from Sub Menu
				WebElement subMenu = driver.findElement(addingToCart);

				//To mouseover on sub menu
				actions.moveToElement(subMenu);

				//build()- used to compile all the actions into a single step 
				actions.click().build().perform();
		
	}
	
	public void continueShopping() {
		driver.findElement(continueShopping).click();
	}
	
	public void clickTshirt() {
		driver.navigate().to("http://automationpractice.com/index.php?id_category=5&controller=category");
	}
	
	public void selectColor() {
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(productContainer);

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(blueColor);

		//To mouseover on sub menu
		actions.moveToElement(subMenu);

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
	}
	
	public void tshirtAddToCart() {
		driver.findElement(tshirtCart).click();
		
	}
	
	public void proceedCheckout() {
		driver.findElement(proceedCheckout).click();
	}
	
}
