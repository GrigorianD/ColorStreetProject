package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtils;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);

    }

    @FindBy(xpath="//select[@id='CountrySelector']")
    public WebElement selectCountry;

    @FindBy(xpath = "//select[@name='Language']")
    public WebElement selectLanguage;

    @FindBy(xpath = "//a[text()='Submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//ol[@class='carousel-indicators']/li[4]")
    public WebElement slidingWndw4thBtn;

    @FindBy(xpath = "//div[@class='carousel-inner']/div[4]//a[@class='fl-button-top anchor-link']")
    public WebElement shopNowBtn;

    @FindBy(xpath="//span[text()='Buy 3 Get 1 Free!']")
    public WebElement buy3get1Text;
}
