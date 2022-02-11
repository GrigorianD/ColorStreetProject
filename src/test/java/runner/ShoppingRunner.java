package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/shoppingRunner.html",
                "rerun:target/failed-scenarios/shoppingRunner.txt"},
        features = "src/test/java/features/shopping.feature",
        glue = {"stepDefinition"},
        stepNotifications = true


)
public class ShoppingRunner {
}
