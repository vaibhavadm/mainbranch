/**
 * 
 */
package org.jaxws.service.SEI;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jaxws.service.business.Product;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Feb 21, 2017
 */

@WebService(name="TestJAXWSService", targetNamespace="http://JAXWSTestNameSpace.com")
public interface ProductCatalogInterface {
	@WebMethod(action="fetchTestCategories", operationName="fetchDifferentProducts")
	List<String> getProductCategories();
	@WebMethod()
	List<String> getProductSpecificList(String category);
	@WebMethod()
	boolean addProductsTOList(String product, String category);
	@WebMethod()
	List<Product> getProductCategoriesV2(String category);

}