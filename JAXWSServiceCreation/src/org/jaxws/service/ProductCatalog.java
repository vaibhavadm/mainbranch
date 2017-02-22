/**
 * 
 */
package org.jaxws.service;

import java.util.List;

import javax.jws.WebService;

import org.jaxws.service.SEI.ProductCatalogInterface;
import org.jaxws.service.business.Product;
import org.jaxws.service.business.ProductCatalogImp;

/**
 * @author VAIBHAVREDDYGUDDETI Feb 19, 2017
 * @WebService -( name: used to change the "portType" name in WSDL,portName: used to change the "port" name in WSDL
 * 				serviceName: changes the  entire WSDL name in URL, targetNamespace: changes the default packaging namespace in WSDL)
 * 
 * @WebMethod -(exclude: true makes the method to be excluded from WSDL,action: changes the soap action name,
 * 				operationName: changes the WSDL method name
 * 
 * The above mentioned code is changed and some annotations are moved to SEI
 * As an Interface has multiple implementations, the serviceName, portName are used in service Implementation rather than in Interface 
 */
@WebService(endpointInterface="org.jaxws.service.SEI.ProductCatalogInterface",portName="TestJAXWSPortName",
			serviceName="JAXWSTestProductCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	ProductCatalogImp productCatalogObj = new ProductCatalogImp();

	@Override
	public List<String> getProductCategories() {
		return productCatalogObj.getProductCatalogList();
	}
	
	@Override
	public List<String> getProductSpecificList(String category) {
		return productCatalogObj.getProductSpecificList(category);
	}
	
	@Override
	public boolean addProductsTOList(String product, String category) {
		return productCatalogObj.addProductsTOList(product, category);
	}
	
	
	@Override
	public List<Product> getProductCategoriesV2(String category){
		return productCatalogObj.getProductCatalogListV2(category);
		
	}

}
