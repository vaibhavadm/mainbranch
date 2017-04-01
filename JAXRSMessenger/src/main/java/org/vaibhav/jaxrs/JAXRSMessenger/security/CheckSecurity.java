/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSMessenger.security;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Mar 30, 2017
 */
@Path("secured")
public class CheckSecurity {
	@GET
	@Path("message")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSecureMessage(){
		return "This API is secured";
	}
}
