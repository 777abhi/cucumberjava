package com.fresco.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;

public class register implements En {
	

	public  WebDriver driver;
	
	 //Lambda-steps inside Constructors
    public register() {
	Given("the user is on the user registration page", () -> {

		System.out.println("Inside Given");


	    WebDriverManager.chromedriver().setup();
		driver = new MyChromeDriver();
		driver.get("http://localhost:8000/register.html");
	});

	When("the user enters valid data on the page {string},{string},{string},{string},{string}", (String string, String string2
	, String string3, String string4, String string5) -> {

		System.out.println("Inside When"+string);
		System.out.println("Inside When"+string2);
		System.out.println("Inside When"+string3);
		System.out.println("Inside When"+string4);
		System.out.println("Inside When"+string5);
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(string3);
		driver.findElement(By.xpath("//*[@id=\"re-email\"]")).sendKeys(string3);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string4);
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string5);
		
		Thread.sleep(10000);
	});

	Then("the user registration should be successful", () -> {

		System.out.println("Inside Then");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.quit();
		
	});
    }
	
}
