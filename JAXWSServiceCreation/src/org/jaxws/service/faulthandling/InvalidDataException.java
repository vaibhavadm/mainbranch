/**
 * 
 */
package org.jaxws.service.faulthandling;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Feb 23, 2017
 */
public class InvalidDataException extends Exception {
	public  String errorDetail;
	
	public InvalidDataException(String reason, String errorDetails){
		super(reason);
		this.errorDetail=errorDetails;
	}
	
	public String getFaultInfo(){
		return this.errorDetail;
	}
}
