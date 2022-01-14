package selenium.MasterPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class DragAndDropInSelenium {
	WebDriver driver=null;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//@Test
	public void Drag() {
		driver.get("https://www.jqueryui.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[1]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //switching to the frame
		
		String texr=driver.findElement(By.xpath("/html/body/div/p")).getText();//verifying weather switched to the particular fame or not.
		System.out.println("Text=="+texr);
		
		WebElement dragAble=driver.findElement(By.id("draggable"));//Taking Location of web element to be dragged
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(dragAble, 100, 120).build().perform(); //giving the position to drag
	}

	//@Test
	public void dropAndDrag() {
		driver.get("https://www.jqueryui.com");
		
		//Xpath tp click on dropable link
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement trgt=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, trgt).build().perform();
		
	}
	@Test
	public void customdragAndDrop() {
		driver.get("https://www.jqueryui.com");
		
		//Xpath tp click on dropable link
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement trgt=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(src).moveToElement(trgt).release(trgt).build().perform();
		//*[@id="div_nseindices"]/div/div/div/ul[1]/li[1]
		
	}
	
}















