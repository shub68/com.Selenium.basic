package com.selenium.masterpart1;
import org.openqa.selenium.*;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;
public class ExtractTextInSelenium {
	WebDriver driver=null;
	String url="https://www.facebook.com";
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String Text =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText();
		System.out.println("Text is "+Text);
		String lgnbutton=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).getAttribute("placeholder");
		System.out.println("Text 2 - "+lgnbutton);
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("links are : "+links.getSize());
		//driver.close();
	}

}
