package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureswithTags", glue= {"stepDefinitions"},
tags= {"@Smoke or @Smoke2"})
public class TestRunner_SingleTag {
	
	

}
