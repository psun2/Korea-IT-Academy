package net_p;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) {

		ServerSocket server = null;
		
		try {
			server = new ServerSocket(7777);
			
			while(true) {
				System.out.println("클라이언트 접속 대기");
				
				//클라이언트 접속
				Socket client = server.accept(); 
				System.out.println(client.getInetAddress()+" 접속");
				
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeUTF("잘하자");
				
				oos.close();
				os.close();
				
			}

			
		} catch (IOException e) {
			
			e.printStackTrace();
			
			try {
				server.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
