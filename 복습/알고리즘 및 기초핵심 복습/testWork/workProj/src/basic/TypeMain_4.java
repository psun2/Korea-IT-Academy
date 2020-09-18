package basic;

public class TypeMain_4 {

	public static void main(String[] args) {

		System.out.println("1. 정수 >>>>>>>>>>");

		byte bb = 10;
		System.out.println(bb); // 10
		bb = 127;
		System.out.println(bb); // 127
//		bb = 128; // byte를 초과하는 값을 담을 수 없습니다.
//		Type mismatch: cannot convert from int to byte
//		유형 불일치 : int에서 byte로 변환 할 수 없습니다.
//		bb = 12.345;
//		bb = true;
		bb = 'a';
		System.out.println("문자\'a\' = " + bb + "을 의미합니다."); // 문자'a' = 97을 의미합니다.
		bb = 'A';
		System.out.println("문자\'A\' = " + bb + "을 의미합니다."); // 문자'a' = 65를 의미합니다.		
		bb = '0';
		System.out.println("문자\'0\' = " + bb + "을 의미합니다."); // 문자'0' = 48을 의미합니다.
//		TODO 문자 'a' 와 문자 '0' 은 자동으로 형변환 되어, 변환된 숫자로 나타납니다.
//		여기서의 형변환은 강제가 아닌 스스로 바꿔줌으로써 
//		강제적으로 형변환을하는 (int)등과는 달리 casting 한다고 합니다.
//		이때 참조하는 것이 유니코드 입니다.

		short sh = 128; // short는 byte 를 초과하는 값을 담을 수 있습니다.
		System.out.println(sh); // 128
		sh = 32767;
//		sh = 32768; // short 를 초과하는 값을 담을 수 없습니다.
		sh = -32768;
//		sh = -32769; // short 를 초과하는 값을 담을 수 없습니다.
		System.out.println(sh); // -32768

		int ii = -32769; // int는 short를 초과하는 값을 담을 수 있습니다.
		ii = 32768;
		ii = 2147483647;
//		ii = 2147483648; // int 를 초과하는 값을 담을 수 없습니다.
		ii = -2147483648;
//		ii = -2147483649; // int 를 초과하는 값을 담을 수 없습니다.
		System.out.println(ii); // -2147483648

		long lo = 2147483647;
//		lo = 2147483648; 
//		The literal 2147483648 of type int is out of 
//		int 유형의 리터럴 2147483648이
//		TODO int 유형의 자료형을 long의 영역까지 표현하기 위해서는 숫자뒤에 L 또는 l 을 표기해주어,
//		long 의 영역으로 확장시켜줍니다.
		lo = 2147483648L;
		lo = 2147483648l;
		lo = -2147483649L;
		lo = -2147483649l;
		System.out.println(lo); // -2147483649

		System.out.println("-----------------");

		System.out.println("2. 실수 >>>>>>>>>>");

//		TODO double 유형의 자료형을 float의 영역까지 표현하기 위해서는 숫자뒤에 F 또는 f 을 표기해주어,
//		float 의 영역으로 확장시켜줍니다.
		float ff = 123.4545454554656F;
		ff = 123.4545454554656f;
		System.out.println(ff); // 123.454544

		double dd = 123.4545454554656;
		dd = 123;
		System.out.println(dd); // 123.0

		System.out.println("-----------------");

		System.out.println("3. 문자 >>>>>>>>>>");

		char ch = 'a';
		ch = '가';
//		ch = ''; // char 은 공백을 가질 수 없습니다.
//		ch = 'korea' // char 은 문자열 표련이 불가능합니다.
//		ch = "a"; // char 은 "(따옴표)로 표현이 불가능 합니다.
		ch = 97; 
		System.out.println(ch); // a
		ch = 65; 
		System.out.println(ch); // A
		ch = 48; 
		System.out.println(ch); // 0		
//		TODO 문자 'a' 와 문자 '0' 은 자동으로 형변환 되어, 변환된 숫자로 나타납니다.
//		여기서의 형변환은 강제가 아닌 스스로 바꿔줌으로써 
//		강제적으로 형변환을하는 (int)등과는 달리 casting 한다고 합니다.
//		이때 참조하는 것이 유니코드 입니다.

		System.out.println("-----------------");

		System.out.println("4. boolean >>>>>>>>>>");

		boolean bo = true;
		bo = false;
//		bo = TRUE; // boolean은 "대문자"로 표현 할 수 없습니다.
//		bo = True; // 자바에서의 boolean은 "python 의 표기방법"으로 표기할 수 없습니다.
//		bo = -1; // boolean은 "실수"로 표현 할 수 없습니다.
//		bo = 0; // boolean은 "정수"로 표현 할 수 없습니다.
//		bo = "true"; // boolean은 "문자열"로 표현 할 수 없습니다.
//		bo = 't'; // boolean은 '문자'로 표현 할 수 없습니다.
//		boolean은 true 혹은 false만 표현이 가능합니다.
		System.out.println(bo); // false
		
		System.out.println("-----------------");


	}

}
