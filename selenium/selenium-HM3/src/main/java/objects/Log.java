package objects;

import org.testng.Reporter;

public class Log {
    private static int steps = 1;

    public Log() {
    }

    public static void printLn(String message) {
        if (message.charAt(0) == '$'){
            steps = 1;
            message = message.substring(1);
        }
        Reporter.log(steps++ + ". " + message + "<br>");
    }
}
