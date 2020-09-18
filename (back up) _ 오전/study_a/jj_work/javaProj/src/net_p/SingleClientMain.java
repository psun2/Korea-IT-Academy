package net_p;

import java.net.Socket;

public class SingleClientMain {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.1.254",7777);
			System.out.println("서버 연결 성공");
			
			new SingleSender(socket).start();
			new SingleReciever(socket).start();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
