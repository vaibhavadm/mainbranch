package org.vaibhav.jaxrs.JAXRSMessenger.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.vaibhav.jaxrs.JAXRSMessenger.beanparam.MessageBeanPramFilter;

@Path("/otherpathparams")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class ParamResource {
	// matrixParam is simillar to Query param istead of '?' we use a ';'
	// headerParam allows us to use the header info/metadata-helps in
	// authentication
	// cookieParam allows us to use the cookies
	// formParam- allows the key/value pairs of form data when data is submitted
	// via a form to jersey-not usefull in realtime
	@GET
	@Path("/annotations")
	public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
											@HeaderParam("authData") String headerParam,
											@CookieParam("JSESSIONID") String cookie) {
		// the parameter inside the cookieParam should be the actual name of the
		// cookie- here in postman
		return "Matrix param: " + matrixParam + "Header data : " + headerParam + "Cookie name: " + cookie;
	}
	
	
	

	// If we are not sure what parameter names as as shown in above piece of
	// code, then we can use the below code to get all info and then sort what
	//	we need.
	@GET
	@Path("/context")
	public String getallParamswithContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {
		String path = uriInfo.getAbsolutePath().toString();
		return "Path is: " + path + " Http Header info is: " + headers.getCookies().toString();
	}
	
	
	// If we have multiple annotations in a method then its better we use
	// BeanContext which bundles all the annotations into one bean
	@GET
	@Path("/beanannotation")
	public String getallParamswithBeanParams(@BeanParam MessageBeanPramFilter messageBean){
		return "Matrix param: " + messageBean.getMatrixParam() + " Header data : " + messageBean.getHeaderParam()
				+ " Cookie name: " + messageBean.getCookie();
	}
}
