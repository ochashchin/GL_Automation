package pages;

import objects.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_2 {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public Task_2(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 2);
    }

    public static boolean goToGlobalLogicDotCom(){
        try {
            driver.get("https://www.globallogic.com/ua/careers/");
            Log.printLn("$Successfully navigated to www.globallogic.com/ua/careers/");
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot navigate to www.globallogic.com/ua/careers/, because: " + e);
            return false;
        }
    }


    public static boolean typeQASearchField(){
        try {
            driver.findElement(By.xpath("//section[@id='hero']//input[@id='by_keyword']"))
                    .sendKeys("QA" + Keys.ENTER);

            Log.printLn("Typed \"QA\" on search field");
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot type \"QA\" on search field, because: " + e);
            return false;
        }
    }

    public static boolean printHeaderFirstListItem(){
        try {
            WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//div[@class='col-lg-9 col-sm-7 col-12 mobile-pb-20 max-width-72percent']//p[1]")));

            System.out.println(result.getAttribute("textContent"));
            Log.printLn("First list item header is: " + result.getAttribute("textContent"));
            return true;
        } catch (Exception e) {
            Log.printLn("Cannot find first list item header, because: " + e);
            return false;
        }
    }

}
