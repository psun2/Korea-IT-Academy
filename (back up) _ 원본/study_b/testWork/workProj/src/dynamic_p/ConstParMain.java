package dynamic_p;

class ConsChild extends ConsPar{
	ConsChild(int dd, int ee) { //123,456
		//System.out.println();
		//a = 10;
		super(d,ee);	//2222,	456		//-------0
		d=dd;           //d = 123
		System.out.println("�ڽĻ�����");  //------ 6
	}
	
	int c=initC();	//c=1111	//------------------ 5
	static int d=initD();  //---------------------2
	
	int initC() {			//-------------------5.1
		System.out.println("�ڽ� c : 1111");
		return 1111;
	}
	static int initD() {	//-------------------2.1
		System.out.println("�ڽ� static d : 2222");
		return 2222;
	}
	
	void ppp() {
		System.out.println(a+","+b+","+c+","+d);
	}
}

class ConsPar{
	int a=initA();			//-------------------3
	static int b=initB(); //----------------------1

	ConsPar(int a, int b) {   //2222, 456
		System.out.println("�θ������");   // ----- 4
		this.a = a; //this.a = 2222
		this.b = b; //this.b = 456
	}
	
	int initA() {					//------------3.1
		System.out.println("�θ� a : 1");
		return 1;
	}
	static int initB() {            //----------- 1.1
		System.out.println("�θ� static b : 2");
		return 2;
	}
	
}

public class ConstParMain {

	public static void main(String[] args) {
		ConsChild cc = new ConsChild(123, 456);
		cc.ppp();
	}

}
