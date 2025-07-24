package com.org;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DayTwo {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
		driver.navigate().forward();
		driver.navigate().back();
	
		
				
				
	
			}
		}
		
		
		
		
		
		
		
		
		
	}

	