/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSMessenger.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Mar 29, 2017
 */
@Provider
public class LoggingFilter implements ContainerResponseFilter, ContainerRequestFilter {

	/* (non-Javadoc)
	 * @see javax.ws.rs.container.ContainerRequestFilter#filter(javax.ws.rs.container.ContainerRequestContext)
	 */
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Request Filter");
		System.out.println(requestContext.getHeaders());
	}

	/* (non-Javadoc)
	 * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.container.ContainerRequestContext, javax.ws.rs.container.ContainerResponseContext)
	 */
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Response Filter");
		System.out.println(requestContext.getHeaders());
		
	}

}
