package step_definitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@bookReservation", //Identity of Cucumber class
        features = {"src/test/resources/features"}, // Packaging of Cucumber Class
        glue = {"classpath:step_definitions"}, // Running final method in BDD
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"} // Place for Cucumber Report
)
public class RunCukesTest {


}
