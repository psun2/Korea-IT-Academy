package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InUrlMain {

	public static void main(String[] args) {

		try {

			InetAddress ip = InetAddress.getByName("www.naver.com");

			System.out.println(ip);
			// �ּҰ� �� �ٸ��� ���� why?
			// ���̹��� �� �� �ִ� ������ �ϳ��� �ƴϱ� ����...

			System.out.println("-----------------------------");

			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");

			for (InetAddress inetAddress : arr) {
				System.out.println(inetAddress);
			}

			System.out.println("-----------------------------");

			// �� IP �ּ�
			System.out.println(InetAddress.getLocalHost());

			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
