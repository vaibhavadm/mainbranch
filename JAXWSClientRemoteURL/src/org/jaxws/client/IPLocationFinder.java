/**
 * 
 */
package org.jaxws.client;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * @author VAIBHAVREDDYGUDDETI Feb 19, 2017
 * We can generate a stub with the wsimport command from command line 
 * http://www.webservicex.net/geoipservice.asmx?WSDL 
 * wsimport -keep -s src http://www.webservicex.net/geoipservice.asmx?WSDL 
 */

/**
 * To Run this program pass the IP address from RunConfiguration->ProgramArguments
 * @author VAIBHAVREDDYGUDDETI
 *Feb 19, 2017
 */
public class IPLocationFinder {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass a IP address");
		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap stub = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = stub.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}
	}
}
