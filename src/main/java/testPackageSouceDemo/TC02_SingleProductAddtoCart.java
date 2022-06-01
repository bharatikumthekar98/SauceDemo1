package testPackageSouceDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackageSouceDemo.com.HomePagePOMClass;
import pomPackageSouceDemo.com.LoginPagePOMClass;

public class TC02_SingleProductAddtoCart extends BaseClass {
	
	
	
	 @Test(priority=2)
	 public void singleproduct()
	 {
	 HomePagePOMClass hp =new HomePagePOMClass(driver);
	 hp.cLicksingleproduct();
	
	 System.out.println("apply validation for single product add to cart");
	 String actualresult = hp.TextAddtocart();
	
	 String Expectedresult ="1";
	 
	//soft assertion
	 
	 SoftAssert soft = new SoftAssert();
	 //boolean assertion
		//soft.assertEquals(1,2);
	 soft.assertEquals(actualresult, Expectedresult);
	 
	soft.assertAll();
	

	
	 hp.cLickMenubutton();
	 hp.cLicklogout();
	 
}
}
