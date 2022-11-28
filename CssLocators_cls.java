package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators_cls {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.cssSelector("input#email")).sendKeys("-09876");
	}

}
