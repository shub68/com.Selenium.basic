package com.selenium.masterpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FindTextOnWebPage {
	WebDriver driver=null;
	//String url="https://wwww.facebook.com";
	@BeforeTest
	public void set() {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	}
@Test
public void text() {
	driver.get("https://www.facebook.com");
	String text1=driver.findElement(By.className("_8eso")).getText();
	Assert.assertEquals(text1,"Facebook helps you connect and share with the people in your life.");
	System.out.println("Assertion pass");
}
@Test
public void getPlaceholderText() {
String place=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).getAttribute("placeholder");
System.out.println(place);
driver.get(place);
}
/*@AfterTest
public void close() {
	driver.close();	
}*/
}
