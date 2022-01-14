package com.selenium.webelement;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RediffTest {
	
 WebDriver driver=null;
 String name;
 @Test (priority = 0)
 public void choicebrowser() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter browser name");
      name=sc.next();
 }
 @Test (priority = 1)
 public void redifflaunch() {
	 System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
	 driver=new ChromeDriver();
	 /*if(name.equalsIgnoreCase("chrome")) {
	 System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
	 driver=new ChromeDriver();
	 
 }
	 if(name.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
		 driver=new FirefoxDriver();	 
 }*/
 }
 @Test (priority = 2)
 public void launchurl() {
	 driver.manage().window().maximize();
	 String url="https://www.rediff.com";
	 driver.get(url);
	 String Title=driver.getTitle();
	 System.out.println("Title is: "+Title);
	 String expected="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	 Assert.assertEquals(Title,expected);
	 System.out.println("**Assertion Pass***");
 }
 @Test (priority = 3)
 public void signIn(){
	WebElement signin= driver.findElement(By.linkText("Sign in"));
	signin.click();	 
	String Title=driver.getTitle();
	String Expected="Rediffmail";
    Assert.assertEquals(Title,Expected);
    System.out.println("Second assert pass");
    WebElement username=driver.findElement(By.id("login1"));
    username.sendKeys("anshulc55@reddif.com");
    WebElement pass=driver.findElement(By.id("password"));
    pass.sendKeys("test@1223");
    driver.findElement(By.name("proceed")).click();    
}
}
