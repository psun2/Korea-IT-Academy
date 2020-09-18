package basic;

public class VarMain_2 {

	public static void main(String[] args) {

//		5 + 3 = 8;
		int x; // 변수 선언 : 자료형 변수명;
//		정수 x;

//		5 + 3 = x;
		x = 5 + 3;
//		변수 = 값;

		System.out.println(x); // 8

//		int x; // 동일한 이름의 변수 선언은 1회만 가능
//		Duplicate local variable x
//		지역 변수 x 중복

		x = 20; // 변수 값 대입
		System.out.println(x); // 변수 값 호출 20

//		y = 30; // 선언되지 않은 변수 사용 불가
//		y cannot be resolved to a variable
//		y는 변수로 해석 될 수 없습니다
//		System.out.println(y); // 선언되지 않은 변수 호출 불가

		int z;
//		System.out.println(z); // 값이 대입되지 않은 변수 호출 불가

		int k = 345; // 선언 및 초기화(대입) : 선언과 같이 값 대입
		System.out.println(k); // 345

		int j = k; // 각종 수식에서 변수 값 호출 가능
		System.out.println(j); // 345

		int aa, bb, cc; // 변수 동시 선언 가능

//		int qq = ww = 5 // error
//		int qq = ww, ww = 5 // 변수 선언 순서는 왼쪽부터
		int ww = 5, qq = ww;
		System.out.println(ww); // 5
		System.out.println(qq); // 5

//		변수명 (camel, snake)
//		int 91 = 81; // 숫자를 변수명으로 사용 불가능 합니다.
//		int + = 45; // 연산자를 변수명으로 사용 불가능 합니다.
//		int ss dd = 78; // 변수명에 공간이 있으면 사용 불가능 합니다.
//		int int = 88; // 예약어를 변수묭으로 사용 불가능 합니다.

		int adae = 90;
		int _$_a_2323_sdasd_ = 95;
		int _$_a_int_sdasd_int = 78;
		System.out.println(adae); // 90
		System.out.println(_$_a_2323_sdasd_); // 95
		System.out.println(_$_a_int_sdasd_int); // 78
		/*
		 * 변수명의 맨 앞에 _(언더바)를 사용 할 수 있습니다. 
		 * 변수명의 중간이나 맨끝에 _(언더바)를 사용 할 수 있습니다. 
		 * 변수명에 특수기호 $만 사용 가능 합니다. 
		 * 변수명의 중간에 혹은 맨 끝에 예약어, 숫자 등을 사용 가능 합니다.
		 */
		
		int 국어 = 88; // 변수명으로 한글이 사용 가능 합니다만 사용을 지양합니다.
		System.out.println(국어); // 문제없이 출력되나 사용을 지양합니다.
		
		String studentName = "정우성";
		String student_name = "정우성";
		System.out.println(studentName);
		System.out.println(student_name);
		
		int kor;
		int average;
		int avg;
		
		String studname = "정우성";
		String studName = "정우성"; // camel 표기법 사용시
		String stud_name = "정우성"; // snake 표기법 사용시

//		변수명을 알아보기 쉽고, 간결하게 정합니다.
		
	}

}
