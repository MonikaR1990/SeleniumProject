package org.seleniumtopics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		WebElement dateInput = driver.findElement(By.id("datepicker1"));
		dateInput.click();
		
		
		
		while(true)
		{
		
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		System.out.println(month);
		
		if(month.equals("April"))
		{
			break;
		}
		else	
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
		}
		
		}
		
		driver.findElement(By.xpath("//a[text()='22']")).click();
		
		@Nullable
		String newDate = dateInput.getAttribute("value");
		
		System.out.println(newDate);
		
		
	}

}
