package api.Jersey;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class get {

    private WebTarget target;

    public get(String URL) {
        target = ClientBuilder.newClient().target(URL);
    }

    public boolean status() {
        Response r = target.request(MediaType.APPLICATION_JSON).get();
        return r.getStatus() == Response.Status.OK.getStatusCode();
    }
}
