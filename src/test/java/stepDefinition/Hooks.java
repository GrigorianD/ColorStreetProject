package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.CucumberLogUtils;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        CucumberLogUtils.initScenario(scenario);
    }

    @After
    public void tearDown(Scenario scenario){
        //will take a screenshot if the test fails
        if(scenario.isFailed())
            CucumberLogUtils.logFail("Scenario: " + scenario.getName() + " FAILED.", true);
        //     WebDriverUtils.quitDriver();
    }
}
