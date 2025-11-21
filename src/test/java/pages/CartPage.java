package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class CartPage {

    private WebDriver driver;

    private By checkout = By.id("checkout");
    private By continueShopping = By.id("continue-shopping");
    private By removeBackpack = By.id("remove-sauce-labs-backpack");
    private By title = By.className("title");

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

}