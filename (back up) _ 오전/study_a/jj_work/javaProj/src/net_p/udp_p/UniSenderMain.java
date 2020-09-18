package net_p.udp_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UniSenderMain {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();

		String msg = "일찍 좀 다니자";
		
		InetAddress addr = InetAddress.getByName("192.168.1.254");
		
		DatagramPacket data = new DatagramPacket(
				msg.getBytes(), 
				msg.getBytes().length, 
				addr, 
				7777);
				
		ds.send(data);
		
		ds.close();
	}

}
