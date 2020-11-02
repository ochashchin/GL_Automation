package objects;

import org.openqa.selenium.WebDriver;
import pages.Task_1;
import pages.Task_2;

public class ObjectsInit {

    public final Task_1 ts1;
    public final Task_2 ts2;

    public ObjectsInit(WebDriver driver){
        ts1 = new Task_1(driver);
        ts2 = new Task_2(driver);
    }
}
