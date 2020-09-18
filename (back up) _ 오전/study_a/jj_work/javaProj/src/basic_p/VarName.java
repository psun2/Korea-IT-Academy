package basic_p;

public class VarName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		System.out.println(a);
		
		//int a = 30;   선언된 변수 이름을 중복으로 선언 불가
		
		a = 30;
		
		System.out.println(a);
		
		//int 8 = 9;
		//int + = 9;
		//int int = 8;
		//int x y = 9;
		int qw3 = 9;
		//int 3qw = 9;
		
/*

bit										byte
						BCD		ASCII	EBCDIC
1	2	3	4		5	6		7		8

2	4	8	16		32	64		128		256
-----------------------------------------------------
0	00	000	0~9 10		0~9 10	+특수기호	+부호
1	01	001				a~z 26
	10	010				A~Z	26
	11	011					62
		100
		101
		110
		111


 */	
		
		int 국어 = 88;
		int 영어 = 78;
		
		int 합계 =  국어 + 영어;
		
		System.out.println(국어);
		System.out.println(영어);
		System.out.println(합계);
		
		String pname = "정우성";
		
		System.out.println(pname);

	}

}
