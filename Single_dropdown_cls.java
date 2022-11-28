package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dropdown_cls {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demoqa.com/select-menu");
     driver.manage().window().maximize();
     WebElement sm = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
     Select ss = new Select(sm);
     ss.selectByIndex(5);
     Thread.sleep(3000);
     ss.selectByValue("4");
     Thread.sleep(3000);
     ss.selectByVisibleText("Voilet");
     Thread.sleep(3000);
     System.out.println("****getoptions****");
     List<WebElement> options = ss.getOptions();
     System.out.println(sm.getText());
	}

}
