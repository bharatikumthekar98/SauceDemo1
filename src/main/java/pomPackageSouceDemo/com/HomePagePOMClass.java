package pomPackageSouceDemo.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePagePOMClass {
	 public WebDriver driver;
	
	 @FindBy(xpath="//button[@id='react-burger-menu-btn']")
	 private WebElement Menubutton;
	 public void cLickMenubutton()
	 {
	 Menubutton.click();
	 }
	
	
	 @FindBy(xpath="//a[@id='about_sidebar_link']")
	 private WebElement Aboutus;
	 public void cLickAboutus()
	 {
	 Aboutus.click();
	 }
	
	
	 @FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")
	 private WebElement singleproduct;
	 public void cLicksingleproduct()
	 {
	 singleproduct.click();
	 }
	
	
	 @FindBy(xpath="//span[contains(@class,'shopping_cart_badge')]")
	 private WebElement Addtocart;
	 public String TextAddtocart()
	 {
	 return Addtocart.getText();
	 }
	
	 @FindBy(xpath="//button[text()='Add to cart']")
	 private List<WebElement> multipleAddToCart ;
	
	 public String addAllProduct()
	 {
	 for(WebElement x:multipleAddToCart)
	 {
	 x.click();
	 }
	 return null;
	 }
	
	
	 @FindBy(xpath="//a[contains(@id,'logout_sidebar_link')]")
	 private WebElement Logout;
	 public void cLicklogout()
	 {
	 Logout.click();
	 }
	  @FindBy(xpath="//a[@id='logout_sidebar_link']")
	  private WebElement logOutButton;
	 
	
	  public void clickLogOutButton()
	  {
	  logOutButton.click();
	  }
	
	
	 public HomePagePOMClass(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
}
}