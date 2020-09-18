package oops_p;

class M_V{
	
	int d = 1357;
	int e = 5555;
	
	void meth_1(int a) { //매개변수는 지역변수
		//int a = 10; //지역변수와 매개변수는 같은 이름으로 선언 불가
		System.out.println("meth_1() 시작:"+a+","+d); //메소드에서 멤버변수접근 가능
		System.out.println("meth_1() 끝:"+a+","+d);
	}
	
	void meth_2() {
		//System.out.println("meth_2() 시작:"+a);  다른 메소드내의 지역변수 접근불가
		int b = 20000;
		int e = 70000; //지역변수와 멤버변수의 상충
						//우선권이 영역이 더좁은 지역변수가 갖는다
		System.out.println("meth_2() 시작:"+b+","+d+","+e+","+this.e);
						// this  :: 현 인스턴스 객체의 멤버 혹은 인스턴스 객체임을 명시적으로 표현
		d = 2468;	//멤버변수 대입
		System.out.println("meth_2() 끝:"+b+","+d+","+e+","+this.e);
	}
	void meth_3() {
		int b = 2345;	// 다른 메소드와 관계없이 동일한 이름으로 지역변수 선언가능
		System.out.println("meth_3() 시작:"+b+","+this.d+","+e);
		System.out.println("meth_3() 끝:"+b+","+d+","+e);
	}
	
	void init(int d, int e) {
		System.out.println("초기화 할꼬얌");
		this.d = d;
		this.e = e;
	}
	
	void ppp() {
		System.out.println(this.d+","+this.e);
	}
	
	
}

public class MethodVal {

	public static void main(String[] args) {
		
		M_V mv = new M_V();
		
		mv.meth_1(1111);
		
		mv.meth_2();
		
		mv.meth_3();
		
		//System.out.println("main:"+mv.a);//메소드 내 지역변수 접근 불가
		System.out.println("main:"+mv.d+","+mv.e);
		//System.out.println("main:"+mv.this.d); this는 클래스의 정의부에서만 사용
		
		System.out.println("-------------------");
		
		M_V mv1 = new M_V();
		System.out.println("초기화 전:"+mv1.d+","+mv1.e);
		mv1.init(123, 456);
		System.out.println("초기화 후:"+mv1.d+","+mv1.e);
		mv1.ppp();
		mv.ppp();

	}

}

