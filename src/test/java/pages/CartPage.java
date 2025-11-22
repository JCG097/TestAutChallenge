package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class CartPage {

    private WebDriver driver;

    private By checkout = By.id("checkout");
    private By continueShopping = By.id("continue-shopping");
    private By removeBackpack = By.id("remove-sauce-labs-backpack");
    private By title = By.className("title");
    private By removedItem = By.className("removed_cart_item");

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }
    // ir al pago
    public void checkoutRedirect() {
        driver.findElement(checkout).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.findElement(title).getText();
    }
    public void removeItem() {
        driver.findElement(removeBackpack).click();
    }
    public void continueShoppingBtn() {
        driver.findElement(continueShopping).click();
    }
    public boolean isItemRemoved() {
        try {
            return driver.findElement(removedItem).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}