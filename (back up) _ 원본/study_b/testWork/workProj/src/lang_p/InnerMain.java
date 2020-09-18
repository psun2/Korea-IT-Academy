package lang_p;


class Outer{
	
	int a = 10;
	String b = "�ٱ����";
	
	static int aa = 11;
	//static int dd = InnerStat.d;
	
	InnerMem mm = new InnerMem();
	//static InnerMem mm2 = new InnerMem();
	
	InnerStat ss1 = new InnerStat();
	static InnerStat ss2 = new InnerStat();
	
	//InnerLoc ioc;  ���� ����Ŭ���� ����/����/ȣ�� �Ұ�
	
	void out_1() {
		System.out.println("out_1() ����");
	}
	static void out_11() {
		System.out.println("static out_11() ����");
	}
	
	
	
	void out_2() {
		//System.out.println("out_2() ����:"+a+","+b+","+c);
		//innerMem_1();
	}

	
	void out_3() {
		System.out.println("out_3() ���� >>>>>>>>>>");
		
		class InnerLoc{   ///�޼ҵ� ���ο����� ����/����/����/ȣ�� 
			int e = 5656;
			
			void innLoc_1() {
				System.out.println("innLoc_1() ����:"+a+","+b+","+aa+","+e);
			}
			
			public InnerLoc() {
				System.out.println("\tInnerLoc ������");
			}
		}
		
		InnerLoc ioc = new InnerLoc();
		
		System.out.println("\tioc.e:"+ioc.e);
		ioc.innLoc_1();
		
		System.out.println("out_3() �� >>>>>>>>>>");
	}
	public Outer() {
		System.out.println("Outer() ������");
	}
	
	class InnerMem {
		int c = 3000;
		
		void innerMem_1() {
			System.out.println("innerMem_1() ����:"+a+","+b+","+aa+","+c);
			out_1();
			System.out.println("innerMem_1() ��:-------------------");
		}
		
		public InnerMem() {
			System.out.println("InnerMem() ������");
		}
	}
	
	static class InnerStat {
		int d = 4444;
		
		void innerSta_1() {
			System.out.println("innerSta_1() ����:"+aa+","+d);
			//static ��� �� ���ٰ���
			//System.out.println("innerSta_1() ����:"+a+","+b+","+c);
			//out_1(); 
			out_11();
			System.out.println("innerSta_1() ��:-------------------");
		}
		
		public InnerStat() {
			System.out.println("InnerStat() ������");
		}
	}
	
	
}


public class InnerMain {

	public static void main(String[] args) {
		Outer oo = new Outer();
		System.out.println("�̳� member---------------------");
		//Outer.InnerMem im = new Outer.InnerMem();
		//Outer.InnerMem im = Outer.new InnerMem();
		Outer.InnerMem im = oo.new InnerMem();
		System.out.println("�̳� static---------------------");
		Outer.InnerStat is1 = new Outer.InnerStat();
		//Outer.InnerStat is2 = Outer.new InnerStat();
		//Outer.InnerStat is2 = oo.new InnerStat();
		System.out.println("�̳� local ����---------------------");
		//Outer.InnerLoc ioc;
		//oo.out_3().InnerLoc ioc;  ���� ���� Ŭ������ ���ο��� ����/����/ȣ�� �Ұ�
		System.out.println("�̳� anonymous---------------------");
		Outer ooAno = new Outer() {
			
			
			////�����Ǻ�
			
			class Ano{			//�͸�Ŭ���� ����
				int f = 7777;
				
				void ano_1() {
					System.out.println("anno_1() ����:"+a+","+b+","+aa+","+f);
				}
				public Ano() {
					System.out.println("\t\tAnno() ������");
					nnnee();
				}
			}
			
			Ano an = new Ano();
			
			//an.ano_1();
			
			//������
			void out_2() {
				System.out.println("������ ������ out_2()");
				an.ano_1();
			}
			
			//���� ����
			void nnnee() {  //���� ���������� ��� ����
				System.out.println("�������� �ִ� nnnee()");
				
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
		//ooAno.ano_1();  �͸� ���� �Ұ�
		//System.out.println(ooAno.an);
		ooAno.out_1();
		ooAno.out_2();	//������ ������ �� �޼ҵ�� ȣ�� ����
		//ooAno.nnnee();  ������ ���� ������ �޼ҵ�� �������ο����� ��� ����
		
	}

}
