package org.seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.get("https://www.olx.in/en-in/for-sale-houses-apartments_c1725");
		
		driver.manage().window().maximize();
		
		
		Actions act = new Actions(driver);
		
		/*WebElement slide = driver.findElement(By.xpath("//div[@id='slider-range']//div"));
		
		
		
		act.clickAndHold(slide).moveByOffset(10, 0).release().perform();
		
		Thread.sleep(2000); */
		
		
		
		//driver.navigate().to("https://www.olx.in/en-in/for-sale-houses-apartments_c1725");
		
		//WebElement olxSlide = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-1'][1]"));
		
		WebElement olxSlide = driver.findElement(By.cssSelector(".rc-slider-handle.rc-slider-handle-1"));
		
		act.clickAndHold(olxSlide).moveByOffset(80, 0).release().perform();
		
		Thread.sleep(2000);
	}

}
