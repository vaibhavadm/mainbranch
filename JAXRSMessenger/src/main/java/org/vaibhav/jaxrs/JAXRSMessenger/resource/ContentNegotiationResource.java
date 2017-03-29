/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSMessenger.resource;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Mar 26, 2017
 */
@Path("contentNegotiation")
public class ContentNegotiationResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("customMessageBodyWriter")
	//The return type is the Date which is a custom MediaType
	public Date getDate(){
		return Calendar.getInstance().getTime();
		
	}
	
	//the below code is to send the custom MediaType
	@GET
	@Produces("text/shortdate")
	@Path("customMediaType")
	//The return type is the Date which is a custom MediaType
	public Date getShortDate(){
		return Calendar.getInstance().getTime();
		
	}
}
