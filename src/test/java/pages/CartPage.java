package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    private By checkout = By.id("checkout");
    private By continueShopping = By.id("continue-shopping");
    private By removeBackpack = By.id("remove-sauce-labs-backpack");

    // ir al pago
    public void checkoutRedirect() {
        driver.findElement(checkout).click();
        String currentUrl = driver.getCurrentUrl();
    }







}