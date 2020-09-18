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
		int total = kor + eng + math;
		int average = total / 3;
		System.out.println("학생의 평균점수 : " + average);


	}

}
