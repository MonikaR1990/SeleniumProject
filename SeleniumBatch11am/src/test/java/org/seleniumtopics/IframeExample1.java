package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeExample1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
	
		//driver.switchTo().frame(0)
	
		driver.switchTo().frame("firstFr");
		
		WebElement fname = driver.findElement(By.name("fname"));
		
		WebElement lname = driver.findElement(By.name("lname"));
		
		fname.sendKeys("Monika");
		lname.sendKeys("R");
		
		
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		driver.switchTo().frame(childFrame);
		
		driver.findElement(By.name("email")).sendKeys("monika@123");
		
		driver.switchTo().parentFrame();
		
		fname.clear();
		lname.clear();
		
		fname.sendKeys("Bala");
		lname.sendKeys("S");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='/contact' and text()='Contact' and @id='testing']")).click();
		
		
		
		
	}

}
