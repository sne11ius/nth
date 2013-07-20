package nu.wasis.nth.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;

@Path("/")
public class IndexResource {

    private static final Logger LOG = Logger.getLogger(IndexResource.class);

    @GET
    public String getIndex() {
        LOG.debug("Yep.");
        return "Yep.";
    }

}
