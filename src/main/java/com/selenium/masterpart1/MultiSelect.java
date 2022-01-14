package com.selenium.masterpart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelect {

	WebDriver driver= null;
	String url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
@Test(priority=0)
public void launch() {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver3.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@Test(priority=1)
public void multiselect() {
	driver.switchTo().frame("iframeResult");
	WebElement mul=driver.findElement(By.id("cars"));
	Select sele1=new Select(mul);
	System.out.println(sele1.isMultiple());
	sele1.selectByIndex(1);
	sele1.selectByIndex(2);
	System.out.println(sele1.getFirstSelectedOption().getText());
	List<WebElement> ele3=sele1.getAllSelectedOptions();
	System.out.println("selected options");
	for(WebElement loop3 : ele3) {
		
		System.out.println(loop3.getText());
	}
	List<WebElement> all=sele1.getOptions();
	for(WebElement loop1 : all) {
		System.out.println("*****************All Elements*************"+loop1.getText());
	}
}
}
