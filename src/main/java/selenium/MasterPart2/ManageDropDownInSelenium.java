package selenium.MasterPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import java.util.List;
public class ManageDropDownInSelenium {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void dropdown() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		WebElement Date=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		Select sele1=new Select(Date);
		sele1.selectByIndex(26);
		List<WebElement> ele1=sele1.getOptions();
		for(WebElement el:ele1) {
			System.out.println(el.getText());
		}
		
		WebElement month=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
		Select sele2=new Select(month);
		sele2.selectByVisibleText("Nov");
		List<WebElement> ele2=sele2.getOptions();
		for(WebElement el2:ele2) {
			System.out.println(el2.getText());
		}
		
		WebElement year=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
		Select sele3=new Select(year);
		sele3.selectByVisibleText("1999");
		List<WebElement> ele3=sele3.getOptions();
				for(WebElement el3:ele3) {
					System.out.println(el3.getText());
				}
	} 
}
