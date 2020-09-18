package class_p;


class SingAAA{
	int a = 10;
	String b = "아기상어";
	private 
	static SingAAA me;
	private SingAAA() {
		System.out.println("private SingAAA 생성자()");
	}
	
	static SingAAA giveMe() {
		
		if(me==null)
			me = new SingAAA();
		
		
		return me;
	}

	@Override
	public String toString() {
		return "SingAAA [a=" + a + ", b=" + b + "]";
	}
	
	
}

class SingBBB{
	int a = 123;
	String b = "아기하어";
	@Override
	public String toString() {
		return "SingBBB [a=" + a + ", b=" + b + "]";
	}
	SingBBB me;
	
	
	SingBBB giveMe() {
		me = new SingBBB();
		return me;
	}
	
}

public class SingleTonMain {

	public static void main(String[] args) {
		//SingAAA a1 = new SingAAA();
		SingAAA a1 = SingAAA.giveMe();
		SingAAA a2 = SingAAA.giveMe();
		SingAAA a3 = SingAAA.giveMe();
		SingBBB b1 = new SingBBB();
		
		
		a1.a = 20;
		a2.b = "엄마상어";
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		System.out.println("b1:"+b1);

	}

}
