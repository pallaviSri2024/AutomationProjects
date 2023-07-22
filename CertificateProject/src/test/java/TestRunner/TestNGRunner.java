package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

/**
 * 
 * 
 * 
 * @author Pallavi Srivastava
 *
 */

@CucumberOptions(
		features="src/test/java/features12",
		glue = "stepDefinetions1",
		tags = "@tag1, @tag2")
		public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	

}
