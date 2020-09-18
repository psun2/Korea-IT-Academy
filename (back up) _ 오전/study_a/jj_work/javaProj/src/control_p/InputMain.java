package control_p;

import java.io.IOException;

public class InputMain {

	public static void main(String[] args) throws IOException {
//		System.out.print("입력:");
//		int ii = System.in.read();
//		System.out.println("출력:"+ii+","+(char)ii);
		
		
		String res = "";
		System.out.print("입력:");
		
		while(true) {
		
			char ch = (char)System.in.read();
			
//			System.out.println((int)ch);
			if(ch == 13) //enter  키
				break;
			
			res += ch;
		}
		
		System.out.println("출력:"+res);
		
		
		///1. System.in.read 를 이용하여 숫자를 입력받아 + 100 하여 출력하세요
		
		
		///2. System.in.read 를 이용하여 숫자 두개를 입력받아 두수 사이의 솟수 갯수를 출력하세요
		
		
		
		
	}

}
