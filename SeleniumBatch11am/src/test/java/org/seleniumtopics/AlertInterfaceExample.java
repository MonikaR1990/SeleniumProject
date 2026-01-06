package org.seleniumtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInterfaceExample {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.id("accept"));
		
		simple.click();
		
		Alert alt = driver.switchTo().alert(); //Syntax
		
		alt.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		
		alt.dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("prompt")).click();
		
		System.out.println(alt.getText());  //Enter Your Name
		
		alt.sendKeys("RamRaj");
		
		alt.accept();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
			

	}

}
