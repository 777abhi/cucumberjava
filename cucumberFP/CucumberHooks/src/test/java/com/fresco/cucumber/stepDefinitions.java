package com.fresco.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinitions implements En {
	

	WebDriver driver;
		
	 //Lambda-steps inside Constructors
    public stepDefinitions() {
    	
    	Given("the user is on the index page at {string}", (String string) -> {

    		driver = hooks.getDriver();
			driver.get(string);
    	});

    	When("Selenium drags {string} into {string}", (String string, String string2) -> {
    		
    		Thread.sleep(5000);
    		
    		//
    		driver.switchTo().frame(
    				driver.findElement(By.xpath("//html//body//iframe")));
    		
    		Actions action = new Actions(driver);
    		action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))
    				, driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
    		.build().perform();
    		
    		
    	});

    	Then("should check the contents of {string}", (String string) -> {
    		Thread.sleep(5000);
    		
    		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).getText().toString()
    				, "Dropped!");
    	});
    		

    }
    
}
