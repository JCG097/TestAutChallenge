package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    @Test
    public void loginExitoso() {


        LoginPage login = new LoginPage(driver);

        login.login("standard_user","secret_sauce");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
        Assert.assertTrue(currentUrl.contains("inventory"),"el login no redirigio a inventory.");
    }

}
