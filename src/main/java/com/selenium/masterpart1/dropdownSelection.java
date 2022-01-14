package com.selenium.masterpart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class dropdownSelection {
	
	WebDriver driver= null;
	String url="https://www.facebook.com";
@Test(priority=0)
public void launch() {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,30);
	
}
@Test(priority=1)
public void dropdown() {
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	WebElement ele1=driver.findElement(By.name("birthday_month"));
	Select sele=new Select(ele1);
	sele.selectByValue("5");
	//getting all options
	
	List<WebElement> ele11 =sele.getOptions();
	for(WebElement lup : ele11) {
		System.out.println(lup.getText());
	}
	

}
}
