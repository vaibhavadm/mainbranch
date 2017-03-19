package org.vaibhav.jaxrs.JAXRSMessenger.beanparam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;

public class MessageBeanPramFilter {

	private @MatrixParam("param") String matrixParam;
	private @HeaderParam("authData") String headerParam;
	private @CookieParam("JSESSIONID") String cookie;

	public String getMatrixParam() {
		return matrixParam;
	}

	public void setMatrixParam(String matrixParam) {
		this.matrixParam = matrixParam;
	}

	public String getHeaderParam() {
		return headerParam;
	}

	public void setHeaderParam(String headerParam) {
		this.headerParam = headerParam;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

}
