package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //object create 
		
		driver.get("https://www.saucedemo.com/");
		
		
	/*	//ID
		driver.findElement(By.id("user-name")).sendKeys("monika"); //Locators
		
		driver.findElement(By.xpath("//inpt[@id='user-name']")).sendKeys("monika"); //Xpath
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("monika"); //Css Selector - Fast
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("monika");  */
		
		//Class Name
		//driver.findElement(By.className("input_error form_input")).sendKeys("Monika"); //locator
		
		//driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("Monika");
		
		driver.findElement(By.cssSelector(".input_error")).sendKeys("Monika"); //className
		
		driver.findElement(By.cssSelector("input.input_error")).sendKeys("Monika"); //tag + classname
		
		//Other Attributes
		
		driver.findElement(By.name("user-name")).sendKeys("Monika"); //Locator
		
		driver.findElement(By.xpath("//input[@name='user-name']")).click(); //Xpath
		 
		driver.findElement(By.cssSelector("input[name='user-name']")).click(); //CssSelector
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Monika");
		
		
		//Multiple Attribute
		
		driver.findElement(By.xpath("//input[@placeholder='Username' and @name='user-name']")).sendKeys("Monika");
		
		driver.findElement(By.cssSelector("input[placeholder='Username'][name='user-name']")).sendKeys("Monika");
		
		//Parent - Child Concept
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//div[@class='form-group'][1]//child::input[@placeholder='First Name']")).sendKeys("Monika");
		
		driver.findElement(By.cssSelector(".form-group input[placeholder='First Name']")).sendKeys("Monika");
		
		//Contains
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'First')]")).sendKeys("Monika");
		
		driver.findElement(By.cssSelector("input[placeholder*='First']")).sendKeys("Monika");
		
		//Starts-with
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'First')]")).sendKeys("Monika");
		
		driver.findElement(By.cssSelector("input[placeholder^='First']")).sendKeys("Monika");
		
		
		
		
		
		

	}

}
