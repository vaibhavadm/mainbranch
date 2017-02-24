/**
 * 
 */
package org.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.jaxws.service.faulthandling.InvalidDataException;

/**
 * @author VAIBHAVREDDYGUDDETI Feb 21, 2017
 * 
 */
@WebService(targetNamespace="http://test.webservice.com")
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	@WebMethod
	@WebResult(partName="lookupResponse")
	public String getShopInfo(@WebParam(partName="lookupName") String property) throws InvalidDataException {
		String returnValue = "Invalid Parameter";
		if (property.equals("shop")) {
			returnValue = "myTestShop";
		} else if (property.equals("since")) {
			returnValue = "Since 2017";
		}else{
			throw new InvalidDataException("Invalid Data", property + " is not a valid type");
		}
		return returnValue;
	}
}
