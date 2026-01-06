package org.seleniumtopics;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        
        
        @Nullable
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
        
        @Nullable
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");
        
        @Nullable
		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
        loginBtn.click();
        
        
	}

}
