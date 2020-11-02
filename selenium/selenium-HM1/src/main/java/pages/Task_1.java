package pages;

import objects.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_1 {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public Task_1(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 2);
    }

    public static boolean goToGoogleDotCom(){
        try {
            driver.get("https://www.google.com/");
            Log.printLn("$Successfully navigated to www.google.com");
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot navigate to www.google.com, because: " + e);
            return false;
        }
    }

    public static boolean typeGoogleSearchField(){
        try {
            driver.findElement(By.name("q")).sendKeys("selenium install ubuntu python" + Keys.ENTER);

            Log.printLn("Google search result shown");
            return true;
        } catch (Exception e) {
            Log.printLn("Google search result fail, because: " + e);
            return false;
        }
    }

    public static boolean clickOnResultListItem(){
        try {
            WebElement li = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='selenium · PyPI']")));
            li.click();

            Log.printLn("Clicked on pypi.org list item");
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot click pypi.org in search result list, because: " + e);
            return false;
        }
    }

    public static boolean typeOnSearchFieldPypiDotOrg(){
        try {
            WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search']")));
            result.sendKeys("selenium" + Keys.ENTER);

            Log.printLn("Typed \"selenium\" on search field");
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot type \"selenium\" on search field, because: " + e);
            return false;
        }
    }

    public static boolean clickOnSecondListItem(){
        try {
            WebElement li = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@aria-label='Search results']//li[2]")));
            li.click();

            Log.printLn("Clicked on second list item");
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot click on second list item, because " + e);
            return false;
        }
    }
}