package selenium.MasterPart2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandelWindow {

	WebDriver driver;
	@Test(priority=0)
	public void invoke() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void test() {
		driver.get("https://www.jobserve.com");
		String handel=driver.getWindowHandle();
		System.out.println("Handel of first window is"+handel);
	    driver.findElement(By.xpath("//img[@class='bannerimg_0']")).click();
	    Set<String> handels=driver.getWindowHandles();
	    Iterator<String> it1=handels.iterator();
	    String name=it1.next();
	    String name2=it1.next();
	    System.out.println("Name after itr "+name);
	    System.out.println("Name of second is = "+name2);
	    String text=driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/header/nav/ul[2]/li/a")).getText();
	  System.out.println("Text is "+text);
	}

}
