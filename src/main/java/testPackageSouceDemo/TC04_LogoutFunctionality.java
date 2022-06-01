package testPackageSouceDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackageSouceDemo.com.HomePagePOMClass;
import pomPackageSouceDemo.com.LoginPagePOMClass;

public class TC04_LogoutFunctionality extends BaseClass 
{
	
	
	 
	
	 @Test(priority=3)
	 public void logoutFunctionality()
	
	 
	 {
	
	 HomePagePOMClass hp =new HomePagePOMClass (driver);
	 hp.cLickMenubutton();
	log.info("Clicked on menu button");
	 
	 hp.clickLogOutButton();
log .info("Clicked on logout button");
	 
  log.info("apply validation for log out functionality");
	 
	 String expectedUrl = "https://www.saucedemo.com/";
	 String actualUrl = driver.getCurrentUrl();
	 
	 if(expectedUrl.equals(actualUrl))
	 {
	 System.out.println("test case is passed");
	 }
	 else
	 {
	 System.out.println("test case if failed");
	 }
	
	 }
}
