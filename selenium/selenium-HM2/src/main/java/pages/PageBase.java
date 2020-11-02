package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    public static WebDriver webDriver;
    public static WebDriverWait wait;

    public PageBase() {
    }

    public void get(String URL) {
        webDriver.get(URL);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        webDriver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        webDriver.findElement(locator).sendKeys(text);
    }

    public void print(By locator) {
        WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        System.out.println(result.getAttribute("textContent"));
    }
}
