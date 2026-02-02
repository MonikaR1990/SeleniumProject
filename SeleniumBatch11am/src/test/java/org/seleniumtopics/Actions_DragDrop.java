package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_DragDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement dragBox = driver.findElement(By.id("draggable"));
		WebElement dropBox = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		
		//act.dragAndDrop(dragBox, dropBox).perform();
		
		act.clickAndHold(dragBox).moveToElement(dropBox).release().perform();
		
		
		
	}

}
