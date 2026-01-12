package org.seleniumtopics;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Wait<WebDriver> wait = new FluentWait<>(driver)
        		.withTimeout(Duration.ofSeconds(20))
        		.pollingEvery(Duration.ofSeconds(5))
        		.ignoring(NoSuchElementException.class)
        		.ignoring(StaleElementReferenceException.class);
        
        WebElement username = wait.until(new Function<WebDriver, WebElement>()
        		{
					@Override
					public WebElement apply(WebDriver t) 
					{
						
						return t.findElement(By.name("username"));
					}	
        	
        		});
        
        WebElement password = wait.until(new Function<WebDriver, WebElement>()
        		{

					@Override
					public WebElement apply(WebDriver t)
					{
						
						return t.findElement(By.name("password"));
					}
        	
        		});
        
        
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        
        WebElement login = wait.until(new Function<WebDriver, WebElement>()
        		{

					@Override
					public WebElement apply(WebDriver t) {
						
						return t.findElement(By.tagName("button"));
					}
        	
        		});
        
        login.click();
        
        
        
        
        
        
        //List<String> fruits = new ArrayList<>();

	}

}
