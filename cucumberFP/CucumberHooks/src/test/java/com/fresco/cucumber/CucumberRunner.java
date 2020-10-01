package com.fresco.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/"
,plugin = {"pretty", "json:target/reports/cucumber.json","html:target/reports"}
)
public class CucumberRunner{}