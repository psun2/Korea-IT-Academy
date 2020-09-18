
public class Main {

	final static double PI = 3.141592; 
//	static 이란 해당 클래스에서만 공유하는 변수 입니다.
//	클래스의 상속을 받던, 인스턴스를 생성을 하던, 다른 클래스에선 사용이 불가능 합니다.
	
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "나동빈";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		int r = 30;
		System.out.println(r * r * PI); // 2827.4328
		
		int max = INT_MAX;
		int min = INT_MAX + 1;
		System.out.println(max); // int 형이 가지는 최대의 값 2147483647
		System.out.println(min); // int 형이 가지는 최소의 값 -2147483648
		// overflow란 
		// 과다, 하천의 범람
		// 가장 큰 값에서 가장 작은 값으로 돌아가는 현상을 의미합니다.
		
		int a = 1;
		int b = 2 ;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		// (/)나누기 같은 경우 몫만을 표현 합니다.
		System.out.println("a % b = " + (a % b));
		
//		int c = 0.5;
//		정수형type 의 변수에 실수를 넣으면 에러가 납니다.
		int c = (int) 0.5;
		System.out.println(c); // 0
		double d = 0.5;
		int e = (int) (d  +  0.5);
		System.out.println("정수형 변환과 함께 반올림 " + e); // 1
		double f = 0.4;
		double g = 0.6;
		int h = (int) (f + 0.5); 
		int i = (int) (g + 0.5);
		System.out.println("정수형 변환과 함께 반올림 " + h ); // 0
		System.out.println("정수형 변환과 함께 반올림 " + i); // 1
		
		

	}

}
