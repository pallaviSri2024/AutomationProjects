package StepDefinetion;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue=
{"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
"json:target/JSONreport/report.json",
"html:target/HtmlReports"},
tags="@smoketest")
public class TestRunner {

}
