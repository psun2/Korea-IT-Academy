package basic;

import java.io.IOException;

public class ReadMain {
	
	public static void main(String[] ages) throws IOException{
		
		String ttt = "";
		
		// 사용자의 입력을 받습니다.
		// 콘솔창에 입력 되는 값은 모두 아스크 코드로 입력 받습니다.
		
		int ch = System.in.read();
//		System.in.read() 는 한자리 밖에 입력 받지 못합니다.
		ttt += (char) ch;
		
//		입력값 : dd
//		출력값 : 100
//		A = 65
//		0 = 48
//		a = 97
		
		System.out.println(ch);
		
		ch = System.in.read();
		// 위에 System.im.read() 가 있으므로 두자리까지 입력 가능 합니다.
		ttt += (char) ch;
		
		System.out.println(ch);
		
		ch = System.in.read();
		// 위에 System.im.read() 가 두개 있으므로 세자리까지 입력 가능 합니다.
		ttt += (char) ch;
	
		System.out.println(ch);
	}

}
