package org.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceTable1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup(); //Automate driver update
		WebDriver driver = new ChromeDriver(); //driver it a object
		driver.get("https://letcode.in/advancedtable");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='advancedtable']//tbody//tr"));
		
		while(true)
		{
		for(WebElement row : rows)
		{
			List<WebElement> cols = driver.findElements(By.tagName("td"));
			
			for(WebElement col:cols)
			{
				System.out.println(col.getText());
			}
			
		}
		
		WebElement nextBtn = driver.findElement(By.xpath("//button[text()='›']"));

		if(nextBtn.getAttribute("class").contains("disabled"))
		{
			System.out.println("Pagination Completed");
			break;
		}
		
		nextBtn.click();
		Thread.sleep(2000);
		}
		
		driver.quit();
	}

}
