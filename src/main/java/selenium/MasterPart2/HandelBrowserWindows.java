package selenium.MasterPart2;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HandelBrowserWindows {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void manage() {
		driver.get("https://www.jobserve.com");
		driver.findElement(By.className("bannerimg_0")).click();
		
		Set<String> WinHandelsId=driver.getWindowHandles();
		Iterator<String> itr=WinHandelsId.iterator();
		String MainPageId=itr.next();
		String JobPageId=itr.next();
		
		driver.switchTo().window(JobPageId);
		String Text=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/fieldset/label[1]")).getText();
		Assert.assertEquals(Text,"Keywords");
	}

}
