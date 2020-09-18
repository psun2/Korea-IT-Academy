package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSingleSender extends Thread{
	
	String name;
	ObjectOutputStream oos;
	
	public TCPSingleSender(Socket socket) {
		try {
			name = "["+InetAddress.getLocalHost()+"]";
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(oos!=null) {
				
				String ttt = sc.nextLine();
				//System.out.println(ttt+"보냄");
				oos.writeUTF(name+ttt);
				
				oos.flush();
				oos.reset();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				System.out.println("센더 종료");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}


class TCPSingleReciever extends Thread{
	
	ObjectInputStream ois;
	
	public TCPSingleReciever(Socket socket) {
		try {
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(ois!=null) {
				System.out.println(ois.readUTF());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				System.out.println("리시버 종료");
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}



public class TcpSingleServerMain {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버준비 완료");
			
			Socket client = server.accept();
			System.out.println(client.getInetAddress()+" 접속");
			
			
			new TCPSingleSender(client).start();
			new TCPSingleReciever(client).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
