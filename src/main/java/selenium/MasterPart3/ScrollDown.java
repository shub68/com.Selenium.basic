package selenium.MasterPart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ScrollDown {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void execute() {
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)"); This is type 1 to scroll down
		WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div/p[15]"));
		System.out.println("Text is="+ele.getText());
		jse.executeScript("arguments[0].scrollIntoView()",ele); //this is type 2 to scroll down until the desired element is found
	}
}
