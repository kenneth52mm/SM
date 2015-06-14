package services;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ejemplo")
public class ejemplo {

	@GET
	// @Path here defines method level path. Identifies the URI path that a
	// resource class method will serve requests for.
	@Path("/name/{i}")
	// @Produces here defines the media type(s) that the methods
	// of a resource class can produce.
	@Produces(MediaType.TEXT_PLAIN)
	// @PathParam injects the value of URI parameter that defined in @Path
	// expression, into the method.
	public String userName(@PathParam("i") String i) {
	//	String name = i;
		return "<User>" + "<Name>" +i+ "</Name>" + "</User>";
		//return i;
	}

	@GET
	@Path("/persona/")
	@Produces(MediaType.APPLICATION_JSON)
	public persona person() {	
		return new persona("kenneth");
	}

}
