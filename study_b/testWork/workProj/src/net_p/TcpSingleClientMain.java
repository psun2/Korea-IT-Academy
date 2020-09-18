package net_p;

import java.net.InetAddress;
import java.net.Socket;

public class TcpSingleClientMain {

	public static void main(String[] args) {

		try {

//			Socket socket = new Socket(InetAddress.getLocalHost(), 7777);
//			Socket socket = new Socket("192.168.1.12", 7777);
//			Socket socket = new Socket("192.168.1.115", 7777);
			Socket socket = new Socket("192.168.1.17", 7777);
			System.out.println("클라이언트 서버 연결 성공");
			
//			while(true) {
//				
//				
//				
//			}

			new TCPSingleReciever(socket).start();
			new TCPSingleSender(socket).start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
