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

/**
 * @author VAIBHAVREDDYGUDDETI Feb 21, 2017
 * 
 */
@WebService(targetNamespace="http://test.webservice.com")
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	@WebMethod
	@WebResult(partName="lookupResponse")
	public String getShopInfo(@WebParam(partName="lookupName") String property) {
		String returnValue = "Invalid Parameter";
		if (property.equals("shop")) {
			returnValue = "myTestShop";
		} else if (property.equals("since")) {
			returnValue = "Since 2017";
		}
		return returnValue;
	}
}
