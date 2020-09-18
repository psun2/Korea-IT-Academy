package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoketMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			
			while(true) {
			
				System.out.println("Ŭ���̾�Ʈ ���� ���");
				
				Socket client = server.accept();	//Ŭ���̾�Ʈ ����
				System.out.println(client.getInetAddress()+"����");
				
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("�� �����̱� �� �л��̾�");
				
				dos.close();
				os.close();
			}
			
		} catch (IOException e) {
			try {
				server.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
