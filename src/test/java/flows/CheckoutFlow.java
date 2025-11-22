package flows;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CheckoutFlow {
    // Variables para tus Pages
    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;


    public CheckoutFlow(WebDriver driver) {
        this.driver = driver;

        // Inicializamos las Pages aquí para usarlas abajo
        this.loginPage = new LoginPage(driver);
        this.inventoryPage = new InventoryPage(driver);
        this.cartPage = new CartPage(driver);
    }

        public void runFullCheckout(String username, String password)  {

            // 1. Login
            loginPage.login(username, password);

            // 2. Inventory and add item
            inventoryPage.addToCart();
            inventoryPage.clickCartIfHasItems();

            // 3. CartPage
            cartPage.checkoutRedirect();

        }

    }

