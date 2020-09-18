package net_p;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {

	public static void main(String[] args) {

		// ����� ���� X- ������ Ŭ���̾�Ʈ�� ��丸 ����

		try {

			System.out.println(InetAddress.getLocalHost());
			// 192.168.1.124

//			Socket socket = new Socket("127.0.0.1", 7777);
//			Socket socket = new Socket("192.168.1.254", 7777);
			Socket socket = new Socket("192.168.1.226", 7777);
			// Ŭ���̾�Ʈ ���� ���
			// /127.0.0.1 => ����
			// Ŭ���̾�Ʈ ���� ���

			System.out.println("�������� ����");

			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);

			System.out.println("���� : " + ois.readUTF());

			ois.close();
			is.close();

			socket.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
