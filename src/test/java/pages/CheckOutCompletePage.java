package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class CheckOutCompletePage {

    private WebDriver driver;

    private By homeBtn = By.id("finish");
    private By title = By.className("title");
    private By thxMessage = By.className("complete-header");

    public CheckOutCompletePage(WebDriver driver) {

        this.driver = driver;
    }

    // ir al home despues del pago exitoso
    public void continueCheckOutRedirect() {
        driver.findElement(homeBtn).click();
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
    public String thxMessage() {
        return driver.findElement(thxMessage).getText();
    }
}