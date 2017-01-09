/**
 * 
 */
package com.hibernate.pojo;

/**
 * @author VAIBHAVREDDYGUDDETI Jan 8, 2017
 */
public class States {
	public int iD;
	public String state;
	public long population;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	/**
	 * @param iD
	 * @param state
	 * @param population
	 */
	public States(){
	}
	
	
	public States(int iD, String state, long population) {
		super();
		this.iD = iD;
		this.state = state;
		this.population = population;
	}

	@Override
	public String toString() {
		return "States [iD=" + iD + ", state=" + state + ", population=" + population + "]";
	}
	
	
	
	
	
}
