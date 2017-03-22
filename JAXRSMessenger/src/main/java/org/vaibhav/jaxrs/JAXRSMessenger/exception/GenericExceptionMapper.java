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
 * This class is a GenericExceptionMapper that catches all errors that are not
 * customized like DataNotFoundException. If exception class in not handled then
 * this class catched the exception instead of showing server error page
 * 
 * @author VAIBHAVREDDYGUDDETI Mar 21, 2017
 */
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		// TODO Auto-generated method stub
		ErrorMessage genericError = new ErrorMessage(ex.getMessage(), 500, "http://vaibhavjavaworld.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(genericError).build();
	}

}
