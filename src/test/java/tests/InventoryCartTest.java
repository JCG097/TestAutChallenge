package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import org.testng.Assert;

public class InventoryCartTest extends BaseTest {

    @Test
    public void inventoryAddCart() {

        InventoryPage addCart = new InventoryPage(driver);

        addCart.addToCart();
    }

}
