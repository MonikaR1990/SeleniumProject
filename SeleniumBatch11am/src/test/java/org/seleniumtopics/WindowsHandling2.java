package org.seleniumtopics;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        
        driver.switchTo().frame(0);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.xpath("//span[text()='Continue with Google']//ancestor::div[@role='button']")).click();
        
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        
        for(String window:allWindows)
        {
        	if(!window.equals(parentWindow))
        	{
        		driver.switchTo().window(window);
        		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("monicaselas2010@gmail.com");
        		driver.findElement(By.xpath("//span[text()='Next']//ancestor::button")).click();
        		Thread.sleep(2000);
        		driver.close();
        	}
        }
        driver.switchTo().window(parentWindow);
        @Nullable
		String title = driver.getTitle();
        System.out.println(title);
        
        driver.quit();
        
        
        

	}

}
