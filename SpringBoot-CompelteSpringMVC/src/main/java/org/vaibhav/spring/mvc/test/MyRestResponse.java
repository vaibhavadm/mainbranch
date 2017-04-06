/**
 * 
 */
package org.vaibhav.spring.mvc.test;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 5, 2017
 */
public class MyRestResponse {

	private String message;

	public MyRestResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}