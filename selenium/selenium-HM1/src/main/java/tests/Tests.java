package tests;

import objects.Verify;
import org.testng.annotations.Test;
import pages.Task_1;
import pages.Task_2;
import tests.TestInit;

public class Tests extends TestInit {

    @Test(priority = 0)
    public void Test_1() throws Exception {
        Verify.run(Task_1.goToGoogleDotCom());
        Verify.run(Task_1.typeGoogleSearchField());
        Verify.run(Task_1.clickOnResultListItem());
        Verify.run(Task_1.typeOnSearchFieldPypiDotOrg());
        Verify.run(Task_1.clickOnSecondListItem());
    }

    @Test(priority = 0)
    public void Test_2() throws Exception {
        Verify.run(Task_2.goToGlobalLogicDotCom());
        Verify.run(Task_2.typeQASearchField());
        Verify.run(Task_2.printHeaderFirstListItem());
    }
}
