package control_p;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자:");
		int no = sc.nextInt();
		
		System.out.println("결과:"+no*100);
		
		System.out.print("문자열1:");
		String str1 = sc.next();  //엔터와 띄어쓰기로 리턴
								  //문자열에 엔터와 띄어쓰기를 포함 안함
		
		System.out.println("str1:"+str1);
		
		sc.nextLine(); // 엔터가 살아있어 다음 nextLine();에 영향을 미침
						// 엔터값 상쇄
		
		System.out.print("문자열2:");
		String str2 = sc.nextLine();//띄어 쓰기 까지 문자열로 인지하여 받음
		
		System.out.println("str2:"+str2);
		
		System.out.print("참거짓:");
		boolean bo = sc.nextBoolean();
		
		System.out.println("bo:"+bo);
		
		System.out.print("실수:");
		double dd = sc.nextDouble();
		
		System.out.println("dd:"+dd);
		
		
		

	}

}
