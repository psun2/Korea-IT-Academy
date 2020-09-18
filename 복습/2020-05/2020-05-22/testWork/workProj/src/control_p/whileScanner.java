package control_p;

import java.util.Scanner;

public class whileScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 최대값, 최소값, 평균, 합계

		int max = 0, min = 0, total = 0, count = 0;

		while (true) {
			System.out.println("0보다 작거나 같은 수를 입력시 프로그램이 종료됩니다.");
			System.out.print("입력 : ");
			int num = sc.nextInt();
			if (num <= 0)
				break;

			if (max == 0 && min == 0) {
				max = num;
				min = num;
			} else if (num > max)
				max = num;
			else if (min > num)
				min = num;

			total += num;
			count += 1;

		}

		double avg = (double) total / count;

		sc.close();
		System.out.println("종료");
		System.out.println("최대값 : " + max + " 입니다.");
		System.out.println("최소값 : " + min + " 입니다.");
		System.out.println("총 합 : " + total + " 입니다.");
		System.out.println("평균 : " + avg + " 입니다.");

	}

}
