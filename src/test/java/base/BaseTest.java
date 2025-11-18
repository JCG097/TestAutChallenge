package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


public class BaseTest {
        protected WebDriver driver;
    //setup para los test
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximizar la ventana
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");

    }
    //despues de los test se debe cerrar
    @AfterMethod
    public void tearDown() {
        // != evitar los errores si no se creo el driver
        if (driver != null) {
            driver.quit();
        }
    }

}























