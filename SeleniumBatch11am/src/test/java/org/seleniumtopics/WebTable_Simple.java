package org.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Simple {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/table");
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
        
        for(WebElement row:rows)
        {
        	List<WebElement> cols = row.findElements(By.tagName("td"));
        	{
        		for(WebElement col:cols)
        		{
        			System.out.println(col.getText());
        		}
        		System.out.println();
        	}
        }
        
        

	}

}
