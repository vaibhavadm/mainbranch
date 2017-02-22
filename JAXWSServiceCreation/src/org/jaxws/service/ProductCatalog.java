/**
 * 
 */
package org.jaxws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebEndpoint;

import org.jaxws.service.SEI.PublicCatalogInterface;
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
@WebService(endpointInterface="org.jaxws.service.SEI.PublicCatalogInterface",portName="TestJAXWSPortName",
			serviceName="JAXWSTestProductCatalogService")
public class ProductCatalog implements PublicCatalogInterface {
	ProductCatalogImp productCatalogObj = new ProductCatalogImp();

	/* (non-Javadoc)
	 * @see org.jaxws.service.PublicCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productCatalogObj.getProductCatalogList();
	}
	/* (non-Javadoc)
	 * @see org.jaxws.service.PublicCatalogInterface#getProductSpecificList(java.lang.String)
	 */
	@Override
	public List<String> getProductSpecificList(String category) {
		return productCatalogObj.getProductSpecificList(category);
	}
	/* (non-Javadoc)
	 * @see org.jaxws.service.PublicCatalogInterface#addProductsTOList(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProductsTOList(String product, String category) {
		return productCatalogObj.addProductsTOList(product, category);
	}
	
	/* (non-Javadoc)
	 * @see org.jaxws.service.PublicCatalogInterface#getProductCategoriesV2(java.lang.String)
	 */
	@Override
	@WebMethod
	@WebResult(name="Product")
	public List<Product> getProductCategoriesV2(String category){
		return productCatalogObj.getProductCatalogListV2(category);
		
	}

}
