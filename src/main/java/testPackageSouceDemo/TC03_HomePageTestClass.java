package testPackageSouceDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackageSouceDemo.com.HomePagePOMClass;
import pomPackageSouceDemo.com.LoginPagePOMClass;

public class TC03_HomePageTestClass extends BaseClass{
	
	
	 
	 
	 //(innovation=if i want to run particular test case multipletime)
	 
	@Test(enabled=false)
	 public void homepagefuctionality()
	 {
	 HomePagePOMClass hp=new HomePagePOMClass(driver);
	 hp.cLickMenubutton();
	log.info("click on menu button");
	 hp.cLickAboutus();
	 log.info("click on About button");
	
	log.info("apply validation for about button");
	 String expectedUrl="https://saucelabs.com/";
	 String actualUrl = driver.getCurrentUrl();
	 Assert.assertEquals(actualUrl,expectedUrl);
	 driver.navigate().back();
	 }
	
}
