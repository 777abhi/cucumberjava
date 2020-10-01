package com.fresco.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
	
	public static WebDriver driver;

	
	@Before
	public void doSomethingBefore() {
		
	    WebDriverManager.chromedriver().setup();
		driver= new MyChromeDriver();
	}
	
	@After
	public void doSomethingAfter() {
		
		driver.close();
		
	}
	
	public static WebDriver getDriver() { 
		return driver;
}
}
