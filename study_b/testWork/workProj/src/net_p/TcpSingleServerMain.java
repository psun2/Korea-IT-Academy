package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSingleSender extends Thread {

	String name;
	ObjectOutputStream oos;

	public TCPSingleSender(Socket socket) {
		// TODO Auto-generated constructor stub
		try {

			name = "[" + InetAddress.getLocalHost() + "]";
//			name = "[파란마스크]";

			oos = new ObjectOutputStream(socket.getOutputStream());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		Scanner sc = new Scanner(System.in);
//		String ssc = JOptionPane.showInputDialog("Input");

		try {

			while (oos != null) {
//				oos.writeUTF(name + ssc);
				oos.writeUTF(name + sc.nextLine());

				oos.flush(); // 자신의 메모리 갱신
//				oos.reset();

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// TODO: handle finally clause
			try {

				oos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class TCPSingleReciever extends Thread {

	ObjectInputStream ois;

	public TCPSingleReciever(Socket socket) {
		// TODO Auto-generated constructor stub

		try {

			ois = new ObjectInputStream(socket.getInputStream());

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		try {

			while (ois != null) {

				System.out.println(ois.readUTF());

			}

		} catch (Exception e) {

			// TODO: handle exception
		} finally {

			// TODO: handle finally clause
			try {

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
		// TODO Auto-generated method stub

		ServerSocket server = null;

		try {

			server = new ServerSocket(7777);

			System.out.println("서버 준비 완료");

			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 접속 성공");

			new TCPSingleSender(client).start(); // 위치에 따라 안보는 오류 발생
			new TCPSingleReciever(client).start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			try {

				System.out.println("서버를 닫습니다.");

				server.close(); // 서버에 문제가 생겼을때만 서버를 닫아주기 위하여...

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

				System.out.println("서버를 닫는데 문제가 있습니다.");
			}
		}

	}

}
