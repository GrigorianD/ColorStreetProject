package stepDefinition;

import implementation.HomeImpl;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.SeleniumUtils;

public class HomeStep {

    HomePage page = new HomePage();
    HomeImpl impl = new HomeImpl();
    SeleniumUtils utils = new SeleniumUtils();

    @Given("user successfully navigates to homepage")
    public void user_navigates_to_homepage() {
       impl.navigateToHomePage();

    }

    @When("user selects preferred country and language")
    public void user_selects_preferred_country_and_language() {
    impl.selectCountryAndLanguage();
    }

    @And("user navigates to the fourth sliding window")
    public void user_navigates_to_the_fourth_sliding_window() {
    impl.slidingWindow();
    }

    @When("user clicks on Shop Now button")
    public void user_clicks_on_shop_now_button() {
    page.shopNowBtn.click();
    }

    @Then("user should see a sale banner")
    public void user_should_be_redirected_to_a_new_window() {
    utils.switchWindow();
    Assert.assertEquals("BUY 3 GET 1 FREE!", page.buy3get1Text.getText());
    }
}
