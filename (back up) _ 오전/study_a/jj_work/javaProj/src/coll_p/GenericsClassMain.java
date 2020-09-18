package coll_p;

import java.util.Arrays;

class GenCla<TAA1,  T3>{
	TAA1 a;
	TAA1 b;
	T3 [] arr;
	public GenCla(TAA1 a, TAA1 b, T3 ... arr) {
		super();
		this.a = a;
		this.b = b;
		this.arr = arr;
	}
	@Override
	public String toString() {
		return "GenCla [a=" + a + ", b=" + b + ", arr=" + Arrays.toString(arr) + "]";
	}

}

public class GenericsClassMain {

	public static void main(String[] args) {
		
		//generics 를 명시하지 않으면 Object
		GenCla gc1 = new GenCla(12,34,55,66,77,88);
		gc1.a = "유민상";
		System.out.println(gc1);
		//	String a1 = gc1.a;  gc1.a : Object 이기때문에 형변환 필요
		
		
		
	//	GenCla<int, double, String> gc2;  클래스 정의명으로 타입지정
		GenCla<Integer,  String> gc2;
		// 생성시 generics 를 명시하지 않으면 Object 로 지정
		gc2 = new GenCla(123.456,  11,22);
		
	//	gc2.a = "이정민";  선언시의 타입을 맞춰서 대입해야함 
		gc2.a = 300;  //형변환 맞춰 대입
		System.out.println(gc2);  //정상출력
		
		// 생성시 generics 를 명시하면 타입에 맞게 생성
		//gc2 = new GenCla<Integer, Double, String>(123.456, 123.456, 11,22);
		gc2 = new GenCla<Integer,  String>
		                 (100,    200,   "안신혁","이슬아");
		System.out.println(gc2);  //정상출력

		
		
		int a2 = gc2.a;   //generics 로 명시되어 형변환 하지 않아도 됨
		
		
		
		
		GenCla<Boolean,  Integer> gc3;
		gc3 =  new GenCla<Boolean,  Integer>
         (true, false,  111,222,333);
		System.out.println(gc3);
		
	}

}

