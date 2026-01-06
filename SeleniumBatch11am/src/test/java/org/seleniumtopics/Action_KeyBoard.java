package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_KeyBoard {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement text1 = driver.findElement(By.id("inputText1"));
		WebElement text2 = driver.findElement(By.id("inputText2"));
		
		text1.sendKeys("Welcome 2026");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		
		text2.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);

	}

}
