package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Screenshot_cls {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		    //IMPLICIT WAIT
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("7094035771");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("zaraaa18");
		 
		 
		    //EXPLICIT WAIT
		 WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[1]")); 
//         WebDriverWait wait = new WebDriverWait(driver,30);	
//         wait.until(ExpectedConditions.invisibilityOf(login));
         login.click();
         
           //SCREENSHOT
         TakesScreenshot tss = (TakesScreenshot)driver;
         File Source = tss.getScreenshotAs(OutputType.FILE);
         File dest = new File("C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\Screenshot\\instagram.png");
         org.openqa.selenium.io.FileHandler.copy(Source, dest);
         
      		 
		 
	}
}
 