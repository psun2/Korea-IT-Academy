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
//			name = "[�Ķ�����ũ]";

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

				oos.flush(); // �ڽ��� �޸� ����
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

			System.out.println("���� �غ� �Ϸ�");

			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " ���� ����");

			new TCPSingleSender(client).start(); // ��ġ�� ���� �Ⱥ��� ���� �߻�
			new TCPSingleReciever(client).start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			try {

				System.out.println("������ �ݽ��ϴ�.");

				server.close(); // ������ ������ ���������� ������ �ݾ��ֱ� ���Ͽ�...

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

				System.out.println("������ �ݴµ� ������ �ֽ��ϴ�.");
			}
		}

	}

}
