package basic;

public class VarMain {

	public static void main(String[] args) {

		//5 + 3 = 8
		int x; //변수선언 :  자료형 변수명;
		//정수 x;
		//5 + 3 = x;
		
		x = 5 + 3;
		
		//변수 = 값;
		
		System.out.println(x);
		
		//int x;  동일한 이름의 변수 선언은 1회만 가능
		
		x = 20;	//변수 값 대입
		
		System.out.println(x);  //변수 값 호출
		
		//y = 30;  선언되지 않은 변수 사용 불가
		
		//System.out.println(y);  //변수 값 호출
		
		int z;
		
		//System.out.println(z);  //값이 대입되지 않은 변수 호출 불가
		
		int k = 345;  //선언 및 초기화 (대입) : 선언 과 같이 값 대입
		
		System.out.println(k);
		
		int j = k;  //각종 수식에서 변수 값 호출 가능
		System.out.println(j);
		
		int aa, bb, cc;	//변수 동시 선언 가능
		
		//int qq = ww = 5;
		
		//int qq = ww, ww = 5;  변수의 선언 순서는 왼쪽부터
		
		int ww = 5, qq = ww;

		System.out.println(ww);
		System.out.println(qq);
		
		
		/////변수명
		
		//int 91 = 81;
		//int + = 45;
		//int ss dd = 78;
		//int int = 88;
		
		int $_as1d_f = 90;
		
		int 국어 = 89;
		
		System.out.println(국어);
		
/*
 
bit 									byte

					BCD		ASCII		EBCDIC
1	2	3	4	5	6		7			8
2	4	8	16	32	64		128			256
---------------------------------------------
0	00	000	0~9 	0~9	10	+특수기호		+부호
1 	01	001			A~Z	26
	10	010			a~z	26
	11	011				62
 		100
 		101
 		110
 		111
 * */		
	
		
		String studentname = "정우성";
		
		System.out.println(studentname);
		
		int kor;
		int average;
		int avg;
		
		String studname = "정우성";
		
		String studName = "정우성";
		
		String stud_name = "정우성";
		
		
	}

}
