package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
        driver.manage().window().maximize();
        
        driver.switchTo().frame("iframeResult");
        
        WebElement childFrame = driver.findElement(By.xpath("//iframe[contains(@src,'demo')]"));
        driver.switchTo().frame(childFrame);
        
        String message = driver.findElement(By.tagName("h1")).getText();
        
        System.out.println(message);
        
        driver.switchTo().parentFrame();
        
        String msg = driver.findElement(By.tagName("h2")).getText();
        System.out.println(msg);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("runbtn")).click();        
        
       

	}

}
