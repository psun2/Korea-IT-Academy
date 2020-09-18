package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class TCPMulServer {

	// 클라이언트 명단
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

				sendToAll(name + " 입장");

				clients.add(oos);

				sendToAll("접속자 수 : " + clients.size());

				while (ois != null) {

					// sendToAll(name + ois.readUTF());
					String msg = ois.readUTF();
					System.out.println(name + msg);
					sendToAll(name + msg);

				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally {

				clients.remove(oos); // 입장과 퇴장시 add 와 remove의 위치가 중요

				sendToAll(name + " 퇴장");

				sendToAll("접속자 수 : " + clients.size());
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
			System.out.println("서버 시작");

			while (true) {

				Socket client = server.accept();

				new TCPMulReciever(client).start();

			}

		} catch (Exception e) {
			// TODO: handle exception

			try {
				server.close();
				System.out.println("서버 종료");
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
