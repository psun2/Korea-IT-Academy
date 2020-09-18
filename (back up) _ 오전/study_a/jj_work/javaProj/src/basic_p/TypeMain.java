package basic_p;

public class TypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. 정수 >>>>>>>>>>");
		byte bb = 123;
		
		System.out.println(bb);
		
		bb = -127;
		//bb = 128;
		//bb = -129;
		//bb = 123.456;
		System.out.println(bb);
		
		short sh = 32767;
		sh = -32768;
		//sh = 32768;
		System.out.println(sh);
		
		int ii = 2147483647;
		//ii = 2147483648L;
		System.out.println(ii);
		
		long lo = 2147483647;
		lo = 2147483648L;
		lo = 9223372036854775807l;
		//lo = 9223372036854775808l;
		System.out.println(lo);
		
		System.out.println("2. 실수 >>>>>>>>>>");
		
		float ff = 123.456f;
		System.out.println(ff);
		
		double dd = 123.456;
		System.out.println(dd);
		
		System.out.println("3. 논리 >>>>>>>>>>");
		
		boolean bo = true;
		bo = false;
		//bo = 1;
		//bo = True;
		//bo = TRUE;
		//bo = "true";
		System.out.println(bo);
		
		System.out.println("4. 글자 >>>>>>>>>>");
		char ch = 'a';
		System.out.println(ch);
		ch = '가';
		//ch = 'ab';  한글자만 가능
		ch = '1';
		//ch = "아";  '' 작은 따옴표만 가능
		System.out.println(ch);
		
		String str = "가";	// 문자열 클래스
		//str = '나';
		str = "아기 상어";
		System.out.println(str);
	}

}

