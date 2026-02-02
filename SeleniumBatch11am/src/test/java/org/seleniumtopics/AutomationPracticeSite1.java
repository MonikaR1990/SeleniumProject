package org.seleniumtopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSite1 {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup(); //Automate driver update
		WebDriver driver = new ChromeDriver(); //driver it a object
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String filePath = "F:\\data.txt";
		
		// Upload file
        driver.findElement(By.id("singleFileInput")).sendKeys(filePath);

        // Click Upload button
        driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
        
        //Multiple File Upload
        
        String file1 = "F:\\data.txt";
        String file2 = "F:\\data1.txt";
        String file3 = "F:\\data2.txt";
        
        driver.findElement(By.id("multipleFilesInput")).sendKeys(file1 + "\n"+ file2 + "\n" +   file3);
        
        driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
        
        
        
		
		//Wait with Click
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		
        driver.findElement(By.className("wikipedia-search-button")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a")));
        
        List<WebElement> results =
                driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));

        for (WebElement r : results) 
        {
            if (r.getText().equals("Selenium (software)"))
            {
                wait.until(ExpectedConditions.elementToBeClickable(r));
                r.click();
                break;
            }
        } 
        
    /*    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(
            By.linkText("Selenium (software)")
        )).click(); // directly click once it's ready */

	}

}
