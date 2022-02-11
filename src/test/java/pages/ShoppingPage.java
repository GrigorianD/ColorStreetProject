package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtils;

public class ShoppingPage {
    public ShoppingPage(){
        PageFactory.initElements(WebDriverUtils.getDriver(),this);
    }

    @FindBy(xpath="//div[@id='item-list']/div[1]//button")
    public WebElement item1;

    @FindBy (xpath ="//div[@id='item-list']/div[2]//button")
    public WebElement item2;

    @FindBy (xpath ="//div[@id='item-list']/div[3]//button")
    public WebElement item3;

    @FindBy (xpath ="//div[@id='item-list']/div[4]//button")
    public WebElement item4;

    @FindBy(xpath="//span[text()='Shopping Bag']")
    public WebElement shopBagBtn;

    @FindBy(xpath="//a[@data-action='checkout']")
    public WebElement checkoutBtn;

    @FindBy(xpath="//a[text()='Continue as Guest']")
    public WebElement guestBtn;

    @FindBy(xpath = "//div[@id='free-item-modal']//a[@class='btn btn-primary pull-left-desktop']")
    public WebElement returnToCatalogBtn;


    @FindBy(xpath = "//div[@id='hearAboutUsModal']//input[@id='txtZipCode']")
    public WebElement zipcodeInput;


}
