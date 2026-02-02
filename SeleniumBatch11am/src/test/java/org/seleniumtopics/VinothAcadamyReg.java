package org.seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VinothAcadamyReg {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //object create 
		driver.get("https://vinothqaacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		
		
		WebElement hours = driver.findElement(By.id("vfb-16-hour"));
		
		Select select = new Select(hours);
		select.selectByVisibleText("01");
		
		
		
		WebElement submit = driver.findElement(By.id("vfb-4"));
		submit.click();
		
		
	}

}
