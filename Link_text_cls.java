package com.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Link_text_cls {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
      
    ChromeOptions ch = new ChromeOptions();
    ch.addArguments("incognito");
    
    WebDriver driver = new ChromeDriver(ch);
    
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
//    WebElement findElement = driver.findElement(By.linkText("Amazon App Download"));
//    findElement.click();
    
    WebElement findElement2 = driver.findElement(By.partialLinkText("Assistant Download"));
    findElement2.click();
    
    
    
	}

}
