package net_p;

import java.net.InetAddress;

public class IpUrlMain {

	public static void main(String[] args) {
		try {
			
			InetAddress ip = InetAddress.getByName("www.naver.com");
			System.out.println(ip);
			
			InetAddress [] arr = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("--------------------");
			for (InetAddress inet : arr) {
				System.out.println(inet);
			}
			System.out.println("--------------------");
			System.out.println(InetAddress.getLocalHost());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
