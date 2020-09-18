package pac.pac_1;

import pac.pac_2.NePar;

class WePar{
	int a = 10;
	private int b = 20;
	
	void meth_1() {
		System.out.println("pac1.WePar meth_1()");
	}
	private void meth_2() {
		System.out.println("pac1.WePar meth_2()");
	}
}

class WeChild extends WePar{
	int ca = a;		//default 접근 가능
	//int cb = b;	//private 접근 불가
	
	void meth_c1() {
		super.meth_1();
		//super.meth_2();
	}	
}

class NeChild extends NePar{
	int ca = a;	 //public 접근가능
	int cb = b;  //protected 접근 가능
	//int cc = c; default 접근 불가
	//int cd = d; private 접근 불가
	
	void meth_c1() {
		super.meth_1();//public 접근가능
		super.meth_2();//protected 접근 가능
		//super.meth_3();
		//super.meth_4();
	}	
}

public class ProtectedMain {

	public static void main(String[] args) {
		WeChild wc = new WeChild();
		NePar np = new NePar();
		NeChild nc = new NeChild();
		
		System.out.println("wc.a:"+wc.a);
		//System.out.println("wc.b:"+wc.b);
		wc.meth_1();
		//wc.meth_2();
		
		System.out.println();
		System.out.println("np.a:"+np.a);
//		System.out.println("np.b:"+np.b);//protected 접근 불가
//		System.out.println("np.c:"+np.c);
//		System.out.println("np.d:"+np.d);
		np.meth_1();
//		np.meth_2();
//		np.meth_3();
//		np.meth_4();
		
		System.out.println();
		System.out.println("nc.a:"+nc.a);
//		System.out.println("nc.b:"+nc.b);
//		System.out.println("nc.c:"+nc.c);
//		System.out.println("nc.d:"+nc.d);
		System.out.println("nc.ca:"+nc.ca);
		System.out.println("nc.cb:"+nc.cb);
		nc.meth_1();
//		nc.meth_2();
//		nc.meth_3();
//		nc.meth_4();
		nc.meth_c1();
	}

}

