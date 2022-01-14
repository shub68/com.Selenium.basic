package com.selenium.masterpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelAkerts {
	WebDriver driver=null;
	String url="https://www.rediff.com";
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();
		driver.findElement(By.id("login1")).sendKeys("shubham@gmail.com");
		    driver.findElement(By.name("proceed")).click();
}
}
