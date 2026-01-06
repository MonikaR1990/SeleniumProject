package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Mouse_Hover {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(accountList).perform(); //mover hover
		
		Thread.sleep(2000);
		
		
		
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("//a[@title='Login']"));
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(login).perform(); //mousehover
		
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		
		
		
		

	}

}
