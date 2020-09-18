package net_p.udp_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

class UDPChatSender extends Thread{
	InetAddress addr;
	int port;
	public UDPChatSender(String addr, int port) throws Exception {
		super();
		this.addr = InetAddress.getByName(addr);
		this.port = port;
	}
	
	@Override
	public void run() {
		DatagramSocket ds;
		Scanner sc = new Scanner(System.in);
		try {
			ds = new DatagramSocket();
			
			while(true) {
				String msg = sc.nextLine();
				
				DatagramPacket data = new DatagramPacket(
						msg.getBytes(), 
						msg.getBytes().length, 
						addr, 
						port);
						
				ds.send(data);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

class UDPChatReciver extends Thread{
	int port;

	public UDPChatReciver(int port) {
		super();
		this.port = port;
	}
	
	@Override
	public void run() {
		DatagramSocket ds;
		try {
			ds = new DatagramSocket(port);
			
			while(true) {
				byte [] arr = new byte[1024];
				
				DatagramPacket data = new DatagramPacket(arr, arr.length);
				
				ds.receive(data);
				
				System.out.println(data.getAddress()+":"+new String(arr));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}



public class UDPUniChatting {

	public static void main(String[] args) throws Exception {
		new UDPChatSender("192.168.1.255", 7777).start();
		new UDPChatReciver(7777).start();
	}

}
