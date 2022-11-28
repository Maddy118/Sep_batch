package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro_cls {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com");
	       driver.manage().window().maximize();
	      Thread.sleep(2000);
//	       WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
//	       findElement.sendKeys("9876543201");
//	       Thread.sleep(2000);
//	       WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
//	       findElement2.sendKeys("maddy..023");
//	       Thread.sleep(2000);
//	       WebElement findElement3 = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
//	       findElement3.click();
            WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
            findElement.click();
            Thread.sleep(2000);
            WebElement findElement2 = driver.findElement(By.name("firstname"));
            findElement2.sendKeys("mrdot");
            WebElement findElement3 = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
            findElement3.sendKeys("007");
            Thread.sleep(2000);
            WebElement findElement4 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
            findElement4.sendKeys("zara123@gmail.com");
            WebElement findElement5 = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
            findElement5.click(); 
            
	       
	       
	}

}
