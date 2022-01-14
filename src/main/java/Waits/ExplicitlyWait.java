package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;;

public class ExplicitlyWait {
WebDriver driver=null;
@BeforeTest
public void SetUp() {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Desktop/ExplicitWait.html");
}
/*@Test
public void Firstalrt() {
	WebElement ele=driver.findElement(By.id("alert"));
	ele.click();
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
}*/
/*@AfterTest
public void close() {
	driver.close();
}*/
@Test
public void clickable() {
	WebElement ele2=driver.findElement(By.id("display-other-button"));
	ele2.click();
	WebDriverWait wait2=new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("disable"))));
}
}
