package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_cls {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
         create.click();
         Thread.sleep(2000);
         WebElement date = driver.findElement( By.xpath("//select[@title='Day']"));
         Select s = new Select(date);
         s.selectByIndex(6);
         Thread.sleep(2000);
         WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
         Select sl = new Select( month);
         sl.selectByValue("7");
         WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
         Select ss = new Select(year);
         ss.selectByVisibleText("2000");
         driver.findElement(By.xpath("//label[text()='Male']")).click();
         
       
	}

}
