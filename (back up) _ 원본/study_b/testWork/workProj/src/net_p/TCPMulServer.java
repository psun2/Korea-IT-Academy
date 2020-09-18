package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class TCPMulServer {
	
	ArrayList<ObjectOutputStream> clients;
	
	
	class TCPMulReciever extends Thread{
		
		String name;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		
		public TCPMulReciever(Socket socket) {
			name = "["+socket.getInetAddress()+"]";
			try {
				oos = new ObjectOutputStream(socket.getOutputStream());
				ois = new ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		@Override
		public void run() {
			try {
				
				sendToAll(name+" ����");
				clients.add(oos);
				sendToAll("������ ��:"+clients.size());
				
				
				while(ois!=null) {
					
					String msg = ois.readUTF();
					System.out.println(name+msg);
					sendToAll(name+msg);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				clients.remove(oos);
				sendToAll(name+" ����");
				sendToAll("������ ��:"+clients.size());
				System.out.println(name+" ���");
			}
		}
	}
	
	
	
	
	void sendToAll(String msg) {
		for (ObjectOutputStream obj : clients) {
			try {
				obj.writeUTF(msg);
				obj.flush();
				obj.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public TCPMulServer() {
		try {
			
			clients = new ArrayList<ObjectOutputStream>();
			
			Collections.synchronizedList(clients);
			
			ServerSocket server = new ServerSocket(7777);
			System.out.println("��������");
			
			while(true) {
				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ ����");
				new TCPMulReciever(client).start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new TCPMulServer();

	}

}
