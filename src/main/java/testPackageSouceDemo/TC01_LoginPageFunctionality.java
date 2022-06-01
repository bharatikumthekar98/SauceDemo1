package testPackageSouceDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pomPackageSouceDemo.com.LoginPagePOMClass;


@Listeners(utilityPackage.Listeners.class)
public class TC01_LoginPageFunctionality extends BaseClass
{
	//hard assertion
	
		@Test(priority=1)
		 public void loginFunctionality() 
		 
		 {
		
		 String ActualURL=driver.getTitle();
		 System.out.println(ActualURL);
		 String ExpectedURL = "Swag La";
		 //normal assertion it only through assertion error
		// Assert.assertEquals(ActualURL,ExpectedURL);
		 log.info("Validation applied");
		 
		 
	//if assertion fails then only this msg will print
		log.info("website start to login");
		 Assert.assertEquals(ActualURL,ExpectedURL,"actual should be th swag Labs");
		log.info("go on homepage");
		 
		 //for boolean input 
		// Assert.assertEquals(12, 32);
		 
//		 HomePagePOMClass hp = new HomePagePOMClass(driver);
//		  hp.cLickMenubutton();
//		  hp.cLicklogout();
//		  
//		  System.out.println("logout");

	}
		
//		@Test
//		public void logOutTest()
//	    {
//			Assert.assertTrue(true);
//		}

	}



