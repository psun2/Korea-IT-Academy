package control_p;

import java.io.IOException;

public class AlphabatChange {

	public static void main(String[] args) throws IOException {

		String res = "";
		int aa = 'a'-'A';
		while(true) {
			
			int buf = System.in.read();
			
			if(buf == 13)
				break;
			
			
			if(buf>='A' && buf<='Z') {
				res += (char)(buf+aa);
			}else if(buf>='a' && buf<='z') {
				res += (char)(buf-aa);
			}else {
				res += (char)buf;
			}
			
		}
		
		System.out.println("res:"+res);

	}

}
