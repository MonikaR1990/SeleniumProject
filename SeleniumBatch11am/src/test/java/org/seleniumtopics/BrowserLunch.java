package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLunch 
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();  //chrome driver setup
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Locators
		
		//1. id
		//2. name
		//3. classname
		//4. linkText
		//5. PartialLinkText
		//6. Xpath
		//7. cssSelector
		//8. tagName
		
		
		driver.findElement(By.id("email")).sendKeys("moni@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("moni@123");
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		//driver.findElement(By.linkText("Shopping cart")).click();
		
		driver.findElement(By.partialLinkText("Shopping")).click();
		
		
		//xpath
		
		
		
		//driver.quit();
		
		
		

	}

}
