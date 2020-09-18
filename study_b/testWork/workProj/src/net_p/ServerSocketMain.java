package net_p;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) {

		// ����� ���� X- ������ Ŭ���̾�Ʈ�� ��丸 ����

		ServerSocket server = null;

		try {

			// 7777 => port ��ȣ
			server = new ServerSocket(7777);

			while (true) {

				// ���ư��� �߿� ��������� ���� ��Ʈ ����
				// CMD => netstat -an

				// TCP [::]:7777 [::]:0 LISTENING

				System.out.println("Ŭ���̾�Ʈ ���� ���");

				// Ŭ���̾�Ʈ ����
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + " => ����");

				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);

				oos.writeUTF(" ��  ��   ģ");

				oos.close();
				os.close();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			try {

				server.close(); // ������ �߻��ɶ��� ������ �ݾ�

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}