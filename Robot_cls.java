package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_cls {

	public static void main(String[] args) throws Exception  {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     WebElement cust = driver.findElement(By.xpath("//a[text()='Customer Service']"));
     Actions act = new Actions(driver);
     act.contextClick(cust).perform();
     Thread.sleep(3000);
     Robot rb = new Robot();
     rb.keyPress(KeyEvent.VK_DOWN);
     rb.keyPress(KeyEvent.VK_DOWN);
     rb.keyPress(KeyEvent.VK_DOWN);
     
     rb.keyRelease(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
