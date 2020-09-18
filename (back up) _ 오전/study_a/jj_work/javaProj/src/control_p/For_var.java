package control_p;

public class For_var {

	public static void main(String[] args) {
		
		//int i=0;
		
		int b = 0;
		for (int i = 0; i <5; i++) {
			int a = 1;		//반복 될때 마다 새로 선언
			a++;
			
			//int b = 10; 외부변수와 중복되어 변수 선언 불가
			b++;
			System.out.println(i+","+a+","+b);
			
			//for문 반복 될때 마다  a 소멸
		}
		System.out.println("for문 종료 1:"+b);
		//System.out.println("for문 종료:"+a);
		//System.out.println("for문 종료:"+i);
		
		int i =0;
		
		for (; i <5; i++) { //외부변수 i를  반복변수로 사용 
			
			System.out.println(i);
			

		}
		System.out.println("for문 종료 2:"+i);  //for문 종료 후에도 접근 가능
		
		
		
		i =0;
		
		//for (i; i <5; i++) {  //반복 변수 지정만 할 경우 에러
		for (i=3; i <5; i++) { //외부변수를 사용시 값을 새로 대입하여 사용가능
			
			System.out.println(i);
			
		}
		System.out.println("for문 종료 3:"+i);  //for문 종료 후에도 접근 가능
	}
}
