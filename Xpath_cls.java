package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_cls {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		          //XPATH,TEXT
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("mridiot08@gmail.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("09876543");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//button[@id='login-button']"));
		login.click();
		
		        //INDEX
//		
//		driver.get("https://www.flipkart.com/");
//		WebElement usrname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		usrname.sendKeys("7358802002");
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("ZARA786");
//		Thread.sleep(3000);
//		WebElement log = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		log.click();
		
               //CONTAINS
//		driver.get("https://www.hotstar.com/in");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement kid = driver.findElement(By.xpath("//div[contains(@class,'kids')]"));
//		kid.click();
      
		//contains,text
//		driver.get("https://twitter.com/i/flow/login");
//		driver.manage().window().maximize();
//		WebElement log = driver.findElement(By.xpath("//span[contains(text(),'password')]"));
//		log.click();
//		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
