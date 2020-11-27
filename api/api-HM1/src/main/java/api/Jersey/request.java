package api.Jersey;

public class request {

    public request() {
    }

    public static get get(String URL) {
        return new get(URL);
    }

    public static post post(String URL) {
        return new post(URL);
    }
}
