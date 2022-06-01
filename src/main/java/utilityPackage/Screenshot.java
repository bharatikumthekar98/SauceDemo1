package utilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testPackageSouceDemo.BaseClass;

public class Screenshot{
	WebDriver driver;
	static String title;
	
	public static void takescreenshot1(WebDriver driver) throws IOException
	{
		title=driver.getTitle();
		
//		Date d = new Date();
//		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
//		String date = d1.format(d);

		TakesScreenshot sh=(TakesScreenshot)driver;
		File source=sh.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshot/"+title+".jpg");
		FileHandler.copy(source,dest);
		System.out.println("Screenshot is taken");
	
		
	}


}
