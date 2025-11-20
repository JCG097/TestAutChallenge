package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;


public class CartPaymentTest extends BaseTest {

    @Test
    public void paymentSuccess() {
        CartPage cartPayment = new CartPage(driver);

        cartPayment.checkoutRedirect();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
        Assert.assertTrue(currentUrl.contains("checkout-step"),"redireccion al pago fallida.");
    }






}
