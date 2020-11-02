package tests;

import objects.ObjectsInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.awt.*;

public class TestInit {
    public static WebDriver driver = new ChromeDriver();
    public ObjectsInit pages = new ObjectsInit(driver);

    @BeforeTest
    public void setUp() throws AWTException {
        new Robot().mouseMove(0, 0);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
