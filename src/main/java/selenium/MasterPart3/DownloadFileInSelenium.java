package selenium.MasterPart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DownloadFileInSelenium {WebDriver driver=null;
@BeforeTest
public void launch() {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@Test
public void download() {
	driver.get("https://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[18]/a")).click();
	
	WebElement ele1=driver.findElement(By.id("file-upload"));
	String filepath="C:\\Users\\User\\Downloads\\sign.jpg";
	ele1.sendKeys(filepath);
	
	driver.findElement(By.id("file-submit")).click();
	
}

}
