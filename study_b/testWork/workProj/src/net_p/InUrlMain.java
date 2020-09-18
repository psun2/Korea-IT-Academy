package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InUrlMain {

	public static void main(String[] args) {

		try {

			InetAddress ip = InetAddress.getByName("www.naver.com");

			System.out.println(ip);
			// 주소가 다 다르게 나옴 why?
			// 네이버를 들어갈 수 있는 서버가 하나가 아니기 때문...

			System.out.println("-----------------------------");

			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");

			for (InetAddress inetAddress : arr) {
				System.out.println(inetAddress);
			}

			System.out.println("-----------------------------");

			// 내 IP 주소
			System.out.println(InetAddress.getLocalHost());

			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
