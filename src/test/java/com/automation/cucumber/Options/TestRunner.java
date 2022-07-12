package com.automation.cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/automation/featurefiles", glue = {"org/automation/stepdefination"},tags = ("@AddUser or @UpdateUser"),plugin = { "json:target/jsonReports/cocumber-report.json"} )
public class TestRunner {	
}
