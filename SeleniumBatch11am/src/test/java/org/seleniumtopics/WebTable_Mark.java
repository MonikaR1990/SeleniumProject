package org.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Mark {

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup(); //Automate driver update
		WebDriver driver = new ChromeDriver(); //driver it a object
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));
		
		for(WebElement row:rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			
			String lastName = cols.get(1).getText(); //Raj
			
			if(lastName.equals("Raj"))
			{
				cols.get(3).findElement(By.tagName("input")).click();
			}
		  }			
		}
}
