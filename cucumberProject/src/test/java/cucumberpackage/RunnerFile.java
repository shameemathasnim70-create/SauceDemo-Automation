package cucumberpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/", 
		glue= {"cucumberpackage"},
		plugin= {
				"pretty",
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json"
		},
				 monochrome = true,
				    dryRun = false,
		tags="@Login"
		)

public class RunnerFile {

}






