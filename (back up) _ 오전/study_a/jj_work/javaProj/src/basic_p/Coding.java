package basic_p;

public class Coding {

	public static void main(String[] args) {
		
		//5 + 3 = 8
		
		int x;  //변수
		//5 + 3 = x;

		//변수 = 값;
		x = 5 + 3;
		
		System.out.println(x);
		
		//y = 8;  선언하지 않은 변수는 사용 불가
		int y ; 	//변수의 선언  -- y 라는 이름의 메모리 공간 있어요
		//변수 = 값
		y = 7;		//변수의 값 대입 - y 공간에 7을 넣어요
		
		System.out.println(y);	//변수 호출 : 변수 y 공간 안에 있는 값을 가져와요
		
		int z = 10;  //변수의 선언 및 초기화(대입)

		System.out.println(z);
		
		int a;
		
		//System.out.println(a);  값이 없는 변수는 사용 불가
		 z = 20;
		 System.out.println(z);  //변수 호출시 값은 호출 직전의 변수 대입 값을 가져옴
		 
		 int qq = 6, ww = 5, ee = qq; //동시 선언이 가능함
		 /*
		   1.int qq = 6;
		   2.int ww = 5;
		   3.int ee = qq(6);
		  
		  * */
		 
		 
		 //int rr = tt, tt = 7;  변수의 값을 가져올 경우 선언의 순서가 중요함
		 /*
		  1. int rr = tt ?  에러 : tt의 존재자체를 모름
		  2. int tt = 7;
		  * */
		 
		 
		 
		 System.out.println(qq);
		 System.out.println(ww);
		 System.out.println(ee);
		
	}

}
