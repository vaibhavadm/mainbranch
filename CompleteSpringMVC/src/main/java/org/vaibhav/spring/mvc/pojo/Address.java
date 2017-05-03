/**
 * 
 */
package org.vaibhav.spring.mvc.pojo;

/**
 * @author VAIBHAVREDDYGUDDETI May 2, 2017
 */
public class Address {
	private String steetNum;
	private String aptNumORhouseNum;
	private String city;
	private String state;
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private long zipCode;

	public String getSteetNum() {
		return steetNum;
	}

	public void setSteetNum(String steetNum) {
		this.steetNum = steetNum;
	}

	public String getAptNumORhouseNum() {
		return aptNumORhouseNum;
	}

	public void setAptNumORhouseNum(String aptNumORhouseNum) {
		this.aptNumORhouseNum = aptNumORhouseNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

}
