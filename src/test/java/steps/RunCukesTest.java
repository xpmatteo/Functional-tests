package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty",
                "html:target/cucumber-html-report"
        },
        features="features/"
)
class RunCukesTest {
    }

