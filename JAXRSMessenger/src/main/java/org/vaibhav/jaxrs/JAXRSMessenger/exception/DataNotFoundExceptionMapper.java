/**
 * 
 */
package org.vaibhav.jaxrs.JAXRSMessenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.vaibhav.jaxrs.JAXRSMessenger.model.ErrorMessage;

/**
 * @author VAIBHAVREDDYGUDDETI Mar 21, 2017
 */
//the Provider annotation is used to register the class with jax-rs.
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errorMsg = new ErrorMessage(ex.getMessage(), 404, "http://vaibhavjavaworld.com");
		return Response.status(Status.NOT_FOUND).entity(errorMsg).build();
	}

}
