package pac_p.pac_1;

import pac_p.pac_2.BBB;  //다른 패키지 클래스 가져오기
import pac_p.pac_2.*;	//pac_2 접근 가능한 클래스 정의 모두 가져오기
//import pac_p.pac_2.CCC;
//import pac_p.pac_2.DDD;
import pac_p.pac_1.sub.*; //상하위 패키지도 다른 패키지 임 

class AAA{
	String a = "pac_1.AAA.a";
	private String b = "pac_1.AAA.b"; //정의부에서만 접근가능
	int c;
	private int d;
	void meth_1() {
		//private 클래스 정의부의 메소드에서 접근 가능
		System.out.println("pac_1.AAA.meth_1() 실행:"
		+a+","+b+","+c+","+d);
	}
	
	void init_B(String b) { //메소드를 통해 private  접근가능
		this.b = b;
	}
	String out_B() {
		return b;
	}
	
	void init_D(int d) { //메소드를 통해 private  접근가능
		if(d<0 || d>100) { //유효범위 확인
			System.out.println("입력 에러");
			return;
		}
			
		this.d = d;
	}
}



class ChildBBB extends BBB{
	//다른패키지의 부모클래스에 상속관계의 자식클래스가 접근가능한 경우
	//void init_A(String a) {
		//this.a = a; default 접근불가
	//}
	
	void init_C(String c) {
		this.c = c; //protected 접근 가능
	}
	
	//void init_D(String d) {
		//this.d = d; //private 접근 불가
	//}
}

class ChildFFF extends FFF{
	
	void init_A(String a) {
		this.a = a; //같은 패키지 default 접근가능
	}
	
	void init_C(String c) {
		this.c = c; //protected 접근 가능
	}
	
	void init_D(String d) {
		//this.d = d; //private 접근 불가
	}
}


public class PacMain {

	public static void main(String[] args) {
		
		
		System.out.println("pacMain  입니다.");
		AAA p1a = new AAA();
		pac_p.pac_1.BBB p1b = new pac_p.pac_1.BBB();
		BBB p2b = new BBB();
		CCC p1c = new CCC();
		pac_p.pac_2.CCC p2c = new pac_p.pac_2.CCC();
		//DDD p2d = new DDD();
		EEE p1e = new EEE();
		FFF p1f = new FFF();
		GGG psg = new GGG();
		ChildBBB p1cb = new ChildBBB();
		ChildFFF p1cf = new ChildFFF();
		
		
		System.out.println("p1a.a:"+p1a.a);
		//System.out.println("p1a.b:"+p1a.b);
		System.out.println("p2b:"+p2b);
		//System.out.println("p2b.a:"+p2b.a);
		System.out.println("p1b.a:"+p1b.a);
		System.out.println("p2b.b:"+p2b.b);
		//System.out.println("p2b.c:"+p2b.c);
		System.out.println("p1c.a:"+p1c.a);
		System.out.println("p2c.a:"+p2c.a);
		System.out.println("p1e.a:"+p1e.a);
		System.out.println("p1f.a:"+p1f.a);
		System.out.println("psg.a:"+psg.a);
		
		System.out.println("---------------");
		p1a.init_B("아기상어");
		p1a.meth_1();
		//p2b.meth_1();
		p2b.meth_2();
		System.out.println("p1a.out_B():"+p1a.out_B());
		
		p1a.c = 245;
		//p1a.d = 245;
		p1a.init_D(245);
		p1a.init_D(88);
		p1a.meth_1();
		System.out.println("---------------");
		p1cb.meth_2();
		p1cb.b = "엄마상어";
//		p1cb.a = "할아버지상어";
//		p1cb.c = "아빠상어";
//		p1cb.d = "할아버지상어";
		p1cb.init_C("아빠상어");
		p1cb.meth_2();
		
		System.out.println("---------------");
		p1cf.meth_2();
		p1cf.b = "엄마상어";
		p1cf.a = "할아버지상어";
		p1cf.c = "아빠상어";
	//	p1cf.d = "할아버지상어";
		p1cf.init_A("개나리");
		p1cf.init_C("소나리");
		p1cf.meth_2();
	}

}
