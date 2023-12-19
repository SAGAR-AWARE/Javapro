package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args){
	
	System.getProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\SDM_pro\\selenium-java-4.16.1 (1)\\Chromedriver");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shirts");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	driver.findElement(By.className("s-image")).click();
	
	driver.findElement(By.id("a-icon a-icon-cart")).click();
	
	
	}
}	
