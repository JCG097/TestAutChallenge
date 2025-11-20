package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class InventoryPage  {

    private WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    private By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By shoppingCart = By.id("shopping_cart_container");

    // Agregar al carro
    public void addToCart() {

        driver.findElement(addToCart).click();

        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals(cartBadge.getText(), "1");
    }

    private By cartBadge = By.className("shopping_cart_badge");

    public void clickCartIfHasItems() {

        // Guardar el valor de el badge que buscamos con el find element
        WebElement badge = driver.findElement(cartBadge);
        // Leer el texto del badge: "1" trim limpiar espacios etc
        String value = badge.getText().trim();
        // Convertirlo a número
        int count = Integer.parseInt(value);
        // Validar
        if (count >= 1) {
            driver.findElement(shoppingCart).click();
        } else {
            System.out.println("El carrito está vacío, no se hará clic.");
        }
    }


}