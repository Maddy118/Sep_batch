package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_selk {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(4000);
	   driver.manage().window().maximize();
//         WebElement findElement = driver.findElement(By.id("email"));
//         findElement.sendKeys("7654345678");
//         Thread.sleep(3000);
//         WebElement findElement2 = driver.findElement(By.name("pass"));
//          findElement2.sendKeys("000987r89");
//          Thread.sleep(3000);
////          WebElement findElement3 = driver.findElement(By.name("firstname"));
////          findElement3.sendKeys("zara");
          Thread.sleep(2000);
////          driver.findElement(By.name("login")).click();
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		findElement.click();
          
         
//	   driver.close();
	   
	}

}