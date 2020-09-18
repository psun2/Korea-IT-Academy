package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class MulServerMain {
	
	ArrayList<DataOutputStream>arr;
	
	public MulServerMain() {
		arr = new ArrayList<DataOutputStream>();
		
		Collections.synchronizedList(arr);
		
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버시작");
			
			while(true) {
				Socket client = server.accept();
				
				new MulReceiver(client).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	class MulReceiver extends Thread{
		
		String name;
		DataOutputStream dos;
		DataInputStream dis;
		
		public MulReceiver(Socket client) {
			
			try {
				name = "["+client.getInetAddress()+"]";
				dos = new DataOutputStream(client.getOutputStream());
				dis = new DataInputStream(client.getInputStream());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			
			try {
				sendToAll(name+"입장");
				arr.add(dos);
				
				while(dis!=null) {
					sendToAll(dis.readUTF());
				}

			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				
				arr.remove(dos);
				sendToAll(name+"퇴장");
				
				try {
					dis.close();
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}	
		}
	
	}

	void sendToAll(String msg) {
		for (DataOutputStream dos: arr) {
			try {
				dos.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		
		
		new MulServerMain();

	}

}
