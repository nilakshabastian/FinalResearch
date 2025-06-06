package com.zone24x7.runner;

import com.zone24x7.utils.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.zone24x7.steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@Regression2"
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterSuite
   public void tearDown(){

      DriverFactory.quitDriver();
   }

    }


