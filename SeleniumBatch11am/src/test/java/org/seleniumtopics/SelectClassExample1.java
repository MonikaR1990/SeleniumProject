package org.seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassExample1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select  selectFruits = new Select(fruits);
		
		//selectFruits.selectByVisibleText("Banana");
		
		//selectFruits.selectByValue("4");
		
		selectFruits.selectByIndex(2); //Mango
		
		
		WebElement getFruit = selectFruits.getFirstSelectedOption();
		
		String fruitName = getFruit.getText();
		
		//System.out.println(getFruit.getText());
		
		System.out.println(fruitName);
		
		WebElement countries = driver.findElement(By.id("country"));
		
		Select selectCountry = new Select(countries);
		
		selectCountry.selectByValue("India"); //India
		
		
		WebElement country = selectCountry.getFirstSelectedOption();
		
		System.out.println(country.getText()); //Just Print //India
		
		String countryName = country.getText(); //India
		
		System.out.println(countryName);
		
		WebElement lang = driver.findElement(By.id("lang"));
		
		Select selectLang = new Select(lang);
		
		selectLang.selectByVisibleText("C#");
		
		List<WebElement> langs = selectLang.getOptions();
		
		for(WebElement language:langs)
		{
			System.out.println(language.getText());
		}
		
		WebElement heros = driver.findElement(By.id("superheros"));
		
		Select selectHero = new Select(heros);
		
		selectHero.selectByVisibleText("Batman");
		selectHero.selectByVisibleText("Captain America");
		selectHero.selectByVisibleText("Doctor Strange");
		selectHero.selectByVisibleText("Hellboy");
		selectHero.selectByVisibleText("Superman");
		selectHero.selectByVisibleText("Thor");
		
		
		List<WebElement> options = selectHero.getAllSelectedOptions();
		
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
		
	}
}
