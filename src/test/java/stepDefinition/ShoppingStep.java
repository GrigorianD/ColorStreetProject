package stepDefinition;

import implementation.HomeImpl;
import implementation.ShoppingImpl;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.ShoppingPage;
import utilities.SeleniumUtils;
import utilities.WebDriverUtils;

public class ShoppingStep {

    HomePage page = new HomePage();
    HomeImpl impl = new HomeImpl();
    SeleniumUtils utils = new SeleniumUtils();
    ShoppingPage shoppingPage = new ShoppingPage();
    ShoppingImpl shoppingImpl = new ShoppingImpl();


    @Given("user is on the shopping page")
    public void user_is_on_the_shopping_page() {
        impl.navigateToHomePage();
        impl.selectCountryAndLanguage();
        impl.slidingWindow();
        WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(page.shopNowBtn));
        page.shopNowBtn.click();
        utils.switchWindow();
    }
    @When("user adds {string} to the bag")
    public void user_adds_to_the_bag(String item){
        shoppingImpl.addItemToBag(item);
    }


    @When("user clicks on {string} button")
    public void user_clicks_on_button(String btn) {
       shoppingImpl.clickBtn(btn);
    }

    @And("user returns to the shopping page")
    public void user_returns_to_the_shopping_page(){

      WebDriverUtils.getDriver().navigate().back();
    }

    @And("user inputs zipcode")
    public void user_inputs_zipcode(){
        WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='hearAboutUsModal']//input[@id='txtZipCode']")));
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.getDriver();
        js.executeScript("arguments[0].value='22031';", shoppingPage.zipcodeInput);

//        shoppingPage.zipcodeInput.sendKeys("22031");
    }


    @Then("user should see a list of stylists")
    public void userShouldSeeAListOfStylists() {
    }
}
