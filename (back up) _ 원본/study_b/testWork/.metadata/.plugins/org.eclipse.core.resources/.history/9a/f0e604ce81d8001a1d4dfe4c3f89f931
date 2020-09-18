package net_p;

import java.net.Socket;

public class TCPSingleClientMain {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.1.254", 7777);
			System.out.println("클라이언트 서버 연결 성공");
			
			
			new TCPSingleSender(socket).start();
			new TCPSingleReciever(socket).start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
