package test.net.webservicex;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;

public class TestIP {

	public static void main(String[] args) {
		if (args.length < 0) {
			System.out.println("You need to key in ip address for testing");
		}else {
			String ipAddress = args[0];
			GeoIPService service = new GeoIPService();
			GeoIP geoIP = service.getGeoIPServiceSoap().getGeoIP(ipAddress);
			System.out.println(geoIP.getIP());
			System.out.println(geoIP.getCountryCode());
			System.out.println(geoIP.getCountryName());
			System.out.println(geoIP.getReturnCode());
			System.out.println(geoIP.getReturnCodeDetails());
		}

	}

}
