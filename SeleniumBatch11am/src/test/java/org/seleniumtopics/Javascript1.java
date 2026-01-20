package org.seleniumtopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	     searchBox.sendKeys("Laptop");
	     
	     WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
	     searchBtn.click();
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver; 
	     
	    // js.executeScript("window.scrollBy(0,8000)");
	     //Thread.sleep(2000);
	     
	     //Scroll till the end of the page
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     Thread.sleep(2000);
	     
	     js.executeScript("window.scrollTo(0,0)");
	     Thread.sleep(2000);
	     
	     
	     
	}

}
