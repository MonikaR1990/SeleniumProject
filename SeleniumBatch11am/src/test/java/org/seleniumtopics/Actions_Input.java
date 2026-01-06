package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Input {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT)
		.sendKeys(email, "selenium")
		.keyUp(Keys.SHIFT)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.perform();
		
		Thread.sleep(2000);
		

	}

}
