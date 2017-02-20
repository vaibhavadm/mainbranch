/**
 * 
 */
package org.jaxws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jaxws.service.business.ProductCatalogImp;

/**
 * @author VAIBHAVREDDYGUDDETI Feb 19, 2017
 */
@WebService
public class ProductCatalog {
	ProductCatalogImp productCatalogObj = new ProductCatalogImp();

	@WebMethod
	public List<String> getProductCategories() {
		return productCatalogObj.getProductCatalogList();
	}

	public List<String> getProductSpecificList(String category) {
		return productCatalogObj.getProductSpecificList(category);
	}

	public boolean addProductsTOList(String product, String category) {
		return productCatalogObj.addProductsTOList(product, category);
	}

}
