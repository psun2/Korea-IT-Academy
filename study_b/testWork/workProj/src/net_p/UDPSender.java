package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DatagramSocket ds = new DatagramSocket();

			String msg = "udp ������� ������ �޼���";

			System.out.println(InetAddress.getLocalHost());
			// DESKTOP-R2NKGM0/192.168.1.124
			System.out.println(InetAddress.getLocalHost() instanceof InetAddress);

//			String local = (String)(InetAddress.getLocalHost());

			InetAddress addr = InetAddress.getByName("192.168.1.124");
			
			DatagramPacket dp = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length, 
					addr, 
					7777);
			
			ds.send(dp);
			
			ds.close();
			
			System.out.println("udp ���ۿϷ�");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
