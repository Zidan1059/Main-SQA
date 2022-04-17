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
		authenticationObj.insertEmail("bup100@xyz.com");
		
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
		personalInfoObj.insertFirstName("Abul");
		
		//Last Name
		personalInfoObj.insertLastName("Kashem");
		
		//Password
		personalInfoObj.insertPassword("12345");
		
		//Date of Birth
		//Day
		personalInfoObj.insertDay("12");

		//Month
		personalInfoObj.insertMonth("2");
		
		//Year
		personalInfoObj.insertYear("1990");
		
		//Company
		personalInfoObj.insertCompany("ABC Ltd.");
		
		//Address
		personalInfoObj.insertAddress("12-B, North Street Road");
		
		//City
		personalInfoObj.insertCity("Las Vegas");
		
		//State
		personalInfoObj.insertState("New York");
		
		//Postal Code
		personalInfoObj.insertPostalCode("31250");
		
		//Country
		personalInfoObj.insertCountry("United States");
		
		//Mobile No.
		personalInfoObj.insertMobile("01223344");
		
		//Clicking Register Button
		personalInfoObj.clickRegister();
		
	//Sign Out
		//Clicking Sign Out Button
		clickSignOutObj.clickSignOutButton();
		
		
		
	//Register By Email Page for 2nd Account
		
		//Inserting Email
		authenticationObj.insertEmail("bup900@xyz.com");
		
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
		personalInfoObj.insertFirstName("Kulsum");
		
		//Last Name
		personalInfoObj.insertLastName("Akter");
		
		//Password
		personalInfoObj.insertPassword("54321");
		
		//Date of Birth
		//Day
		personalInfoObj.insertDay("15");

		//Month
		personalInfoObj.insertMonth("7");
		
		//Year
		personalInfoObj.insertYear("1980");
		
		//Company
		personalInfoObj.insertCompany("XYZ Ltd.");
		
		//Address
		personalInfoObj.insertAddress("15-C, North Street");
		
		//City
		personalInfoObj.insertCity("California");
		
		//State
		personalInfoObj.insertState("Alabama");
		
		//Postal Code
		personalInfoObj.insertPostalCode("61350");
		
		//Country
		personalInfoObj.insertCountry("United States");
		
		//Mobile No.
		personalInfoObj.insertMobile("0122339900");
		
		//Clicking Register Button
		personalInfoObj.clickRegister();
		
	//Sign Out
		
		//Clicking Sign Out Button
		clickSignOutObj.clickSignOutButton();
		
		
	//1st User Sign In
		authenticationObj.insertSignInEmail("bup100@xyz.com");
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
		authenticationObj.insertSignInEmail("bup900@xyz.com");
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
