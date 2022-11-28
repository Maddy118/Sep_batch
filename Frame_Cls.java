package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Cls {


	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.automationtesting.in/Frames.html");
     driver.manage().window().maximize();
     WebElement size = driver.findElement(By.tagName("iframe"));
     System.out.println(size);
     driver.switchTo().frame(0);
//     WebElement st = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//     st.sendKeys("hela");
     
     
      driver.switchTo().defaultContent();
      driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
      
      WebElement ss = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
       driver.switchTo().frame(ss);
       driver.switchTo().frame(0);
       WebElement sm = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
      sm.sendKeys("ziya");
     
     
     
       
	}

}
