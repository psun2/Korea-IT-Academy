package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			
			String msg = "udp 통신으로 보내는 메세지";
			
			InetAddress addr = InetAddress.getByName("192.168.1.254");
			
			DatagramPacket dp = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length, 
					addr, 
					7777);
			
			ds.send(dp);
			
			ds.close();
			
			System.out.println("udp 전송완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
