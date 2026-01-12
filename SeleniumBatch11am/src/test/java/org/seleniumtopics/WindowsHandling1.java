package org.seleniumtopics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        
        //Handle the Window
        
        String mainWindow = driver.getWindowHandle(); //Parent/Main Window
        System.out.println(mainWindow);  //E3829EE99707D29A10B21EBD144B7F29
        
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        
        //driver.findElement(By.xpath("//a[@href='/downloads']")).click();
        
        
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);  //[E3829EE99707D29A10B21EBD144B7F29, AB6B8031F5B13C9B23BB3A0753E44BDD]
        
        for(String window:allWindows)
        {
        	if(!window.equals(mainWindow))   
        	{
        		driver.switchTo().window(window);
        		System.out.println("Second URL "+driver.getCurrentUrl());
        		System.out.println("Second Title "+driver.getTitle());
        		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
        		Thread.sleep(3000);
        		
        		driver.close(); //child window close
        	}
        }
        
        driver.switchTo().window(mainWindow);
        
        System.out.println("Parent URL "+driver.getCurrentUrl());
        System.out.println("Parent Title "+driver.getTitle());
        
        driver.quit();
        
        //windows.equals(mainWindow) ==> Parent Window
      //!windows.equals(mainWindow) ==> Child Window

	}

}
