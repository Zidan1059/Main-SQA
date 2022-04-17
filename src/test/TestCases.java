package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Authentication;
import pages.CheckOut;
import pages.HomePageSignInButton;
import pages.MyAccount;
import pages.SignOutButton;
import pages.addToCart;
import pages.PersonalInformation;



public class TestCases {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {

		AllTestCases();
	}
	
	public static void AllTestCases() {
		
	//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	//Going into the website
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	//Declaring All Objects
		HomePageSignInButton clickSignInObj = new HomePageSignInButton(driver);
		Authentication authenticationObj = new Authentication(driver);
		PersonalInformation personalInfoObj = new PersonalInformation(driver);
		SignOutButton clickSignOutObj = new SignOutButton(driver);
		MyAccount myAccountObj = new MyAccount(driver);
		addToCart addToCartObj = new addToCart(driver);
		CheckOut CheckObj = new CheckOut(driver);
		
		
	//HomePage
		//HomePage SignIn Button Click
		
		clickSignInObj.clickSignInButton();
		
		
	//Register By Email Page for 1st Account
		//Inserting Email
		authenticationObj.insertEmail("sqa123@abc.com");
		
		//Clicking Create Account Button
		authenticationObj.clickCreateAccountButton();
		
	//Loading the Next Page
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		


	//Personal Information Page for 1st Account
		
		//Gender
		//Clicking Mr. Radio Button
		personalInfoObj.clickMaleGender();
		
		//First Name
		personalInfoObj.insertFirstName("Zaik");
		
		//Last Name
		personalInfoObj.insertLastName("Mostafa");
		
		//Password
		personalInfoObj.insertPassword("12345");
		
		//Date of Birth
		//Day
		personalInfoObj.insertDay("18");

		//Month
		personalInfoObj.insertMonth("3");
		
		//Year
		personalInfoObj.insertYear("1995");
		
		//Company
		personalInfoObj.insertCompany("SCT Ltd.");
		
		//Address
		personalInfoObj.insertAddress("20-A, Bangla Bazar Road");
		
		//City
		personalInfoObj.insertCity("North Dhaka");
		
		//State
		personalInfoObj.insertState("Alaska");
		
		//Postal Code
		personalInfoObj.insertPostalCode("43256");
		
		//Country
		personalInfoObj.insertCountry("United States");
		
		//Mobile No.
		personalInfoObj.insertMobile("01346735");
		
		//Clicking Register Button
		personalInfoObj.clickRegister();
		
	//Sign Out
		//Clicking Sign Out Button
		clickSignOutObj.clickSignOutButton();
		
		
		
	//Register By Email Page for 2nd Account
		
		//Inserting Email
		authenticationObj.insertEmail("sqa456@abc.com");
		
		//Clicking Create Account Button
		authenticationObj.clickCreateAccountButton();
		
	//Loading the Next Page
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		


	//Personal Information Page for 2nd Account
		
		//Gender
		//Clicking Mrs. Radio Button
		personalInfoObj.clickFemaleGender();
		
		//First Name
		personalInfoObj.insertFirstName("Afroza");
		
		//Last Name
		personalInfoObj.insertLastName("Khanom");
		
		//Password
		personalInfoObj.insertPassword("54321");
		
		//Date of Birth
		//Day
		personalInfoObj.insertDay("17");

		//Month
		personalInfoObj.insertMonth("4");
		
		//Year
		personalInfoObj.insertYear("1990");
		
		//Company
		personalInfoObj.insertCompany("ABC Ltd.");
		
		//Address
		personalInfoObj.insertAddress("34-C, North Bangla Street");
		
		//City
		personalInfoObj.insertCity("Kolkata");
		
		//State
		personalInfoObj.insertState("Alaska");
		
		//Postal Code
		personalInfoObj.insertPostalCode("78192");
		
		//Country
		personalInfoObj.insertCountry("United States");
		
		//Mobile No.
		personalInfoObj.insertMobile("0178372433");
		
		//Clicking Register Button
		personalInfoObj.clickRegister();
		
	//Sign Out
		
		//Clicking Sign Out Button
		clickSignOutObj.clickSignOutButton();
		
		
	//1st User Sign In
		authenticationObj.insertSignInEmail("sqa123@abc.com");
		authenticationObj.insertSignInPassword("12345");
		authenticationObj.clickLogin();
		
	//Selecting Casual Dress
		
		myAccountObj.selectCasualDress();
		
	
	//Selecting Add to Cart of Casual Dress
		
		addToCartObj.selectAddToCart();
		
		//Loading
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		addToCartObj.continueShopping();
		addToCartObj.clickTshirt();
	
		
	//Selecting T Shirt
		addToCartObj.selectColor();
		addToCartObj.tshirtAddToCart();
		
		//Loading
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		addToCartObj.proceedCheckout();
	
	//Final Check Out Page
		
		CheckObj.summaryCheckout();
		
		CheckObj.addressCheckout();
		
		CheckObj.shippingCheckBox();
		
		CheckObj.shippingCheckout();
		
		CheckObj.payCheckButton();
		
		CheckObj.confirmOrder();
		
	//Sign Out
		
		//Clicking Sign Out Button
		clickSignOutObj.clickSignOutButton();
		
		
	//2nd User Sign In
		authenticationObj.insertSignInEmail("sqa456@abc.com");
		authenticationObj.insertSignInPassword("54321");
		authenticationObj.clickLogin();
		
	//Selecting Casual Dress
		
		myAccountObj.selectCasualDress();
		
	
	//Selecting Add to Cart of Casual Dress
		
		addToCartObj.selectAddToCart();
		
		//Loading
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		addToCartObj.continueShopping();
		addToCartObj.clickTshirt();
	
		
	//Selecting T Shirt
		addToCartObj.selectColor();
		addToCartObj.tshirtAddToCart();
		
		//Loading
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		addToCartObj.proceedCheckout();
	
	//Final Check Out Page
		
		CheckObj.summaryCheckout();
		
		CheckObj.addressCheckout();
		
		CheckObj.shippingCheckBox();
		
		CheckObj.shippingCheckout();
		
		CheckObj.payCheckButton();
		
		CheckObj.confirmOrder();
		
	//Sign Out
		
		//Clicking Sign Out Button
		clickSignOutObj.clickSignOutButton();
		
	}

}
