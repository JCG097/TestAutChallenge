package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;


public class CartRemoveItemTest extends BaseTest {

    @Test
    //Remover item del carrito
    public void cartRemoveItem() {
        CartPage removeCart = new CartPage(driver);
        //eliminar producto del carrito
        removeCart.removeItem();

        // validar eliminación
        Assert.assertTrue(
                removeCart.isItemRemoved()
        );
    }
    @Test
    //Volver al home invetory
    public void continueShopping() {
        CartPage continueShoppingBtn = new CartPage(driver);
        continueShoppingBtn.continueShoppingBtn();
    }

}
