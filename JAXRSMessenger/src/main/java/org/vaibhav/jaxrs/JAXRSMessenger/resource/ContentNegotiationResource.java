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
	public Date testMethod(){
		return Calendar.getInstance().getTime();
		
	}
}
