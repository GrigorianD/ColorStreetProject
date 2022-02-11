package implementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ShoppingPage;
import utilities.WebDriverUtils;

public class ShoppingImpl {
    ShoppingPage page = new ShoppingPage();

    public void addItemToBag(String item){
        WebDriverWait wait;
        switch(item) {
            case "Pebble Rebel":
                page.item1.click();
                break;
            case "Jadey Business":
                page.item2.click();
                break;
            case "A Pyrite's Life":
                page.item3.click();
                break;
            case "Game of Stones":
                wait = new WebDriverWait(WebDriverUtils.getDriver(),5);
                wait.until(ExpectedConditions.elementToBeClickable(page.guestBtn));
                page.item4.click();
                break;
            default:
                System.out.println("Item not located");
        }
    }

    public void clickBtn(String btn){
        WebDriverWait wait;
        switch (btn){
            case "Shopping Bag":
                page.shopBagBtn.click();
            case "Checkout":
                page.checkoutBtn.click();
            case "Continue as Guest":
                wait = new WebDriverWait(WebDriverUtils.getDriver(),5);
                wait.until(ExpectedConditions.elementToBeClickable(page.guestBtn));
                page.guestBtn.click();
            case "Return to Catalog":
                page.returnToCatalogBtn.click();
            default:
                System.out.println("Button not found");
        }
    }
}
