package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class TCPMulServer {

	// Ŭ���̾�Ʈ ���
	ArrayList<ObjectOutputStream> clients;

	class TCPMulReciever extends Thread {

		String name;
		ObjectOutputStream oos;
		ObjectInputStream ois;

		public TCPMulReciever(Socket socket) {
			// TODO Auto-generated constructor stub
			name = "[" + socket.getLocalSocketAddress() + "]";

			try {
				
				oos = new ObjectOutputStream(socket.getOutputStream());
				ois = new ObjectInputStream(socket.getInputStream());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Override
		public void run() {

			try {

				sendToAll(name + " ����");

				clients.add(oos);

				sendToAll("������ �� : " + clients.size());

				while (ois != null) {

					// sendToAll(name + ois.readUTF());
					String msg = ois.readUTF();
					System.out.println(name + msg);
					sendToAll(name + msg);

				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally {

				clients.remove(oos); // ����� ����� add �� remove�� ��ġ�� �߿�

				sendToAll(name + " ����");

				sendToAll("������ �� : " + clients.size());
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
		// TODO Auto-generated constructor stub

		ServerSocket server = null;

		try {

			clients = new ArrayList<ObjectOutputStream>();

			Collections.synchronizedList(clients);

			server = new ServerSocket(7777);
			System.out.println("���� ����");

			while (true) {

				Socket client = server.accept();

				new TCPMulReciever(client).start();

			}

		} catch (Exception e) {
			// TODO: handle exception

			try {
				server.close();
				System.out.println("���� ����");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new TCPMulServer();
	}

}
