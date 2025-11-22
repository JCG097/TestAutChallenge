package tests;

import base.BaseTest;
import flows.CheckoutFlow;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class CheckoutTest extends BaseTest {
    @Test
    public void verifyCompletePaymentFlow() {
        // 1. Arrange & Act (Llama al login, add item, go cartpage)
        CheckoutFlow checkoutFlow = new CheckoutFlow(driver);
        checkoutFlow.runFullCheckout("standard_user", "secret_sauce");

        // Validación A: URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl, "La URL es nula.");
        Assert.assertTrue(currentUrl.contains("checkout-step-one"),
                "Error: No se redirigió al checkout step one.");

        // Validación B: Título
        CartPage validatePage = new CartPage(driver);
        Assert.assertEquals(
                validatePage.getPageTitle(),
                "Checkout: Your Information",
                "El título de la página no es el correcto."
        );

    }

}


