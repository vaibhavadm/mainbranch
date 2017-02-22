/**
 * 
 */
package org.jaxws.service.SEI;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.jaxws.service.business.Product;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Feb 21, 2017
 */

@WebService(name="TestJAXWSService", targetNamespace="http://JAXWSTestNameSpace.com")
public interface ProductCatalogInterface {
	@WebMethod(action="fetchTestCategories", operationName="fetchDifferentProducts")
	public abstract List<String> getProductCategories();
	@WebMethod()
	public abstract List<String> getProductSpecificList(String category);
	@WebMethod()
	public abstract boolean addProductsTOList(String product, String category);
	@WebMethod()
	@WebResult(name="Products")
	public abstract List<Product> getProductCategoriesV2(String category);

}