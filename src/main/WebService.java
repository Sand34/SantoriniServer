
package main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// http://localhost:8080/TestWS/rest/MonService/helloWorld
@Path("/MonService")
public class WebService {

	// http://localhost:8080/santorini/rest/MonService/helloWorld
	@Path("/helloWorld")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	// Methode basique pour tester notre webService avant de travailler.
	public String hello() {
		System.out.println("Hello World !!");
		return "HelloWorld";
	}
}
