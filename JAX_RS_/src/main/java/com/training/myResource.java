package com.training;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("myresource")
public class myResource {
	@GET
	public String getMessage() {
		
		return "My Friend Java";
	}
}


