package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Cls {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("7094035771");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7094035771");
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		login.click();
		
	    // SCREENSHOT
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File ss = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\Screenshot//fb.png");
		FileHandler.copy(ss, dest);
		
		
	}

}
