package org.seleniumtopics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takesscreenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("https://www.facebook.com/");
        
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("moni@123");
        
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("113434");
        
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
        TakesScreenshot ts = (TakesScreenshot) driver; //type conversion using takescreenshot
        
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        File dest = new File("E:\\facebooklogin.jpg");
        
        FileHandler.copy(src, dest);
        
        Thread.sleep(2000);
        
        driver.quit();
        
        
        
        
        
        

	}

}
