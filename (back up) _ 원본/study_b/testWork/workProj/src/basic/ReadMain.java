package basic;

import java.io.IOException;

public class ReadMain {

	public static void main(String[] args) throws IOException {
		
		String ttt = "";
		int ch = System.in.read();
		ttt += (char)ch;
		//System.out.println(ch+":"+(char)ch);
		
		ch = System.in.read();
		ttt += (char)ch;
		//System.out.println(ch);
		
		ch = System.in.read();
		ttt += (char)ch;
		//System.out.println(ch);

		System.out.println(ttt);
	}

}
