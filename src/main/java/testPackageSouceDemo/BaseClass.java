package testPackageSouceDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pomPackageSouceDemo.com.LoginPagePOMClass;
import utilityPackage.Screenshot;

public class BaseClass {
	 WebDriver driver ;
	 Logger log;
	  

	 @BeforeMethod
	 public void setUp()
	 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\"
	 		+ "chromedriver_win32 (1)\\chromedriver.exe");
	
	 driver= new ChromeDriver();
	 //Opening web application
	 
	 log=Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser open");
		driver.get("https://www.saucedemo.com/");
	 log.info("URL is opened");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 
	 LoginPagePOMClass lp= new LoginPagePOMClass( driver);
	 lp.SendUsername();
	 System.out.println("User name is entered");
	 lp.Sendpassword();
	 System.out.println("Password is entered");
	 lp.clickloginbutton();
	 System.out.println("login button is click");
	 
     log.info("CLick on login button");
	 
	 }
	
	 @AfterMethod
	 public void TearDown() throws IOException
	 {
		Screenshot.takescreenshot1(driver);
	 driver.quit();
	log.info("logout successful");
	 }

}
