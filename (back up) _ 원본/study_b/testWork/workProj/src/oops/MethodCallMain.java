package oops;


class MethodCall{
	
	int a=10;
	
	
	void meth_1() {
		int b = 200, c= 300;
		System.out.println("meth_1()시작"+a+","+b+","+c);
		a++;
		b++;
		c++;
		
		boolean res=meth_2();
		System.out.println("meth_2() res:"+res);
		//System.out.println("meth_1()끝"+a+","+b+","+d);
		System.out.println("meth_1()끝"+a+","+b+","+c);
	}
	
	boolean meth_2() {
		int b = 20000, d= 40000;
		//System.out.println("\tmeth_2()시작"+a+","+b+","+c);
		System.out.println("\tmeth_2()시작"+a+","+b+","+d);
		a++;
		b++;
		d++;
		String res=meth_3();
		System.out.println("\tmeth_2() res:"+res);
		System.out.println("\tmeth_2()끝"+a+","+b);
		return false;
	}
	
	String meth_3() {
		int b = 2020;
		System.out.println("\t\tmeth_3()시작"+a+","+b);
		a++;
		b++;
		//meth_1();
		System.out.println("\t\tmeth_3()끝"+a+","+b);
		return "m3 갔다옴"; 
	}
	
	
}

public class MethodCallMain {

	public static void main(String[] args) {

		MethodCall mc = new MethodCall();
		mc.meth_1();

	}

}
