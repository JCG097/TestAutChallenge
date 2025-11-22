package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckOutPageOne;


public class CartPaymentTest extends BaseTest {

    @Test
    public void paymentSuccess() {
        CartPage cartPayment = new CartPage(driver);

        //clic en redirect
        cartPayment.checkoutRedirect();

        //Validar la URL
        String currentUrl = cartPayment.getCurrentUrl();
        Assert.assertNotNull(currentUrl, "❌ La URL es nula.");
        Assert.assertTrue(
                currentUrl.contains("checkout-step-one"),
                "❌ Redirección al pago (checkout-step-one) fallida. URL actual: " + currentUrl
        );

        //Validar el nombre de la pagina
        By title = By.className("title");
        String text = driver.findElement(title).getText();
        Assert.assertEquals(text, "Checkout: Your Information", "❌ No cargó la pantalla de información.");
    }
    @Test
    //Volver al home invetory
    public void continueShopping() {
        CartPage continueShoppingBtn = new CartPage(driver);
        continueShoppingBtn.continueShoppingBtn();
    }


}
