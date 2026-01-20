package org.seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Key {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	    Actions act = new Actions(driver);
	    
	    act.sendKeys(Keys.PAGE_DOWN).perform();
	    
	    act.sendKeys(Keys.PAGE_DOWN).perform();
	    
	    act.sendKeys(Keys.PAGE_DOWN).perform();
	     

	}

}
