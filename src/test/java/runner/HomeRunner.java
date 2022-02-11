package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/homeRunner.html",
        "rerun:target/failed-scenarios/homeRunner.txt"},
        features = "src/test/java/features/home.feature",
        glue = {"stepDefinition"},
        stepNotifications = true


)
public class HomeRunner {
}
