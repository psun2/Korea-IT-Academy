package basic;

public class CastingMain_5 {

	public static void main(String[] args) {

		byte bb = 123;
		short sh = bb; // 자동 형변환(casting)
		System.out.println(bb); // 123
		System.out.println(sh); // 123
		short sht = 123;
//		byte bbt = sht; // 상위 자료형을 하위 자료형으로 자동 형변환이 불가능합니다. casting이 불가능 합니다.
//		Type mismatch: cannot convert from short to byte
//		유형 불일치 : short에서 바이트로 변환 할 수 없습니다
//		TODO 상위 자료형에서 하위자료형을 참조하고자 할때, 자동으로 형변환이 일어나는데,
//		이 현상을 casting 현상이라고 합니다.

		sh = 127;
		bb = (byte) sh; // 강제형변환
		System.out.println(sh); // 127
		System.out.println(bb); // -127
		sh = 128;
		bb = (byte) sh; // 강제형변환
		System.out.println(sh); // 128
		System.out.println(bb); // -126
		sh = 254;
		bb = (byte) sh; // 강제형변환
		System.out.println(sh); // 254
		System.out.println(bb); // -2
		sh = 255;
		bb = (byte) sh; // 강제형변환
		System.out.println(sh); // 255
		System.out.println(bb); // -1
		sh = 256;
		bb = (byte) sh; // 강제형변환
		System.out.println(sh); // 256
		System.out.println(bb); // 0
		sh = 257;
		bb = (byte) sh; // 강제형변환
		System.out.println(sh); // 257
		System.out.println(bb); // 1
//		TODO byte 자료형의 범위는 127 ~ -128 입니다.
//		short 자료형을 강제로 byte 로 형변환시 값이 byte 자료형의 범위가 벗어나면 즉
//		128이 담기면 byte 자료형의 최소 값이 -128 이 출력되고, 129가 담기면 -127이 출력됩니다.
//		이러한 현상을 overflow 라고 하며 overflow는 최대 값의 범위를 벗어날시 순환되어
//		최소 값으로 변경되는 현상을 의미합니다.

		sh = 32767;
		int ii = sh;
		System.out.println(sh); // 32767;
		System.out.println(ii); // 32767;

		ii = 32768;
		sh = (short) ii;
		System.out.println(sh); // -32768
		System.out.println(ii); // 32768

		System.out.println("정수 <-> 실수----------------");
		ii = 123;
		double dd = ii;
		System.out.println(ii); // 123
		System.out.println(dd); // 123.0

		dd = 123.456;
		ii = (int) dd;
		System.out.println(ii); // 123
		System.out.println(dd); // 123.456

		System.out.println("숫자 <-> 문자----------------");
		char ch = 'a';
		ii = ch;
		System.out.println(ch); // a
		System.out.println(ii); // 97
		ch = 'A';
		ii = ch;
		System.out.println(ii); // 65
		ch = '0';
		ii = ch;
		System.out.println(ii); // 48

		ii = 97;
		ch = (char) ii;
		System.out.println(ii); // 97
		System.out.println(ch); // a
		ii = 65;
		ch = (char) ii;
		System.out.println(ch); // A
		ii = 48;
		ch = (char) ii;
		System.out.println(ch); // 0
		
		int qq = '2' + 3;
		System.out.println(qq); // 53
		System.out.println(qq - '0'); // 50
	}

}
