package oops_p;

import java.util.Arrays;

class OverCla{
	
	void meth(int a, int b) {
		System.out.println("meth() 기본:"+a+","+b);
	}
	
	void meth(int a, int b,  int c) {
		System.out.println("갯수가 다른 경우:"+a+","+b+","+c);
	}
	
	void meth(int a, String b) {
		System.out.println("자료형이 다른 경우:"+a+","+b);
	}
	void meth(String b, int a) {
		System.out.println("순서가 다른 경우:"+a+","+b);
	}
	
	
//	void meth(int c, int b) { 매개변수의 이름이 다른 것만으로는  overloading 불가
//		System.out.println("meth() 기본:"+a+","+b);
//	}
	
//	void meth(int a, int b) {
//		System.out.println("meth() 기본:"+a+","+b);
//	}
	
//	int meth(int a, int b) {  리턴형과 overloading 은 상관없음
//		System.out.println("meth() 기본:"+a+","+b);
//		return 10;
//	}
	
	
}

class Bakery{
	
	void baking(int wheat) {
		int cnt = wheat/100;
		System.out.println("맨빵을 만들어요"+cnt);
	}
	
	void baking(int wheat, int cream) {
		int cnt = wheat/80;
		System.out.println("크림빵을 만들어요"+cnt);
	}
	
	void baking(int wheat, String to) {
		int cnt = wheat/50;
		System.out.println(to+"빵을 만들어요"+cnt);
	}

	void baking(int wheat, String ... cream) {  //가변 매개변수도 다른걸로 인지
		System.out.println("짬뽕빵을 만들어요"+Arrays.toString(cream));
	}
	
}

class OverNUm{
	
	void calc(int a, int b, char code ) {
		
	}
	
	void calc(int a, int b, String code ) {
		
	}
	
	void calc(int a, char code, int b ) {
		
	}
	void calc(int a, String code , int b) {
		
	}
	
	void calc( char code, int a, int b ) {
		
	}
	
	void calc( String code , int a, int b) {
		
	}
	
}


public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverCla oc = new OverCla();
		
		oc.meth(10, 20);
		oc.meth(10, 20, 30);
		oc.meth(10, "아/아-아\\아/");
		oc.meth("아/아-아\\아/", 10);
		System.out.println("-----------------");
		Bakery pb = new Bakery();
		pb.baking(350);
		pb.baking(350);
		pb.baking(350,"닌자완스");
		pb.baking(350,60);
		pb.baking(350,"호두","메밀","땅콩","조");
		
	}

}
