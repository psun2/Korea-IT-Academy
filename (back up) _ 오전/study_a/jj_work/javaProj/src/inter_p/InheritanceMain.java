package inter_p;

interface InPar1{
	int a = 10;
	void meth_1();
	void meth_22();
}

interface InPar2{
	int b = 2000;
	void meth_1();
	void meth_3();
}
interface InPar3{
	int c = 3333;
	void meth_4();
	void meth_2();
}

interface InChild extends InPar1, InPar2, InPar3{
	
}



class Par1 implements InPar1{
	
	public void meth_1() {
		System.out.println("Par1.meth_1() 角青");
	}

	
	public void meth_22() {
		System.out.println("Par1.meth_22() 角青");
	}
	
}

class Par2 extends Par1 implements InPar2{
	
	public void meth_3() {
		System.out.println("Par2.meth_3() 角青");
	}
	
}

class Par3 extends Par2 implements InPar3{
	
	public void meth_4() {
		System.out.println("Par3.meth_4() 角青");
	}
	
	public void meth_2() {
		System.out.println("Par3.meth_2() 角青");
	}
}

class ImplChild extends Par3 implements InChild{
	
	
}

public class InheritanceMain {

	public static void main(String[] args) {
		ImplChild cc = new ImplChild();
		
		InChild inc = cc;
		InPar1 pp1 = cc;
		InPar2 pp2 = cc;
		InPar3 pp3 = cc;
		
		pp1 = inc;
		pp2 = inc;
		pp3 = inc;
		
		cc.meth_1();
		cc.meth_22();
		cc.meth_3();
		cc.meth_4();
		
		pp1 = new Par1();
		pp2 = new Par2();
		pp3 = new Par3();
		
	}

}
