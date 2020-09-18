package net_p;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("192.168.1.254",7777);
			System.out.println("서버접속 성공");
			
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			System.out.println("받음:"+ois.readUTF());
			
			ois.close();
			is.close();
			socket.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
