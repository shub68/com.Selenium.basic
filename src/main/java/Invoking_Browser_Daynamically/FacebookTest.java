package Invoking_Browser_Daynamically;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FacebookTest {
    
WebDriver driver = null;


@Parameters("Browser")
@BeforeTest
public void OpenBrowser(String Browser) {
	if(Browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
	driver =new ChromeDriver();
	}
	
	if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	
}

@Test
public void FacebookLaunch() {
	
	String URL="https://www.facebook.com";
	driver.manage().window().maximize();
	driver.get(URL);
	String PageTitle=driver.getTitle();
	System.out.println("Page title is : "+PageTitle);
	SoftAssert sa1=new SoftAssert();
	sa1.assertEquals(PageTitle, "Facebook – log in or sign u");
}
}
