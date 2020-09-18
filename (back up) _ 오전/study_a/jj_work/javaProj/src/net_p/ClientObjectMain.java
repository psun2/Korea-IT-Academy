package net_p;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientObjectMain {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.1.254", 7777);
		
			System.out.println("서버접속 성공");
			InputStream is = socket.getInputStream();
			ObjectInputStream dis = new ObjectInputStream(is);
			
			ImgFile img = (ImgFile)dis.readObject();
			
			System.out.println("받음:"+img);
			
			dis.close();
			is.close();
			socket.close();
			
			FileOutputStream fos = new FileOutputStream("dst/"+img.fileName);
			
			fos.write(img.data);
			
			fos.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
