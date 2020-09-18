package net_p;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {

	public static void main(String[] args) {

		// 양방향 소통 X- 서버가 클라이언트에 대답만 해줌

		try {

			System.out.println(InetAddress.getLocalHost());
			// 192.168.1.124

//			Socket socket = new Socket("127.0.0.1", 7777);
//			Socket socket = new Socket("192.168.1.254", 7777);
			Socket socket = new Socket("192.168.1.226", 7777);
			// 클라이언트 접속 대기
			// /127.0.0.1 => 접속
			// 클라이언트 접속 대기

			System.out.println("서버접속 성공");

			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);

			System.out.println("받음 : " + ois.readUTF());

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
