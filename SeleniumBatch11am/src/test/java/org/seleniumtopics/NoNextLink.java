package org.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoNextLink {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@class='pagination']//li//a"));
		
		int totalPages = pages.size();
		
		System.out.println(totalPages); //4
		
		for(int i = 1; i<=totalPages; i++)
		{
			driver.findElement(By.xpath("(//ul[@class='pagination']//li//a)[" + i + "]")).click();
		
		System.out.println("\n Page Number: " + i);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
		
		for(WebElement row:rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			
			for(WebElement col:cols)
			{
				System.out.println(col.getText());
			}
			
		}
		
		
		}
		
		//driver.quit();
		
		driver.findElement(By.name("start")).click();
	}
	


}
