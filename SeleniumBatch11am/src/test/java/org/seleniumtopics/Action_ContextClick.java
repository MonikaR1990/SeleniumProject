package org.seleniumtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_ContextClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickBtn).perform();
		
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		//act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(3000);
		
		
	}
}
