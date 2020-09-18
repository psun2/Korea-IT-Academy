package dynamic_p;

abstract class FinalPar{
	
	int a = 10;
	final int b = 20;
	static int c = 30;
	final static int d = 40;
	//final int e;  초기값 없는 final 변수 사용불가
	final int e;  //최초 1회 값 입력 받는 경우만 대입 가능 
	//(변수 선언시 초기화  or 생성자내 초기화)
	
	
	
	
	public FinalPar() {
		//b = 2345; // 초기값 있는 final 변수값 대입 불가
		e = 5678;	// 생성시 초기값 없는 final 변수 값 대입 가능
	}

	void meth_1() {
		a = 1111;
		//b = 2222; final 대입불가
		c = 3333;
		//d = 4444;
		//e = 5555;
		System.out.println("부모 meth_1() 실행");
	}
	
	final void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
	
	//final abstract void meth_3() ; final 과  abstract는 동시에 사용불가
	abstract void meth_3() ;
	
	static void meth_4() {
		System.out.println("부모 meth_4() 실행");
	}
	
	final static void meth_5() {
		System.out.println("부모 meth_5() 실행");
	}
}

class FinalChild extends FinalPar{
	
	int a = 101;
	final int b = 202;  //hiding 되어 부모/자식 서로 다른 변수임
	static int c = 303;
	final static int d = 404;  //hiding 되어 부모/자식 서로 다른 변수임
	
	
	

	@Override
	void meth_3() {
		System.out.println("자식 meth_3() 실행");
		
	}
	
	void meth_1() {
		System.out.println("자식 meth_1() 실행");
	}
	
	/* final 메소드 overriding 불가
	void meth_2() {
		System.out.println("자식 meth_2() 실행");
	}
	*/
	
	static void meth_4() {
		System.out.println("자식 meth_4() 실행");
	}
	/* final 메소드 overriding 불가
	final static void meth_5() {
		System.out.println("자식 meth_5() 실행");
	}
	 */

}
public class FinalMain {

	public static void main(String[] args) {

		FinalChild fc = new FinalChild() {
			
			int a = 135;		//생성시 메소드에서만 사용가능함
			final int b = 246;
			//static int c = 789; static 생성시 overriding  불가
			final static int d = 369; //final 이라 사용가능 static 의 의미가 없음

			void meth_3() {
				///클래스의 정의된 멤버변수가 아닌 생성시에 선언된 변수들이 우선순위를 가짐
				System.out.println("생성시 meth_3() 실행:"+a+","+b+","+c+","+d);
				
			}
			
			void meth_1() {
				a = 11223344;
				//b = 44556677; final
				System.out.println("생성시 meth_1() 실행");
			}
			
			/* final 메소드 overriding 불가
			void meth_2() {
				System.out.println("생성시 meth_2() 실행");
			}
			*/
			
			/* static 생성시 overriding  불가
			 static void meth_4() { 
				System.out.println("생성시 meth_4() 실행");
			}
			*/
			/* final 메소드 overriding 불가
			final static void meth_5() {
				System.out.println("생성시 meth_5() 실행");
			}
			 */
		};
		
		
		System.out.println("fc:"+fc.a+","+fc.b+","+fc.c+","+fc.d+","+fc.e);
		fc.a = 1000;
		//fc.b = 2000; final 대입불가
		fc.c = 3000;
		//fc.d = 4000; final 대입불가
		
		System.out.println("fc:"+fc.a+","+fc.b+","+fc.c+","+fc.d+","+fc.e);
		
		
		fc.meth_1();
		fc.meth_2();
		fc.meth_3();
		fc.meth_4();
		fc.meth_5();
		
		System.out.println("--------------------");
		FinalPar fpc = fc;
		System.out.println("fpc:"+fpc.a+","+fpc.b+","+fpc.c+","+fpc.d+","+fpc.e);
		fc.meth_1();
		fc.meth_2();
		fc.meth_3();
		fc.meth_4();
		fc.meth_5();
		
		//생성시 overriding 된 메소드의 호출은 생성시  hiding된 멤버변수에 접근하므로 실제 멤버변수에 영향을 미치지 못함
		System.out.println("fpc:"+fpc.a+","+fpc.b+","+fpc.c+","+fpc.d+","+fpc.e);
		
		
		
		/*
		 
		 부모 : 커피
		 자식 : 
		 			원두,   물  비율은 고정
		 아메리카노 	2		8
		 아시아노		3		7
		 아프리카노	1		9
		 
		 order(4);  //4:커피주문수
		 
		 각 커피의 량은 200cc 임
		 
		 주문후 원두와 물의 합계를 출력하세요
		 
		 캡슐화 X
		 * */
		
		
		
		
		
		
		
		
		
	}

}
