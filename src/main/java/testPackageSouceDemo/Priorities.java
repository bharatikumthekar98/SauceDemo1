package testPackageSouceDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackageSouceDemo.com.HomePagePOMClass;

public class Priorities extends BaseClass {
	
	
		//hard assertion
		
			@Test(priority=1)
			 public void loginFunctionality() 
			 
			 {
			 System.out.println("apply validation for login"); 
			 String ActualURL=driver.getTitle();
			 System.out.println(ActualURL);
			 String ExpectedURL = "Swag La";
			 //normal assertion it only through assertion error
			// Assert.assertEquals(ActualURL,ExpectedURL);
			 
			 
		//if assertion fails then only this msg will print
			 System.out.println("website start lo login");
			 Assert.assertEquals(ActualURL,ExpectedURL,"actual should be th swag Labs");
			 System.out.println("go on homepage");
			 }
			
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
			 }
			 @Test(priority=0)
			 public void homepagefuctionality()
			 {
			 HomePagePOMClass hp=new HomePagePOMClass(driver);
			 hp.cLickMenubutton();
			 System.out.println("click on menu button"); 
			 
			 hp.cLickAboutus();
			 System.out.println("click on About button"); 
			
			 System.out.println("apply validation for about button");
			 String expectedUrl="https://saucelabs.com/";
			 String actualUrl = driver.getCurrentUrl();
			 Assert.assertEquals(actualUrl,expectedUrl);
			 driver.navigate().back();
			 }
			
			
			 
}
