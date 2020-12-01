package ua.com.stickers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {

    public FirefoxDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","/prog/geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,20);

        System.out.println("Test Start");
    }

    @After
    public void close() {
        System.out.println("Test End");
        driver.quit();
    }
}


