package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class SingleSender extends Thread{

	String name;
	DataOutputStream dos;
	
	public SingleSender(Socket socket) {
		try {
			name = "["+InetAddress.getLocalHost()+"]";
			dos = new DataOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			while(dos!=null) {
				
				String msg = sc.nextLine();
				dos.writeUTF(name+msg);
			
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}


class SingleReciever extends Thread{
	DataInputStream dis;
	
	public SingleReciever(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(dis!=null) {
				
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}





public class SIngleServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);

			System.out.println("클라이언트 접속 대기");
			
			Socket client = server.accept();	//클라이언트 접속
			System.out.println(client.getInetAddress()+"접속");
			
			new SingleSender(client).start();
			new SingleReciever(client).start();
			
						
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
