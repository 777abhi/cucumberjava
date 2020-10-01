package com.fresco.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login implements En {
	

	public  WebDriver driver;
	
	 //Lambda-steps inside Constructors
    public login() {
Given("the user is on the user login page", () -> {
	System.out.println("Inside Given");
	

    WebDriverManager.chromedriver().setup();
	driver= new MyChromeDriver();
	
	driver.get("http://localhost:8000/login.html");
	


	
});

When("the user enters the email as {string} and password as {string}", (String string, String string2) -> {
	System.out.println("Inside When param1 "+string);
	System.out.println("Inside When param2 "+string2);
	

	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(string);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
	
	
});

Then("login should be successful", () -> {
	System.out.println("Inside Then");
	
	driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	
	driver.quit();
});

    }
    
}
