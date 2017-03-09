/**
 * 
 */
package javatoxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author VAIBHAVREDDYGUDDETI Mar 8, 2017
 */
@XmlRootElement(namespace = "javatoxml.Country")
@XmlAccessorType(XmlAccessType.FIELD)
// If you are using XmlAccessType.FIELD; then only all public fields
// (non-static) will be automatically included for marshalling. No getter will
// be considered. So, if will remove the duplicate problem. e.g. In below code,
// both employees and size fields will be included.
public class State {
	public String stateName;
	public long statePopulation;

	public State() {
	}

	public State(String stateName, long statePopulation) {
		super();
		this.stateName = stateName;
		this.statePopulation = statePopulation;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public long getStatePopulation() {
		return statePopulation;
	}

	public void setStatePopulation(long statePopulation) {
		this.statePopulation = statePopulation;
	}

}
