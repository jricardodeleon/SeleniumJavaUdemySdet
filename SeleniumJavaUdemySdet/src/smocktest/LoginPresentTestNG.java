package smocktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPresentTestNG {
	
	WebDriver driver;
	
	@Test
	public void loginTestNG() {
		System.out.println("Starting Test");
		
		
		boolean emailLogin = driver.findElement(By.name("ctl00$MainContent$txtUserName")).isDisplayed();
		boolean passwordLogin = driver.findElement(By.name("ctl00$MainContent$txtPassword")).isDisplayed();
		
		Assert.assertTrue(emailLogin);
		Assert.assertTrue(passwordLogin);
	}
	
	@BeforeClass
	public void setUp() {
		System.out.println("Settting up");
		String browserType = "chrome";
		String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";	
		driver = utilities.DriverFactory.open(browserType);
		driver.get(url);
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("closing the driver");
		driver.close();
	}
}
