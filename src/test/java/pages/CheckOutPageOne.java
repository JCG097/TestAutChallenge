package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class CheckOutPageOne {

    private WebDriver driver;

    private By continueBtn = By.id("continue");
    private By cancelBackBtn = By.id("cancel");
    private By title = By.className("title");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");

    public CheckOutPageOne(WebDriver driver) {

        this.driver = driver;
    }

    // ir al siguiente paso del pago
    public void continueCheckOutRedirect() {
        driver.findElement(continueBtn).click();
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
        driver.findElement(cancelBackBtn).click();
    }
    // llenar el formulario
    public void intFormPersonalInfo() {
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Smith");
        driver.findElement(postalCode).sendKeys("111105");
    }
}