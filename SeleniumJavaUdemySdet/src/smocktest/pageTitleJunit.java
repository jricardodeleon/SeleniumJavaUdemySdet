package smocktest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class pageTitleJunit {
	WebDriver driver;
	 
	
	@Test
	public void pageTitleTest() {
		System.out.println("Running the test");
		String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(url);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "SDET Training | Account Management";
		
		Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.fail("Intentionally Failed");
				
	}
	
	@Before
	public void setUp() {
		
		String browserType = "chrome";
		
		System.out.println("Setting up the test");
		System.out.println("Initializing the driver");
		driver = utilities.DriverFactory.open(browserType);
	}
	
	@After
	public void tearDown() {
		System.out.println("Closing the test");
		System.out.println("Closing the driver");
		driver.close();
	}
	
}
