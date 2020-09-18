package oops_p;

class AAA{  //클래스의 정의
	
	int a = 10;  //멤버변수
	String b = "아기상어";
	
	void meth_1() {	//메소드
		
		System.out.println("AAA의 meth_1() 실행");
	}
	
	
	//System.out.println("엄마상어"); 실행구문을 클래스 정의에 직접 넣을수 없다.
}


public class ClassMain {

	public static void main(String[] args) {
		AAA c1;		//선언
		
		c1 = new AAA();	//생성
		AAA c2 = new AAA();	//생성
		
		
		c2.a = 1234;
		c1.b = "아빠상어";
		
		System.out.println(c1.a);  //호출
		System.out.println(c2.a);  //호출
		
		System.out.println(c1.b);  
		System.out.println(c2.b); 
		
		c1.meth_1();
		c2.meth_1();

	}

}

