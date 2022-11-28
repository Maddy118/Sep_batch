package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	 WebElement id = driver.findElement(By.xpath("//input[@id='username']"));
		id.sendKeys("Mridiot27");
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Zara18@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
	 WebElement locate = driver.findElement(By.xpath("//select[@name='location']"));
		locate.click();
		Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
      WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));  
		hotel.click();
		Select s = new Select(hotel);
		s.selectByValue("Hotel Cornice");
      WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
       room.click();
       Select s2 = new Select(room);
       s2.selectByVisibleText("Deluxe");
	  WebElement rooms= driver.findElement(By.xpath("//select[@name='room_nos']"));
	    rooms.click();
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	   WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
	   adult.click();
	    Select s3 = new Select(adult);
	    s3.selectByIndex(1);
	  WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	   child.click();
	   Select s4 = new Select(child);
	   s4.selectByIndex(0);
       Thread.sleep(6000);
      WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
      search.click();
	  WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	  button.click();
	  Thread.sleep(3000);
	  WebElement con = driver.findElement(By.xpath("//input[@name='continue']"));
	  con.click();
	  WebElement first = driver.findElement(By.xpath("//input[@id='first_name']"));
	  first.sendKeys("MADHAN");
	  WebElement last = driver.findElement(By.xpath("//input[@id='last_name']"));
	  last.sendKeys("RAJ");
	  WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
	  address.sendKeys("No 6, south usman road, T.nagar. Chennai.");
	  Thread.sleep(3000);
	  WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
	  card.sendKeys("78677690345621");
	  WebElement cardd = driver.findElement(By.xpath("//select[@name='cc_type']"));
	  Select s5 = new Select(cardd);
	  s5.selectByVisibleText("VISA");
	  WebElement date = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	  Select s6 = new Select(date);
	  s6.selectByValue("4");
	  WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	  Select s8 = new Select(year);
	  s8.selectByValue("2022");
	  WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	  cvv.sendKeys("435");
	   WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
	   book.click();
	  
	  
	   TakesScreenshot ts =(TakesScreenshot)driver;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File location = new File("C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\Screenshot\\mini-project.png");
	   FileHandler.copy(source, location);	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
