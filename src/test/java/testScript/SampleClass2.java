package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SampleClass2 {
WebDriver driver = null;
	
	@BeforeMethod
	public void setUp () {
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
  @Test
  public void pythonSearch() {
	  driver.get("https://www.google.com");
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(driver.getTitle(), "Google Search2");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("python tutorial");
		searchBox.submit();
		softAssert.assertEquals(driver.getTitle(), "python tutorial - Google Search");
		softAssert.assertAll();
  }
}
