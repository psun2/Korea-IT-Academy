package control_p;

public class SwitchMain {

	public static void main(String[] args) {

//		switch(10) {
//		switch(true) {		// error
//		switch(123.456) {	// error
//		switch("아기상어") {
		switch (100) {

		case 5:
			System.out.println("5 입니다.");
			break;
		case 20:
			System.out.println("20 입니다.");
			break;
		case 7:
			System.out.println("7 입니다.");
			break; // 제어문 탈출 예약어 - if 문 제외
		case 12:
			System.out.println("12 입니다.");
			break;
		case 8:
			System.out.println("8 입니다.");
			break;
		default:
			System.out.println("존재하지 않습니다.");

		}

		System.out.println("-----------------------");

		String department = "인사부";
		String mt;

		switch (department) {

		case "인사부":
			mt = "mt 장소는 바다 입니다.";
			break;
		case "영업부":
			mt = "mt 장소는 산 입니다.";
			break;
		case "부부":
			mt = "mt 장소는 안방 입니다.";
			break;
		case "두부":
			mt = "mt 장소는 콩밭 입니다.";
			break;
		default:
			mt = "야근 입니다.";

		}

		System.out.println(mt);

		System.out.println("-----------------------");

//	       평점만점 : 4.5 로 환산 하여 등급을 구하시오
		double rr = 3.74;
		String res;

		System.out.println((int) (rr * 10) / 5);
		System.out.println((int) (rr * 2));
		switch ((int) (rr * 2)) {
//		switch 의 조건식에도 밑에 case 에 적용된 식을 적용하여,
//		값이 제대로 나올 수 있게 합니다.

//		1)
//		case 4.5:
//			res = "A+";
//			break;
//		switch case 문은 실수 사용이 안됩니다.
//		정수형태로 바꾸어 사용 합니다.
//		정수혈태로 바꾸기 위해 case 에 10을 곱해 소수점을 없앱니다.

//		2)
//		case 45:
//			res = "A+";
//			break;
//		case 를 보니 정확히 5 씩 늘어납니다.
//		공통된 약수 공약수(5) 가 존재하므로 5로 나누어 줄 수 있도록 합니다.
//		5는 10의 약수도 될수 있으므로,
//		4.5 * 10 / 5 가 아닌
//		4.5 * 2 로 같은 값이 나오는 표현을 할 수 있습니다.

//		3)

		case 9:
			res = "A+";
			break;
//		모든 case 에 위 식을 적용합니다.

		case 8:
			res = "A";
			break;
		case 7:
			res = "B+";
			break;
		case 6:
			res = "B";
			break;
		case 5:
			res = "C+";
			break;
		case 4:
			res = "C";
			break;
		case 3:
			res = "D+";
			break;
		case 2:
			res = "D";
			break;
		default:
			res = "F";
			break;
		}

		System.out.println(rr + " : " + res);

		System.out.println("-----------------------");

		System.out.println("<<다른 방법>>");

		System.out.println((int) rr);
		String res2 = "F";
		switch ((int) rr) {

		case 4:
			res2 = "A";
			break;
		case 3:
			res2 = "B";
			break;
		case 2:
			res2 = "C";
			break;
		case 1:
			res2 = "D";
			break;
		}

//		System.out.println(rr - (int) rr + 0.5);
//		System.out.println(rr - (int) (rr + 0.5));
		System.out.println((int) (rr - (int) rr + 0.5));
		if ((int) (rr - (int) rr + 0.5) == 1 && rr > 1)
			res2 += "+";

		System.out.println(rr + " : " + res2);

		System.out.println("-----------------------");

		System.out.println("<<다른 방법2>>");

		System.out.println((char) 69);
		System.out.println((char) 'E');

		String res3 = "";

		if ((int) rr < 1)
			res3 = "F";
		else {
			res3 += (char) ('E' - (int) rr);
//			res3 += (char) (69 - (int) rr);
			if ((int) (rr - (int) rr + 0.5) == 1 && rr > 1)
				res3 += "+";
		}

		System.out.println(rr + " : " + res3);

		System.out.println("-----------------------");

		System.out.println("--------<<과 제>>--------");

		System.out.println("<<방법 1>>");

//		과목 : 국어 40%, 영어 20% , 수학 10% , 국사 30%,   가산점 :  코딩 + 0.2
//			   87       62        77        86                     0.1
// ex)    87 * 40% + 62*20% + 77 * 10% + 86 * 30%  = 87.9  ->3.9555 +0.1 =   >  4.0555
// 		평점만점 : 4.5 로 환산 하여 등급을 구하시오
// 		4.5    A+
// 		4.0    A
// 		3.5    B+
// 		3.0    B
// 		2.5    C+
// 		2.0    C
// 		1.5    D+
// 		1.0    D
// 			   F
		double kor, eng, math, his, total, result, onChange;
		kor = 87 * 0.4;
		eng = 62 * 0.2;
		math = 77 * 0.1;
		his = 86 * 0.3;
		total = kor + eng + math + his;
		onChange = 0.045;
		result = total * onChange;
		System.out.println("result : " + result);

		String res4 = "";
		if ((int) result < 1)
			res4 = "F";
		else {
			res4 += (char) (69 - (int) result);
			if (result - (int) result >= 0.5 && result >= 1)
				res4 += "+";
		}

		System.out.println(result + " : " + res4);

		System.out.println("-----------------------");

		System.out.println("<<방법 2>>");

		String res5;
		switch ((int) result) {

		case 4:
			res5 = "A";
			break;
		case 3:
			res5 = "B";
			break;
		case 2:
			res5 = "C";
			break;
		case 1:
			res5 = "D";
			break;
		default:
			res5 = "F";
			break;
		}

		System.out.println((int) (result - (int) result + 0.5));
		System.out.println(result - (int) result >= 0.5);

//		if((int)(result - (int)result + 0.5) == 1 && result >= 1)
		if (result - (int) result >= 0.5 && result >= 1)
			res5 += "+";

		System.out.println(result + " : " + res5);

		System.out.println("-----------------------");

		System.out.println("<<방법 3>>");

		String res6;

		switch ((int) (result * 2)) {

		case 9:
			res6 = "A+";
			break;
		case 8:
			res6 = "A";
			break;
		case 7:
			res6 = "B+";
			break;
		case 6:
			res6 = "B";
			break;
		case 5:
			res6 = "C+";
			break;
		case 4:
			res6 = "C";
			break;
		case 3:
			res6 = "D+";
			break;
		case 2:
			res6 = "D";
			break;
		default:
			res6 = "F";
			break;
		}

		System.out.println(result + " : " + res6);

	}

}
