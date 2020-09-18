
import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) {

		int a =1;
		int b = 2;

		while(b == 2) {
			System.out.println("밖 while");
			while(true) {
				System.out.println("안 while");
				if (a == 1) {
			
					System.out.println("1");
					break;}
					else if(a == 2) {
					System.out.println("2");
					continue;}
					else if (a == 3) {
					System.out.println("3");}
					else {
					System.out.println("default");
				}
				}
			}
			System.out.println("밖 while 후문");
		}	
		
//		while(b == 2) {
//			System.out.println("밖 while");
//			while(true) {
//				System.out.println("안 while");
//				switch (a) {
//				case 1:
//					System.out.println("1");
//					break;
//				case 2:
//					System.out.println("2");
//					continue;
//				case 3:
//					System.out.println("3");
//				default:
//					System.out.println("default");
//				}
//				}
//			}
//			System.out.println("밖 while 후문");
//		}
		
//		break = 반복문을 완전 정지시킨다.
//		continue = 반복문의 처음으로 돌아가 다시 한다.
		
//		for(int i =0; i <4; i++) {
//			System.out.println("1");
//			System.out.println("2");
//			break;
//			continue;
//			System.out.println("3");
//			System.out.println("4");
		}


