package com.selenium.masterpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class VerifyText {
	
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
	public void verifytext() {
		WebElement ele1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/h2"));
		System.out.println("1 Assertion");
		Assert.assertTrue(ele1.isDisplayed());
		System.out.println("1 Assertion End");
		//String Text=ele1.getText();
		System.out.println("Text present : "+ele1.getText());
		
	}
	@Test
	public void createNewAccount() {
		WebElement button1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		button1.click();
		WebElement btn2=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
		System.out.println("1.Selected status is: "+btn2.isSelected());
		btn2.click();
		System.out.println("2.Selected status is: "+btn2.isSelected());
		
		WebElement btn3=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
		btn3.click();
		/*System.out.println("Selected status is : "+btn3.isSelected());
		System.out.println("Enabled status is : "+btn3.isEnabled());*/	
	}
}
