package Introduction;

import java.net.InetAddress;

public class Ip{
	public static void main(String[] args) throws Exception{
		InetAddress myIP = InetAddress.getLocalHost();

		System.out.println("IP addres: " +myIP.getHostAddress());
	}
}