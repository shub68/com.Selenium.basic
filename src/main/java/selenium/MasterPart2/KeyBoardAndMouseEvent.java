package selenium.MasterPart2;

import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class KeyBoardAndMouseEvent {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void events() throws InterruptedException {
		driver.get("https://www.urbanladder.com/");
		WebElement DealsOfWeek=driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span"));
		
		Actions action=new Actions(driver);
		action.moveToElement(DealsOfWeek).build().perform();
		//Added code
		WebElement alloptions=driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/div/div/ul/li[3]/ul"));
		Select sele2=new Select(alloptions);
		List<WebElement> li=sele2.getOptions();
		for(WebElement lup:li) {
			System.out.println(lup.getText());
		}
		//Added code over
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/div/div/ul/li[3]/ul/li[1]/a")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div[2]/a[1]")).click();
		
	}

}
