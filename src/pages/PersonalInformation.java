package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PersonalInformation {

	WebDriver driver = null;
	
	By maleGender = By.id("id_gender1");
	By femaleGender = By.id("id_gender2");

	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	
	By password = By.id("passwd");
	
	By dobDay = By.id("days");
	By dobMonth = By.id("months");
	By dobYear = By.id("years");
	
	By company = By.id("company");
	
	By address = By.id("address1");
	
	By city = By.id("city");
	
	By state = By.id("id_state");
	
	By postalCode = By.id("postcode");
	
	By country = By.id("id_country");
	
	By mobile = By.id("phone_mobile");
	
	By register = By.id("submitAccount");
	
	
	public PersonalInformation(WebDriver driver) {
		this.driver = driver;
	}

	
	
	public void clickMaleGender() {
		
		driver.findElement(maleGender).click();
	}
	
	public void clickFemaleGender() {
		
		driver.findElement(femaleGender).click();
	}
	
	public void insertFirstName(String text) {
		
		driver.findElement(firstName).sendKeys(text);
	}
	
	public void insertLastName(String text) {
		
		driver.findElement(lastName).sendKeys(text);
	}
	
	public void insertPassword(String text) {
		
		driver.findElement(password).sendKeys(text);
	}
	
	public void insertDay(String value) {
	
		WebElement Days = driver.findElement(dobDay);
		Select selectDay = new Select(Days);
		selectDay.selectByValue(value);
	}
	
	public void insertMonth(String value) {
		WebElement Months = driver.findElement(dobMonth);
		Select selectMonth = new Select(Months);
		selectMonth.selectByValue(value);
	}
	
	public void insertYear(String value) {
		WebElement Years = driver.findElement(dobYear);
		Select selectYear = new Select(Years);
		selectYear.selectByValue(value);
	}
	
	public void insertCompany(String text) {
		
		driver.findElement(company).sendKeys(text);
	}
	
	public void insertAddress(String text) {
		
		driver.findElement(address).sendKeys(text);
	}
	
	public void insertCity(String text) {
		
		driver.findElement(city).sendKeys(text);
	}
	
	public void insertState (String value) {
		WebElement State = driver.findElement(state);
		Select selectState = new Select(State);
		selectState.selectByVisibleText(value);		
	}
	
	public void insertPostalCode(String text) {
		
		driver.findElement(postalCode).sendKeys(text);
	}
	
	public void insertCountry(String value) {
		WebElement Country = driver.findElement(country);
		Select selectCountry = new Select(Country);
		selectCountry.selectByVisibleText(value);
	}
	
	public void insertMobile(String text) {
		
		driver.findElement(mobile).sendKeys(text);
	}
	
	public void clickRegister() {
		
		driver.findElement(register).click();
	}
}
