package implementation;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.WebDriverUtils;

public class HomeImpl {
    HomePage page = new HomePage();
    public void navigateToHomePage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));

    }

    public void selectCountryAndLanguage(){

        Select select = new Select(page.selectCountry);
        select.selectByVisibleText("United States");

        Select select2 = new Select(page.selectLanguage);
        select2.selectByVisibleText("English");
        page.submitBtn.click();
    }

    public void slidingWindow() {

        page.slidingWndw4thBtn.click();
    }

    public void waitAndClickBtn(){
        WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(page.buy3get1Text));
        page.buy3get1Text.getText();
    }

}
