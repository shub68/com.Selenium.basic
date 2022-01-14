package com.selenium.masterpart1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabSwitching {
	private static final By By = null;
	WebDriver driver= null;
	String url="https://www.jobserve.com";
@Test(priority=0)
public void launch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(4000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@Test(priority=1)
public void switchTab() {
	driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/header/div[1]/a/img")).click();
	Set<String> win1=driver.getWindowHandles();
	Iterator<String> it1=win1.iterator() ;
	String mainpage=it1.next();
	String jobid=it1.next();
	driver.switchTo().window(jobid);
	WebElement text1=driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a"));
	text1.getText();
	System.out.println("Text is :"+text1);
}
}
