package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonExample1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();  //chrome driver setup
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/button");
		driver.manage().window().maximize();
		
		WebElement locationBtn = driver.findElement(By.id("position"));
		
		Point location = locationBtn.getLocation();
		
		System.out.println(location);
		
		WebElement colorBtn = driver.findElement(By.id("color"));
		
		String color = colorBtn.getCssValue("color");
		
		System.out.println(color);
	}
}
