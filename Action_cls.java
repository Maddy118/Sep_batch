package com.sel;

import java.awt.Desktop.Action;
import java.beans.PropertyChangeListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_cls {  
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions at = new Actions(driver);
		at.click(click).build().perform();
		
		WebElement ryt = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        at.contextClick(ryt).perform();
         
        WebElement db = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        at.doubleClick(db).perform();
           
        Thread.sleep(3000);
        driver.navigate().to("https://jqueryui.com/droppable/"); 
        driver.switchTo().frame(0);
        WebElement sc = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement tr = driver.findElement(By.xpath("//div[@id='droppable']"));
        at.dragAndDrop(sc,tr).perform();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
}
	
}