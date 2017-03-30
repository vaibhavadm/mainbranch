/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSMessenger.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Mar 29, 2017
 */
@Provider
public class PowerByResponseFilter implements ContainerResponseFilter {

	/* (non-Javadoc)
	 * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.container.ContainerRequestContext, javax.ws.rs.container.ContainerResponseContext)
	 */
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		responseContext.getHeaders().addFirst("X-Powered-By", "VAIBHAV");
		System.out.println(responseContext.getHeaders());
		
	}

}
