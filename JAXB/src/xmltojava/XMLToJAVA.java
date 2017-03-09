/**
 * 
 */
package xmltojava;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javatoxml.Country;
import javatoxml.State;

/**Java class that converts a XML to Java object
 * @author VAIBHAVREDDYGUDDETI Mar 8, 2017
 */
public class XMLToJAVA {
	public static void main(String[] args) {
		JAXBContext jaxBContext;
		Country countryObj = null;
		try {
			jaxBContext = JAXBContext.newInstance(Country.class);
			Unmarshaller unMarshaller = jaxBContext.createUnmarshaller();
			File file = new File("/Users/VAIBHAVREDDYGUDDETI/Softwares/javaworkfolder/JAXB/Country.xml");
			countryObj = (Country) unMarshaller.unmarshal(file);
			System.out.println("Country Name is : " + countryObj.getName());
			System.out.println("Country Population is : " + countryObj.getPopulation());
			for (State i : countryObj.getListOfStates()) {
				System.out.println("States inside this County object ");
				System.out.println("State Name is : " + i.getStateName());
				System.out.println("State Population is : " + i.getStatePopulation());
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
