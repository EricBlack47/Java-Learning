package chapter13.interadress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia=InetAddress.getByName("bilibli.com");
		System.out.println(ia);
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());
		System.out.println(ia.isSiteLocalAddress());
		InetAddress ia2=InetAddress.getLocalHost();
		System.out.println(ia2);
	}

}
