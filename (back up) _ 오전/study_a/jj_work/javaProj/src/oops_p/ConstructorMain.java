package oops_p;

class Const{
	
	static int c = 159;
	
	Const(int a, int b){
		//static int d = 159;
		c = 9753;
		System.out.println("사용자 정의 생성자다 1:"+this.a);
		//a = 1000;	
		this.a = a;
		this.b = b;
	}
	
	Const(int a){
		//Const();
		//c = 9753;
		this(a, 9876);  //생성자가 생성자 호출 가능 
						//생성자 호출시  this() 사용
		System.out.println("사용자 정의 생성자다 2:"+this.a);
		//a = 1000;	
		//this.a = a;
		//this.b = 1234;
	}
	
	Const(){
		//this(1212,3434);
		System.out.println("기본 생성자다!!!"+this.a);
		//this(1212,3434);  생성자 호출시 이전에 어떤 작업도 우선시 될수 없다.
	}
	
	int a = goA();
	int b = 20;
	
	int goA() {
		//static int ert = 159;
		System.out.println("goA()");
		return  10;
	}
	static void goB() {
		//static int tyt = 159;
	}
	
//	void Const(){
//		System.out.println("나는 메소드여");
//	}
//	
	void ppp() {
		//Const();
		//new Const();
		System.out.println(a+","+b);
	}
}
public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("-------------------");
		Const c1 = new Const(13,57);
		System.out.println("-------------------");
		Const c2 = new Const(24);
		System.out.println("-------------------");
		Const c3 = new Const();
		System.out.println("-------------------");
//		c1.Const();
//		c1.Const();
//		c1.Const();
		System.out.println("-------------------");
		c1.ppp();
		c2.ppp();
		c3.ppp();
	}

}

