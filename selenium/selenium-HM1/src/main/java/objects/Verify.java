package objects;

public class Verify {

    Verify() {
    }

    public static void run(boolean condition) throws Exception {
        if (!condition) {
            throw new Exception();
        }
    }
}
