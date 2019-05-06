package smocktest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestAElements {
	WebDriver driver;
	
	@Test
	public void loginTestNG() {
		System.out.println("Starting Test");
		boolean createAccountPresent = false;
		
		List <WebElement> aElements = driver.findElements(By.tagName("a"));
		int numbOfElements = aElements.size();
		System.out.println("Number of WebElements " + numbOfElements);
		for (WebElement aElement : aElements) {
			System.out.println(aElement.getText());
			if(aElement.getText().equals("CREATE ACCOUNT")) {
				createAccountPresent = true;
			}
		}
		Assert.assertTrue(createAccountPresent);
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
