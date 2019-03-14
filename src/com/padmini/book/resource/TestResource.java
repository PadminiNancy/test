package com.padmini.book.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("resourcebook")
public class TestResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	 public String getAllMessage()
	 {	 
		 return "Test resource called";	 
	 }
	
}
