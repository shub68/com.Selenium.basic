package RevisionSelenium.com.Selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FacebookLogin {
	
	@Test
	public void FacebookLaunch() {
		
		String URL="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		String PageTitle=driver.getTitle();
		System.out.println("Page title is : "+PageTitle);
		SoftAssert sa1=new SoftAssert();
		sa1.assertEquals(PageTitle, "Facebook – log in or sign u");
		driver.close();
		
	}

}
