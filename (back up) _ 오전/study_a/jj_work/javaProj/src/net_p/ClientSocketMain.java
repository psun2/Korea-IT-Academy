package net_p;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.1.254", 7777);
		
			System.out.println("�������� ����");
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println("����:"+dis.readUTF());
			
			dis.close();
			is.close();
			socket.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
