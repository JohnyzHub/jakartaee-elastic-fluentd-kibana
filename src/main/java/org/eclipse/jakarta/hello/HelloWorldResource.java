package org.eclipse.jakarta.hello;

import java.util.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {

	@Inject
	private Logger logger;

	private static int index = 0;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Hello hello(@QueryParam("name") String name) {
		if ((name == null) || name.trim().isEmpty()) {
			name = "world";
		}

		Hello hello = new Hello(name);
		logger.info(String.format("%d:%s", index++, hello));
		return hello;
	}
}