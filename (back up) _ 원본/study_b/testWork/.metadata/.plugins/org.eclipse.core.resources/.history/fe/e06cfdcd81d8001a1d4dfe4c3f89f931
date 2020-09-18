package oops;

class MeAAA{
	
	int a = 10;		//멤버변수
	int b = 20;
	
	//param O, ret o
	int meth(int i, String str) {  //메소드의 정의
//메소드이름 : meth
//매개변수 : int i, String str
//리턴형 :int  	
		System.out.println("메소드 실행:"+i+","+str);
		
		return 1234;  //리턴
	}
	
	
	//param X, ret X
	void meth_1() {
		
		System.out.println("meth_1() 실행 : param X, ret X");
	}

	//param O, ret X
	void meth_2(int i, int j) {
		
		System.out.println("meth_1() 실행 : param ("+i+","+j+"), ret X");
		//return 345;
		return;		//생략가능
	}
	
	//param X, ret o
	int meth_3() {
		
		System.out.println("meth_3() 실행 : param X, ret O");
		
		return 9876; //리턴형이 있으면 리턴이 반드시 필요함
	}
	
	
	void val_1() {
		//System.out.println("val_1 실행 :"+a+","+b+","+s); 
		//다른 메소드 지역변수(매개변수 포함)접근 불가
		
		System.out.println("val_1 실행 :"+a+","+b); //멤버변수 호출 가능
	}
	
	void val_2(int z) {
		a = z;//멤버변수 대입
		//int z; 지역변수와 매개변수 이름 충돌
		int s = 2468;	//지역변수
		System.out.println("val_2 실행 :"+a+","+b+","+z+","+s); 
	}
	
	void val_3(int b) {
		//b : 매개변수(멤버변수 아님)
		System.out.println("val_3 실행 :"+a+","+b+","+this.b); 
	}
	
	void init(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("init 실행 :"+a+","+b);
	}
	
}

public class MethodMain {

	public static void main(String[] args) {
		MeAAA ma = new MeAAA();
		System.out.println(ma.a);
		int rr = ma.meth(100,"아기상어");  //메소드의 호출
						// i = 100, str = "아기상어"
		//rr = 리턴값
		
		System.out.println("rr:"+rr);
		ma.meth_1();
		//ma.meth_1(1234);
		//int qq = ma.meth_1();
		ma.meth_2(10, 20);
		//ma.meth_2(10);
		//ma.meth_2(10,"asdf");
		//rr = ma.meth_2(10, 20);
		
		ma.meth_3();
		rr = ma.meth_3();
		System.out.println("rr:"+rr);
		System.out.println("ma.meth_3():"+ma.meth_3());
		ma.val_1();
		ma.a = 1111;
		ma.b = 2222;
		ma.val_1();
		ma.val_2(123456);
		ma.val_1();
		//System.out.println(s);
		
		ma.val_3(975);
		ma.val_1();
		ma.init(9988,5544);
		ma.val_1();
	}

}
