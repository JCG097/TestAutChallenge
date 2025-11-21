package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;


public class CartPaymentTest extends BaseTest {

    @Test
    public void paymentSuccess() {
        CartPage cartPayment = new CartPage(driver);

        //clic en redirect
        cartPayment.checkoutRedirect();

        String currentUrl = cartPayment.getCurrentUrl();

        Assert.assertNotNull(currentUrl, "❌ La URL es nula.");
        Assert.assertTrue(
                currentUrl.contains("checkout-step-one"),
                "❌ Redirección al pago (checkout-step-one) fallida. URL actual: " + currentUrl
        );

        By title = By.className("title");
        String text = driver.findElement(title).getText();

        Assert.assertEquals(text, "Checkout: Your Information", "❌ No cargó la pantalla de información.");

    }






}
