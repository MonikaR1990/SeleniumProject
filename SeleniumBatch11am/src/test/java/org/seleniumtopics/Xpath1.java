package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //object create 
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/form/div/input[1]"));
		
	/*	/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input */
		
		//*[@id="email"]
		
		//*[@id="CardInstancejghzKyI2OogOIOqw8gsDGA"]/div/div/span/span/a
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//div[contains(text(),'SUPERVOOC')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'sell-online')]")).click();
		
		driver.findElement(By.xpath("//a[@title='Login' and contains(@href,'account')]")).click();
		
		driver.findElement(By.xpath("//a[@title='Login' or contains(@href,'account')]")).click();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//select[starts-with(@class,'nav-search-dropdown')]")).click();
		
		driver.findElement(By.xpath("//select//option[position()=2]")).click();
		
		driver.findElement(By.xpath("//select//option[2]")).click();
		
		driver.findElements(By.xpath("//select//option[last()]"));
		
		driver.findElement(By.xpath("//option[text()='Baby']//parent::select")).click();
		
		driver.findElement(By.xpath("//span[text()='Sign in']//parent::a[@class='a-button-text']")).click();
		
		driver.findElement(By.className("//select//child::option[text()='Baby']")).click();
		
		driver.findElement(By.xpath("//span[text()='Login']//parent::button")).click();
		
		driver.findElement(By.xpath("//form//child::button")).click();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//a[text()='Garry.White']//ancestor::table")).click();
		
		driver.findElement(By.xpath("//table[@id='resultTable']//descendant::a[text()='Garry.White']")).click();

	}
}
