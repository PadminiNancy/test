package com.padmini.book.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.padmini.book.database.UserDao;
import com.padmini.book.model.UserInfo;



@Path("user")
public class UserResource {
	UserDao ud = new UserDao();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
	 public UserInfo addUser(UserInfo user)
	 {	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
		public String addUser()
		 {	*/
		
		UserInfo uf = ud.addUser(user);		
		return user;
	 }

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String login(UserInfo uname)
	{
		UserInfo uf = ud.getUser(uname.getUname());
		if(uf.getUname().equals(uname.getUname()) && uf.getPassword().equals(uname.getPassword()))
		  return "Hello !"+uf.getUname();
		else
			return "Invalid User";
	}
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserInfo getAllUssers()
	{
			return ud.getAllUsers();
	}
*/	
	
}
