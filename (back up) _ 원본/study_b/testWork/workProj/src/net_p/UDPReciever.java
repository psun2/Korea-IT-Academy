package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReciever {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(7777);
			
			byte [] arr = new byte[1024];
			
			DatagramPacket dp = new DatagramPacket(arr, arr.length);
			
			ds.receive(dp);
			
			ds.close();
			
			System.out.println(dp.getAddress());
			System.out.println(new String(arr));
			
			System.out.println("수신완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
