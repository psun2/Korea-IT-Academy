package net_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ImgFile implements Serializable{
	
	private static final long serialVersionUID = 1;
	
	String fileName;
	
	byte [] data;

	public ImgFile(String fileName, byte[] data) {
		super();
		this.fileName = fileName;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ImgFile [fileName=" + fileName + ", data=" + Arrays.toString(data) + "]";
	}
	
	
	
}


public class ServerObjectMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			
			File ff = new File("fff/teacher.jpg");
			
			FileInputStream fis = new FileInputStream(ff);
			
			System.out.println(fis.available());
			byte [] arr = new byte[fis.available()];
			
			fis.read(arr);
			
			
			
			ImgFile img = new ImgFile(ff.getName(), arr);
			
			
			fis.close();
			
			while(true) {
			
				System.out.println("Ŭ���̾�Ʈ ���� ���");
				
				Socket client = server.accept();	//Ŭ���̾�Ʈ ����
				System.out.println(client.getInetAddress()+"����");
				
				OutputStream os = client.getOutputStream();
				ObjectOutputStream dos = new ObjectOutputStream(os);
				
				//dos.writeUTF("�� �����̱� �� �л��̾�");
				dos.writeObject(img);
				
				dos.flush();
				dos.reset();
				
				dos.close();
				os.close();
			}
			
		} catch (IOException e) {
			try {
				server.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
