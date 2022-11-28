package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown_Cls {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspac\\Selenium__concept\\src\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demoqa.com/select-menu");
     driver.manage().window().maximize();
     Thread.sleep(3000);
        WebElement cr = driver.findElement(By.xpath("//select[@name='cars']"));
     Select s = new Select(cr);
     s.selectByIndex(2);
     Thread.sleep(3000);
     s.selectByValue("audi");
     Thread.sleep(3000);
     s.selectByVisibleText("Saab");
     
     System.out.println("**first******");
     WebElement firstSelectedOption = s.getFirstSelectedOption();
     System.out.println(firstSelectedOption.getText());
     
     List<WebElement> options = s.getOptions();
     System.out.println(cr.getText());
      
     System.out.println("##all###");
     List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
     for (WebElement allll : allSelectedOptions) {
    	 System.out.println(allll.getText());
		
	}
     
     s.deselectByIndex(2);
     
     
     
	}

}
