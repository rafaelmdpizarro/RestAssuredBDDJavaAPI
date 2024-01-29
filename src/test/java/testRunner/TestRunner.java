package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="", features = {"src/test/resources/Features"},
		glue = {"stepdefinition"},
		plugin = {"pretty", "html:target/HtmlReport.html"})
public class TestRunner {

}