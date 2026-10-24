package cucumberpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

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
			tags="@product"
			)

	public class RunnerFile2 {

	}









