package api.Jersey;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class put {
    private WebTarget target;

    public put(String URL) {
        target = ClientBuilder.newClient().target(URL);
    }

    public boolean status(Form obj) {
        Response r = target.request(MediaType.APPLICATION_FORM_URLENCODED)
                .accept(MediaType.TEXT_PLAIN_TYPE)
                .put(Entity.form(obj));

        return r.getStatus() == Response.Status.OK.getStatusCode();
    }
}
