/**
 * 
 */
package javatoxml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**Java class that converts a java object to XML
 * @author VAIBHAVREDDYGUDDETI Mar 8, 2017
 */
public class JAVAToXML {
	public static void main(String[] args) {
		Country countryObj = new Country();
		countryObj.setName("India");
		countryObj.setPopulation(1000000000);
		ArrayList<State> listStates = new ArrayList<State>();
		State andhraObj = new State("Andhra Pradesh", 70000000);
		listStates.add(andhraObj);
		State karnatakaObj = new State("Karnataka", 50000000);
		listStates.add(karnatakaObj);
		State delhiObj = new State("Delhi", 80000000);
		listStates.add(delhiObj);
		countryObj.setListOfStates(listStates);
		try {
			JAXBContext jaxBContext = JAXBContext.newInstance(Country.class);
			Marshaller marshaller = jaxBContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File("/Users/VAIBHAVREDDYGUDDETI/Softwares/javaworkfolder/JAXB/Country.xml");
			marshaller.marshal(countryObj, file);
			marshaller.marshal(countryObj, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
