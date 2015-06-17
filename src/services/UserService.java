package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userService")
public class UserService {

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_XML)
	public String test() {
		return "<name>kenneth</name>";
	}

}
