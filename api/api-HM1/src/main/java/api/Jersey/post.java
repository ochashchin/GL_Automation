package api.Jersey;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.Future;

public class post {
    private WebTarget target;

    public post(String URL) {
        target = ClientBuilder.newClient().target(URL);
    }

    public boolean status(Form obj) throws Exception {
        Future<Response> f = target.request(MediaType.APPLICATION_FORM_URLENCODED)
                .buildPost(Entity.form(obj))
                .submit(Response.class);

        Response r = f.get();
        return r.getStatus() == Response.Status.CREATED.getStatusCode();
    }
}
