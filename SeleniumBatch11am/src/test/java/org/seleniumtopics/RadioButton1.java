package org.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton1
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("yes")).click();
		
		WebElement yesRadio = driver.findElement(By.id("one"));
		
		WebElement noRadio = driver.findElement(By.id("two"));
		
		yesRadio.click();
		
		System.out.println("Yes Selected: " + yesRadio.isSelected()); //True
		
		Thread.sleep(2000);
		
		noRadio.click();
		
		System.out.println("No Selected: "+ noRadio.isSelected()); //True
		
		System.out.println("Yes Selected: " + yesRadio.isSelected()); //False
		
		WebElement yes = driver.findElement(By.id("nobug"));
		
		WebElement no = driver.findElement(By.id("bug"));
		
		yes.click();
		no.click();
		
		boolean yesSelected = yes.isSelected(); //true
		
		boolean noSelected = no.isSelected(); //true
		
		if(yesSelected && noSelected)
		{
			System.out.println("Bug: Both radio buttons are selected");
		}
		else
		{
			System.out.println("No bug one radio button is selected");
		}
		
		
		List<WebElement> radios = driver.findElements(By.xpath("//label[text()='Find which one is selected']//following::input[@name='foobar']"));
		
		for(WebElement radio:radios)
		{
			if(radio.isSelected())
			{
					System.out.println(radio.getAttribute("id"));
			}
		}
		
		
		WebElement mayBeClick = driver.findElement(By.id("maybe"));
		
		System.out.println(mayBeClick.isEnabled()); //false
		
		
		
		
		
		
		
		
		
		
		

	}

}
