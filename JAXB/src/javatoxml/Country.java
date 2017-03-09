/**
 * 
 */
package javatoxml;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author VAIBHAVREDDYGUDDETI Mar 8, 2017
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
// If you are using “XmlAccessType.NONE” then it means you must annotate all
// fields which you want to marshal in output XML. Any field left will not be
// included in JAXB context. So essentially, @XmlElement annotation is required
// on both “employees” and “size” fields. If any of both field is not annotated
// with @XmlElement, that will not be marshalled.
public class Country {
	public String name;
	public double population;
	public ArrayList<State> listOfStates;

	public Country() {
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public double getPopulation() {
		return population;
	}

	@XmlElement
	public void setPopulation(double population) {
		this.population = population;
	}

	public ArrayList<State> getListOfStates() {
		return listOfStates;
	}

	@XmlElementWrapper(name = "statesList")
	@XmlElement(name = "state")
	public void setListOfStates(ArrayList<State> listOfStates) {
		this.listOfStates = listOfStates;
	}

}
