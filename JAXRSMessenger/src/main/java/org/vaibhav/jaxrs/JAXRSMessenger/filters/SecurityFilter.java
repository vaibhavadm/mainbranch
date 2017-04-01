/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSMessenger.filters;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

//import org.glassfish.jersey.internal.util.Base64;

import org.apache.commons.codec.binary.Base64;

//This is a example of how BasicAuth work in Jersey - JAXRS
/**
 * @author VAIBHAVREDDYGUDDETI Mar 30, 2017
 */
@Provider
public class SecurityFilter implements ContainerRequestFilter {
	// Once you add the username and password in the Auth section a header
	// will be created simillar to this (Authorization = {"Authorization":"Basic
	// dXNlcjpwYXNzd29yZA=="} )

	public static final String AUTHORIZATION_HEADER_KEY = "Authorization";
	public static final String AUTHORIZATION_HEADER_PREFIX = "Basic";
	public static final String SECURED_URL_PATH = "secured";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.ws.rs.container.ContainerRequestFilter#filter(javax.ws.rs.container
	 * .ContainerRequestContext)
	 */
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		if (requestContext.getUriInfo().getPath().contains(SECURED_URL_PATH)) {
			List<String> authHeader = requestContext.getHeaders().get(AUTHORIZATION_HEADER_KEY);
			if (authHeader != null && authHeader.size() > 0) {
				String authToken = authHeader.get(0);
				authToken = authToken.replaceFirst(AUTHORIZATION_HEADER_PREFIX, "");
				byte[] decodeBase64 = Base64.decodeBase64(authToken);
				String decodedToken = new String(decodeBase64, "UTF-8");
				StringTokenizer tokenier = new StringTokenizer(decodedToken, ":");
				String userName = tokenier.nextToken();
				String password = tokenier.nextToken();
				if (userName.equals("user") && password.equals("password")) {
					return;
				}
			}

			Response build = Response.status(Response.Status.UNAUTHORIZED)
					.entity("User need to be authenticated to access this resource").build();
			requestContext.abortWith(build);
		}

	}
}
