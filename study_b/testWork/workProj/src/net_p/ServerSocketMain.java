package net_p;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) {

		// 양방향 소통 X- 서버가 클라이언트에 대답만 해줌

		ServerSocket server = null;

		try {

			// 7777 => port 번호
			server = new ServerSocket(7777);

			while (true) {

				// 돌아가는 중에 윈도우즈에서 열린 포트 보기
				// CMD => netstat -an

				// TCP [::]:7777 [::]:0 LISTENING

				System.out.println("클라이언트 접속 대기");

				// 클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + " => 접속");

				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);

				oos.writeUTF(" 구  여   친");

				oos.close();
				os.close();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			try {

				server.close(); // 에러가 발생될때만 서버를 닫아

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}