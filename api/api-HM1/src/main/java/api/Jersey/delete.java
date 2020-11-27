package api.Jersey;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class delete {

    private WebTarget target;

    public delete(String URL) {
        target = ClientBuilder.newClient().target(URL);
    }

    public boolean status() {
        Response r = target.request().delete();

        return r.getStatus() == Response.Status.NO_CONTENT.getStatusCode();
    }
}
