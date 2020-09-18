package control_p;

public class If_else_Main {

	public static void main(String[] args) {

//	else { // else 단독사용 불가
//		
//	}

		if (true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println("시스템 종료");

		int a = 78;
		String res;

		if (a >= 80) {
			res = "합격";
		} else {
			res = "불합격";
		}

		System.out.println("시스템 종료 " + res);

		String res2;
		//////////////////////////////////////

		if (a >= 80) {
			res2 = "우수";
		}

		//////////////////////////////////////
		// if 는 머리 부분이 되므로 위의 if만 다른 구분으로 해석되어 사용됩니다.

		if (a >= 60) {
			res2 = "정상";
		} else {
			res2 = "미달";
		}

		System.out.println("시스템 종료 " + res2);

		String res3;
		if (a >= 80) {
			res3 = "우수2";
		} else if (a >= 60) {
			res3 = "양호2";
			if (a % 2 == 0) {
				res3 += "짝수";
			} else {
				res3 += "홀수";
			}
		} else if (a >= 40) {
			res3 = "미달2";
		} else {
			res3 = "불량2";
		}

		System.out.println("시스템 종료 " + res3);

		int c = 100; // 외부변수
		if (true) {
			c = 100;
			int d = 400; // if 영역 내부변수 -- if문 종결시 변수 소멸
			System.out.println("if 영역 :" + c + ", " + d);
		}

//		System.out.println("if 영역 :" + c + ", " + d); // 외부에서 d 접근 불가
		System.out.println("System.out.println(\"if 영역 :\" + c + \", \" + d); // 외부에서 d 접근 불가");
		System.out.println("시스템 종료 : " + c);

	}

}
