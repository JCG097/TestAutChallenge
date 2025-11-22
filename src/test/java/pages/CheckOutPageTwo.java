package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class CheckOutPageTwo {

    private WebDriver driver;

    private By finishBtn = By.id("finish");
    private By title = By.className("title");
    private By cancelBtn = By.id("cancel");

    public CheckOutPageTwo(WebDriver driver) {

        this.driver = driver;
    }

    // ir al paso final del pago
    public void continueCheckOutRedirect() {
        driver.findElement(finishBtn).click();
    }
    // url actual validacion
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    //titulo de la pagina
    public String getPageTitle() {
        return driver.findElement(title).getText();
    }
    // volver paso anterior
    public void cancelRedirect() {
        driver.findElement(cancelBtn).click();
    }
}