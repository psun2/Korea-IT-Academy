package class_p;

class AAA{
	public AAA() {
		System.out.println("AAA 생성자-----------");
	}
	
	void meth_2() {
		// 접근 불가
		//System.out.println("AAA.meth_2() 실행:"+a);
		System.out.println("AAA.meth_2() 실행:");
	}
	void meth_22() {
		
		System.out.println("AAA.meth_22() 실행:");
	}
}

class Big{
	String a = "Big_a";
	static String a_st = "Big_a_st";
	
	Inner ic = new Inner();		//1. 일반 중첩을 멤버필드로
	Inner_Static ics = new Inner_Static();//2. static 중첩을 멤버필드로
	//Inner_Local icl = new Inner_Local(); //3. local 중첩 접근 및 생성 불가
	//meth_4().Inner_Local icl = meth_4().new Inner_Local();
	AAA ac = new AAA();
	
	public Big() {
		System.out.println("Big 생성자-----------");
	}
	
	void meth_1() {
		System.out.println("Big.meth_1() 실행");
		
		/* 메소드 내부에 메소드 정의 불가
		void meth_sub() {
			
		}
		*/
	}
	
	void meth_3() {
		System.out.println("Big.meth_3() 시작 ---");
		//meth_2();
		ic.meth_2();
		System.out.println("Big.meth_3() 끝 ---");
	}
	
	
	void meth_4() {
		System.out.println("Big.meth_4() 시작 ---");
		
		int f = 123;
		
		//3. 지역 중첩클래스
		class Inner_Local{
			void meth_5() {
				
				//Outer 멤버변수와 메소드의 지역변수 호출 가능
				System.out.println("Big.meth_4().Inner_Local.meth_5() 실행:"+a+","+f);
			}
		}
		
		//정의된 메소드 내부에서 지역 중첩 클래스 사용 가능
		Inner_Local icl2 = new Inner_Local(); 
		icl2.meth_5();
		
		//4. 익명 중첩클래스
		AAA ianno = new AAA() {
			
			@Override  //익명 재정의 메소드
			void meth_2() {
				System.out.println("생성시 meth_2() 재정의 실행");
			}
		};
		
		ianno.meth_2();
		ianno.meth_22();
		
		
		
		System.out.println("Big.meth_4() 끝 ---");
	}
	
	
	
	
	
	
	
	
	//1. 멤버 중첩클래스
	class Inner{  
		
		public Inner() {
			System.out.println("Inner 생성자-----------");
		}
		
		String b = "Big_Inner_b";
		//static String c = "Big_Inner_c"; 일반 inner 는 static 멤버 정의 불가
		
		void meth_2() {
								//Outer 의 멤버변수 접근 가능
			System.out.println("Inner.meth_2() 실행:"+a+","+b);
		}
	}
	
	//2. Nested class
	static class Inner_Static{
		
		public Inner_Static() {
			System.out.println("Inner_Static 생성자-----------");
		
		}
		
		String b = "Big_In_St_b";
		static String c = "Big_In_St_c";
		
		void meth_2() {
								//Outer 의 일반 멤버 접근 불가
			//System.out.println("Inner_Static.meth_2() 실행:"+a+","+b);
			//Outer 의 static 멤버 접근 가능
			System.out.println("Inner_Static.meth_2() 실행:"+a_st+","+b);
		}
	}
	
	
	
}

public class InnerClassMain {

	public static void main(String[] args) {
		Big big = new Big();
		big.meth_1();
		big.ic.meth_2();
		big.ic.b = "bbb";
		big.meth_3();
		System.out.println();
		Big.Inner inn;
		//inn = new Big.Inner();
		//inn = new big.Inner();
		inn = big.new Inner();
		inn.meth_2();
		big.a = "bb_aa";
		inn.meth_2();
		big.ic.meth_2();
		System.out.println();
		//Big.Inner inn2 = new Big$Inner();
		//Big$Inner inn2;
		//Big.Inner inn2 = big$Inner();
		Big.Inner_Static inn_st = new Big.Inner_Static(); 
		//Inner_Static Inn_st2 = new Inner_Static();
		Big.Inner_Static inn_st2;
		//inn_st2 = big.new Inner_Static();
		//inn_st2 = Big.new Inner_Static();
		inn_st.meth_2();
		
		System.out.println();
		big.meth_4();
	}

}
