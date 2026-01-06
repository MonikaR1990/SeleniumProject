package org.seleniumtopics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverExample1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup(); //Automate driver update
		WebDriver driver = new ChromeDriver(); //driver it a object
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);  //https://www.facebook.com/
		
		@Nullable
		String pageSource = driver.getPageSource();
		
		
		//System.out.println(pageSource);
		
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("test@123");
		
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("test123");
		
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		loginBtn.click();
		
		driver.navigate().to(currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		//driver.close(); 
		
		driver.quit(); //session close
		
		
		
		
		

	}

}
