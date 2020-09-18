package lang_p;


class Outer{
	
	int a = 10;
	String b = "바깥양반";
	
	static int aa = 11;
	//static int dd = InnerStat.d;
	
	InnerMem mm = new InnerMem();
	//static InnerMem mm2 = new InnerMem();
	
	InnerStat ss1 = new InnerStat();
	static InnerStat ss2 = new InnerStat();
	
	//InnerLoc ioc;  내부 지역클래스 선언/생성/호출 불가
	
	void out_1() {
		System.out.println("out_1() 실행");
	}
	static void out_11() {
		System.out.println("static out_11() 실행");
	}
	
	
	
	void out_2() {
		//System.out.println("out_2() 실행:"+a+","+b+","+c);
		//innerMem_1();
	}

	
	void out_3() {
		System.out.println("out_3() 실행 >>>>>>>>>>");
		
		class InnerLoc{   ///메소드 내부에서만 정의/선언/생성/호출 
			int e = 5656;
			
			void innLoc_1() {
				System.out.println("innLoc_1() 실행:"+a+","+b+","+aa+","+e);
			}
			
			public InnerLoc() {
				System.out.println("\tInnerLoc 생성자");
			}
		}
		
		InnerLoc ioc = new InnerLoc();
		
		System.out.println("\tioc.e:"+ioc.e);
		ioc.innLoc_1();
		
		System.out.println("out_3() 끝 >>>>>>>>>>");
	}
	public Outer() {
		System.out.println("Outer() 생성자");
	}
	
	class InnerMem {
		int c = 3000;
		
		void innerMem_1() {
			System.out.println("innerMem_1() 시작:"+a+","+b+","+aa+","+c);
			out_1();
			System.out.println("innerMem_1() 끝:-------------------");
		}
		
		public InnerMem() {
			System.out.println("InnerMem() 생성자");
		}
	}
	
	static class InnerStat {
		int d = 4444;
		
		void innerSta_1() {
			System.out.println("innerSta_1() 시작:"+aa+","+d);
			//static 요소 만 접근가능
			//System.out.println("innerSta_1() 시작:"+a+","+b+","+c);
			//out_1(); 
			out_11();
			System.out.println("innerSta_1() 끝:-------------------");
		}
		
		public InnerStat() {
			System.out.println("InnerStat() 생성자");
		}
	}
	
	
}


public class InnerMain {

	public static void main(String[] args) {
		Outer oo = new Outer();
		System.out.println("이너 member---------------------");
		//Outer.InnerMem im = new Outer.InnerMem();
		//Outer.InnerMem im = Outer.new InnerMem();
		Outer.InnerMem im = oo.new InnerMem();
		System.out.println("이너 static---------------------");
		Outer.InnerStat is1 = new Outer.InnerStat();
		//Outer.InnerStat is2 = Outer.new InnerStat();
		//Outer.InnerStat is2 = oo.new InnerStat();
		System.out.println("이너 local 실패---------------------");
		//Outer.InnerLoc ioc;
		//oo.out_3().InnerLoc ioc;  지역 내부 클래스는 메인에서 선언/생성/호출 불가
		System.out.println("이너 anonymous---------------------");
		Outer ooAno = new Outer() {
			
			
			////재정의부
			
			class Ano{			//익명클래스 정의
				int f = 7777;
				
				void ano_1() {
					System.out.println("anno_1() 실행:"+a+","+b+","+aa+","+f);
				}
				public Ano() {
					System.out.println("\t\tAnno() 생성자");
					nnnee();
				}
			}
			
			Ano an = new Ano();
			
			//an.ano_1();
			
			//재정의
			void out_2() {
				System.out.println("생성시 재정의 out_2()");
				an.ano_1();
			}
			
			//새로 정의
			void nnnee() {  //생성 구간에서만 사용 가능
				System.out.println("생성에만 있는 nnnee()");
				
			}
			
		};
		//Outer.Ano oa;
		//ooAno.Outer.Ano oa;
		System.out.println("---------------------");
		
		System.out.println("im.c:"+im.c);
		im.innerMem_1();
		//System.out.println("im.c:"+im.a);
		//im.out_1();
		
		System.out.println("is1.d:"+is1.d);
		is1.innerSta_1();
		
		//System.out.println("Outer.InnerStat:"+Outer.InnerStat.d);
		oo.out_3();
		System.out.println("---------------------");
		//ooAno.ano_1();  익명 접근 불가
		//System.out.println(ooAno.an);
		ooAno.out_1();
		ooAno.out_2();	//생성시 재정의 된 메소드로 호출 가능
		//ooAno.nnnee();  생성시 새로 정의한 메소드는 생성내부에서만 사용 가능
		
	}

}
