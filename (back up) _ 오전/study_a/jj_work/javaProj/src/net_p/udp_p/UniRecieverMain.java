package net_p.udp_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UniRecieverMain {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(7777);
		
		byte [] arr = new byte[1024];
		
		DatagramPacket data = new DatagramPacket(arr, arr.length);
		
		ds.receive(data);
		
		System.out.println(data.getAddress());
		System.out.println(new String(arr));
		
		ds.close();

	}

}
