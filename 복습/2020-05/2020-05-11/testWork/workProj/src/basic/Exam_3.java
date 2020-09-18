package basic;

import java.util.Scanner;

public class Exam_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("학생 번호를 입력해 주세요 : ");
		int unmber = scanner.nextInt();
		System.out.print("학생 이름을 입력해주세요 : ");
		String name = scanner.next();
		System.out.print("국어 점수를 입력해 주세요 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 점수를 입력해 주세요 : ");
		int math = scanner.nextInt();
		scanner.close();

//		int kor = 87;
//		int eng = 89;
//		int math = 81;

		int total = kor + eng + math;
		double average = total / 3;
		System.out.println("학생의 평균점수 : " + average);

		int pos = 100;
		double ceil = 0.5;

		average = (double) total / 3;
		System.out.println("학생의 평균점수 : " + average);

		double average2 = (double) total / 3 * 100;
		System.out.println("학생의 평균점수 : " + average2);

		average = (double) (int) (average2) / 100;
		System.out.println("학생의 평균점수 : " + average);

		average2 = average2 + 0.5;
		System.out.println("학생의 평균점수 : " + average2);

		average2 = (double) (int) (average2 + 0.5) / 100;
		System.out.println("학생의 평균점수 : " + average2);

		double avg = (double) (int) ((double) total / 3 * pos) / pos;
		System.out.println(avg);

		double avg2 = (double) (int) ((double) total / 3 * pos + ceil) / pos;
		System.out.println(avg2);

		System.out.println(ceil);
		System.out.println("------------------------------------");

		System.out.println("<<삼항 연산자>>");

		String grade = avg2 >= 90 ? "수" : avg2 >= 80 ? "우" : avg2 >= 70 ? "미" : avg2 >= 60 ? "양" : "가";
		System.out.println("학생의 등급 : " + grade);

		System.out.println("------------------------------------");

		System.out.println("<<if>>");

		String res;
		if (avg2 >= 90) {
			res = "수";
			if (kor >= 90 && eng >= 90 && math >= 90)
				res += "(우등생)";
		} else if (avg2 >= 80) {
			res = "우";
		} else if (avg2 >= 80) {
			res = "미";
		} else if (avg2 >= 80) {
			res = "양";
		} else {
			res = "가";
		}

		System.out.println(avg2 + " : " + res);

		System.out.println("------------------------------------");

		System.out.println("<<switch case>>");

		String res2;
		switch ((int) avg / 10) {

		case 10:
		case 9:
			res2 = "수";
			break;
		case 8:
			res2 = "수";
			break;
		case 7:
			res2 = "수";
			break;
		case 6:
			res2 = "수";
			break;
		default:
			res2 = "가";

		}
		
		if (kor >= 90 && eng >= 90 && math >= 90)
			res2 += "(우등생)";

		System.out.println(avg2 + " : " + res2);

	}

}
