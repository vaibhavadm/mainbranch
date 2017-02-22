/**
 * 
 */
package org.jaxws.service.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author VAIBHAVREDDYGUDDETI Feb 21, 2017
 */
@XmlRootElement(name="Product")
@XmlType(propOrder={"price", "sku", "name"})
public class Product {
	private String name;
	private String sku;
	private double price;
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param name
	 * @param sku
	 * @param price
	 */
	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	
	/**
	 * JAXB needs a default constructor to configure the customization
	 */
	public Product(){
		
	}
}
