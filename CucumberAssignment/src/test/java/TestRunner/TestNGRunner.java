package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue = "stepDefinetions",
		tags = "@tag2")
		public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	

}
