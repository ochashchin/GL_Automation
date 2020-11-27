package api.Jersey;

import org.glassfish.jersey.client.HttpUrlConnectorProvider;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class patch {
    private WebTarget target;

    public patch(String URL) {
        target = ClientBuilder.newClient()
                .property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true)
                .target(URL);
    }

    public boolean status(Form obj) throws Exception {
        Invocation.Builder b = target
                .request(MediaType.APPLICATION_FORM_URLENCODED)
                .accept(MediaType.TEXT_PLAIN_TYPE);

        Response r = b.method("PATCH", Entity.json(obj));

        return r.getStatus() == Response.Status.OK.getStatusCode();
    }
}
