package dynamic_p;

abstract class DyShape{

	public DyShape(String name) {

		this.name = name;
	}

	String name;
	
	double area, border;
	
	abstract void calc();
	
	void ppp() {
		calc();
		
		String ttt = name+":"+area+","+border;
		
		System.out.println(ttt);
	}
	
}

class DyRec extends DyShape{
	
	int w, h;

	public DyRec( int w, int h) {
		super("���簢��");
		this.w = w;
		this.h = h;
	}
	
	void calc() {
		area = w*h;
		border = (w+h)*2;
	}
	
}


class DyCir extends DyShape{
	
	int r;

	public DyCir( int r) {
		super("��");
		this.r = r;
	}
	
	void ccc() {
		System.out.println("���� �ȵų�?");
	}

	void calc() {
		double pi = 3.141592;
		area = pi*r*r;
		border = pi*r*2;
	}
	
}


abstract class DyCar{
	String name;
	
	double res;

	public DyCar(String name) {
		super();
		this.name = name;
	}
	
	abstract void calc();
	
	void ppp() {
		calc();
		System.out.println( name+":"+res);
	}
	
}

class DySport extends DyCar{
	double [] rate = {0.5,0.2,0.3};
	
	int [] jum;

	public DySport(int speed, int fuel, int design) {
		super("������ī");
		jum = new int[] {speed,  fuel,  design};
	}

	
	void calc() {
		res = 0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}	
	}
         
}

class DyTruck extends DyCar{
	double [] rate = {0.6,0.4};
	
	int [] jum;

	public DyTruck(int fuel, int carry) {
		super("Ʈ��");
		jum = new int[] { fuel,  carry};
	}

	
	void calc() {
		res = 0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}	
	}
         
}

class DyVan extends DyCar{
	double [] rate = {0.15,0.35,0.5};
	
	int [] jum;

	public DyVan(int speed, int fuel, int person) {
		super("������");
		jum = new int[] {speed,  fuel,  person};
	}

	
	void calc() {
		res = 0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}	
	}
         
}


public class DyShapeMain {

	public static void main(String[] args) {
		DyShape [] arr = {
			new DyRec(5, 6),
			new DyCir(5),
			new DyRec(7, 3),
			new DyCir(3)
		};
		
		for (DyShape ds : arr) {
			//ds.calc();
			ds.ppp();
		}
		
		
		DyCar [] cars = {
				new DySport(85, 74, 91),
				new DyTruck(67, 41),
				new DySport(85, 74, 91),
				new DyVan(60, 45, 78)
		};
		
		for (DyCar dc : cars) {
			dc.ppp();
		}
		
		
		
		DyShape ds = new DyCir(5);
		//ds.ccc();
		
		DyCir cd = (DyCir)ds;
		cd.ccc();
		
		ds = new DyRec(8, 9);
		//ds = new DyShape("���̾�") ;
		
		ds.calc();
		
		ds = new DyShape("���̾�") {
			
			//area = 123;
			
			int a = 10;
			
			int border = 456;
			
			void ccc() {
				area = 123;
				System.out.println("������ ccc() ����");
			}
			
			
			@Override
			void calc() {
				ccc();
				System.out.println("������ calc() ����");
			}
		} ;
		
		ds.calc();
		//ds.ccc();
		//System.out.println(ds.a);
		ds.ppp();
	}
	
	
	
	/*
	 �ڵ��� ���� �׽�Ʈ �ϼ���

�θ� : �ڵ���

�ڽ� 
 	������ī  : �ӵ� 50 , ���� 20, ������ 30
	Ʈ�� :    ���� 60 , ���緮 40
	������ :   �ӵ� 15 , ���� 35, ž���ο� 50

���� �� ���������� ������ �� ��
	 */
	
	

}
