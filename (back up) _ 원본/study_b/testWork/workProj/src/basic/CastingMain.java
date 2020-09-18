package basic;

public class CastingMain {

	public static void main(String[] args) {

		System.out.println("byte <-> short-------------------");
		byte bb = 123; // 0,1,2 ...126,127, -128,-127,-126... -3,-2,-1,0
		short sh = bb;  //자동 형변환(casting)
		/*
		 * 			BYTE	SHORT
		 0000 0000 	0		0
		 0000 0001 	1		1
		 0000 0010 	2		2
		 0000 0011 	3		3
		 ... 
		 0111 1111 	127		127
		 1000 0000	-128	128
		 1000 0001	-127	129
		 1000 0010	-126	130
		 ...
		 1111 1101 	-3		253
		 1111 1110 	-2		254
		 1111 1111 	-1		255
	   1 0000 0000  0		256
	   1 0000 0001  1		257  
		 
		 */
		
		System.out.println(bb);
		System.out.println(sh);
		sh = 129;
		sh = 130;
		sh = 254;
		sh = 255;
		sh = 256;
		sh = 257;
		bb = (byte)sh; //강제 형변환
		System.out.println(bb);
		System.out.println(sh);
		System.out.println("short <-> int-------------------");
		
		sh = 32767;
		int ii = sh;
		
		System.out.println(sh);
		System.out.println(ii);
		ii= 32770;
		sh = (short)ii;
		System.out.println(sh);
		System.out.println(ii);
		
		System.out.println("정수 <-> 실수-------------------");
		ii = 123;
		double dd = ii;
		System.out.println(ii);
		System.out.println(dd);
		dd = 123.456;
		ii = (int)dd;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println("숫자 <-> 문자-------------------");
		char ch = 'a';
		ii = ch;
		System.out.println(ch);
		System.out.println(ii);
		
		ii = 100;
		ch = (char)ii;
		System.out.println(ch);
		System.out.println(ii);
		System.out.println('a'+100);
		System.out.println('1'+1);
		int qq = '2'+3;
		System.out.println(qq-'0');
	}

}

