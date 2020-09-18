package control_p;

import java.io.IOException;

public class InputMath {

	public static void main(String[] args) throws IOException {
		///1. System.in.read 를 이용하여 숫자를 입력받아 + 100 하여 출력하세요
		///2. System.in.read 를 이용하여 숫자 두개를 입력받아 두수 사이의 솟수 갯수를 출력하세요
		///3. 글자를 입력받아 출력하세요 단. 대문자<->소문자 바꿔서 출력하세요
		int su1 = 0;
		
		System.out.print("수1:");
		
		while(true) {
			int ii = System.in.read();
			
			if(ii == 13)
				break;
			
			su1 *= 10;
			System.out.println((char)ii+":"+su1);
			su1 += ii-'0';
			
		}
		
		System.out.println(su1+100);

	}

}
