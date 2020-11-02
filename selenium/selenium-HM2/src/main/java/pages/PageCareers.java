package pages;

import objects.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCareers extends PageBase {

    public static final String XPATH_FIND = "//button[text()='Знайти'][1]";
    public static final String URL_CAREERS = "https://www.globallogic.com/ua/careers/";
    public static final String XPATH_ALLOW_COOKIES = "/html/body/div[1]/div[1]/div[5]/div[2]/a[3]";
    public static final String XPATH_SEARCH_FIELD = "//section[@id='hero']//input[@id='by_keyword']";
    public static final String XPATH_FIRST_RESULT = "//div[@class='col-lg-9 col-sm-7 col-12 mobile-pb-20 max-width-72percent']//p[1]";


    public void Careers() {
    }

    public PageCareers(WebDriver driver) {
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 2);
    }

    public PageCareers open(String URL) throws Exception {
        try {
            get(URL);
            Log.printLn("$Navigated to Careers page");
        } catch (Exception e) {
            Log.printLn("$Cannot navigate to Careers page, because: " + e);
            throw new Exception();
        }
        return this;
    }

    public PageCareers acceptCookies(String locator) throws Exception {
        try {
            click(By.xpath(locator));
            Log.printLn("Clicked on accept cookies button");
        } catch (Exception e) {
            Log.printLn("Cannot click on cookies button, because: " + e);
            throw new Exception();
        }
        return this;
    }

    public PageCareers typeSearchField(String locator, String text) throws Exception {
        try {
            type(By.xpath(locator), text);
            Log.printLn("Typed in search " + text);
        } catch (Exception e) {
            Log.printLn("Cannot type in search, because: " + e);
            throw new Exception();
        }
        return this;
    }

    public PageCareers clickFind(String locator) throws Exception {
        try {
            click(By.xpath(locator));
            Log.printLn("Clicked on find button");
        } catch (Exception e) {
            Log.printLn("Cannot click on find button, because: " + e);
            throw new Exception();
        }
        return this;
    }

    public PageCareers printHeaderFirstItem(String locator) throws Exception {
        try {
            print(By.xpath(locator));
            Log.printLn("Printing header information");
        } catch (Exception e) {
            Log.printLn("Cannot print header information, because: " + e);
            throw new Exception();
        }
        return this;
    }
}
