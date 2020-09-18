package excep_p;

import java.io.FileInputStream;

public class ExcepMain {

	public static void main(String[] args) {
		
		try {
			int [] arr = {10,20,30};
			
			System.out.println("try 1");
			
			int a = 10/1; //에러가 발생된 시점에서 catch로 진행
			
			System.out.println("try 2");
			
			System.out.println(a);
			System.out.println(arr[1]);
			
			System.out.println("try 3");
			
			FileInputStream fis = new FileInputStream("fff/bbb.txt");
			
		
			
		}catch (ArithmeticException e) {
			System.out.println("수학적 에러발생");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 에러발생");
			
		}catch (Exception e) {	
			
			try {
				System.out.println("일반적 에러발생");
				int b = 10/0;
			} catch (Exception e2) {
				System.out.println("또또 에러발생");
			}
			
		}
		
		System.out.println("시스템 종료");
	}

}
