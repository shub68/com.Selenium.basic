package selenium.MasterPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HandelAlerts {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void HandelAlert() {
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("Shubham@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		Alert al=driver.switchTo().alert();
		String text=al.getText();
		System.out.println("Text is="+text);
		al.accept();
		
	}

}
