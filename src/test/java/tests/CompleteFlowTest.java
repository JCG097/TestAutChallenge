package tests;

import base.BaseTest;
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
        }

    }

