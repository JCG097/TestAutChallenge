package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CompleteFlowTest extends BaseTest {

        @Test
        public void completeFlowTest() throws InterruptedException {

            // 1. Login
            LoginPage login = new LoginPage(driver);
            login.login("standard_user", "secret_sauce");

            // 2. Inventory
            InventoryPage inventory = new InventoryPage(driver);
            inventory.addToCart();
            inventory.clickCartIfHasItems();


            // 3. CartPage
            CartPage cartPayment = new CartPage(driver);
            cartPayment.checkoutRedirect();

            // 4. Validación de URL
            String currentUrl = cartPayment.getCurrentUrl();

            Assert.assertNotNull(currentUrl, "La URL es nula.");
            Assert.assertTrue(
                    currentUrl.contains("checkout-step-one"),
                    "Redirección al checkout fallida. URL actual: " + currentUrl
            );

            // 5. Validación del título usando la Page correcta
            CartPage info = new CartPage(driver);

            Assert.assertEquals(
                    info.getPageTitle(),
                    "Checkout: Your Information",
                    "No cargó la pantalla de información del checkout."
            );

        }

    }

