package tests;

import objects.Config;
import org.testng.annotations.Test;
import pages.PageCareers;

public class Tests extends TestBase {

    @Test(priority = 0)
    public void Test_1() throws Exception {
        new PageCareers(driver)
                .open(Config.URL_CAREERS)
                .acceptCookies(PageCareers.XPATH_ALLOW_COOKIES)
                .typeSearchField(PageCareers.XPATH_SEARCH_FIELD, "QA")
                .clickFind(PageCareers.XPATH_FIND)
                .printHeaderFirstItem(PageCareers.XPATH_FIRST_RESULT);
    }
}
