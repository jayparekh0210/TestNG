package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GooglePageTest {
	
	WebDriver driver = null;
	
	@BeforeMethod (groups = "Featureone")
	public void setUp () {
		driver = new ChromeDriver();
	}
	@AfterMethod (groups = "Featureone")
	public void tearDown() {
		driver.close();
	}
	
  @Test(groups = "Featureone")
  public void javaSearch() {
	    
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("java tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "java tutorial - Google Search");
		
  }
  
  @Test
  public void appiumSearch() {
	    
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Appium tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "Appium tutorial - Google Search");
		
  }
  
  @Test
  public void seleniumSearch() {
	    
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium tutorial");
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(), "selenium tutorial - Google Search");
		
  }
}
