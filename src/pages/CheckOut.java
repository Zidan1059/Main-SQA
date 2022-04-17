package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {

	WebDriver driver = null;
	
	By summaryCheckout = By.className("standard-checkout");
	By addressCheckout = By.name("processAddress");
	By shippingCheckBox = By.id("uniform-cgv");
	By shippingCheckout = By.name("processCarrier");
	By payCheckButton = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]");
	By confirmOrder = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]");
	
	
	public CheckOut(WebDriver driver) {
		this.driver = driver;
	}
	
	public void summaryCheckout(){
		WebElement checkout2 = driver.findElement(summaryCheckout);
		checkout2.click();
	}
	public void addressCheckout(){
		WebElement checkout3 = driver.findElement(addressCheckout);
		checkout3.click();
	}
	public void shippingCheckBox(){
		WebElement checkout4 = driver.findElement(shippingCheckBox);
		checkout4.click();
	}
	public void shippingCheckout(){
		WebElement checkout5 = driver.findElement(shippingCheckout);
		checkout5.click();
	}
	public void payCheckButton(){
		WebElement checkout6 = driver.findElement(payCheckButton);
		checkout6.click();
	}
	public void confirmOrder(){
		WebElement checkout7 = driver.findElement(confirmOrder);
		checkout7.click();
	}
	
	
	
}
