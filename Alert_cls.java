package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_cls {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://demoqa.com/alerts");
      driver.manage().window().maximize();
//       WebElement os = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
//       os.click();
//       Thread.sleep(3000);
//      Alert alert = driver.switchTo().alert();
//      alert.accept();
//      WebElement ss = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//      ss.click();
//      Alert alert2 = driver.switchTo().alert();
//      alert2.accept();
      WebElement pt = driver.findElement(By.xpath("//button[@id='promtButton']"));
      pt.click();
      Alert cs = driver.switchTo().alert();
      cs.sendKeys("zara");
      cs.accept();
      
	}

}
