package pomPackageSouceDemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass {
	 public WebDriver driver;
		
	 @FindBy(xpath="//input[@id='user-name']")
	 private WebElement username;
	 public void SendUsername()
	 {
	 username.sendKeys("standard_user");
	 }
	
	
	 @FindBy(xpath="//input[@id='password']")
	 private WebElement password;
	 public void Sendpassword()
	 {
	 password.sendKeys("secret_sauce");
	 }
	
	 @FindBy(xpath="//input[@id='login-button']")
	 private WebElement loginbutton;
	 public void clickloginbutton()
	 {
	 loginbutton.click();
	 }
	
	 public LoginPagePOMClass(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	
	 

	

}
