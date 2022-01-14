package selenium.MasterPart3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HandelWebTablePart2 {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void Manage() {
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[5]/div[5]/div[3]/a")).click();
		
		List row=(List) driver.findElement(By.xpath("//*[@id='dataTable']/tbody/tr"));
		System.out.println("Total rows are :-"+row.size());
	}

}
//********************************Error in the programm at line no 31