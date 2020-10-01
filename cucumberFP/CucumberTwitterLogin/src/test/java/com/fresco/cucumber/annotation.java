package com.fresco.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;

public class annotation implements En {
	

	public  WebDriver driver;
	
	 //Lambda-steps inside Constructors
    public annotation() {
    	

Given("the user is on Twitter log in page", () -> {

    WebDriverManager.chromedriver().setup();
	driver= new MyChromeDriver();
	//driver= new ChromeDriver();
	driver.get("https://twitter.com/login");
});

When("I enter the username as {string} and password as {string}", (String string, String string2) -> {
	
Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/form/div/div[1]/label/div/div[2]/div/input"))
	.sendKeys(string);
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/form/div/div[2]/label/div/div[2]/div/input"))
	.sendKeys(string2);
	
});

Then("login should fail", () -> {
	

	driver.findElement(By
			.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/form/div/div[3]/div/div"))
	.click();

	driver.quit();
	
});


    }
    
}
