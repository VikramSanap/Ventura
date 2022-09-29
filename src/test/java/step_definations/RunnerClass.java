package step_definations;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/main/resources/features/"},glue = "step_definations",
        //dryRun = true,
        tags = {"@searchItem"},
        monochrome = true, plugin = { "pretty", "html:target/cucumber-report.html",
        "json:target/json-cucumber-report.json" })

public class RunnerClass extends AbstractTestNGCucumberTests {
	

}
