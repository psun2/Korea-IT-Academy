package lang_p;

class SingleTTT{
	
	int a = 10;
	
	private static SingleTTT me = null;
	
	private SingleTTT() {
		System.out.println("생성자 실행");
	}
	
	public static SingleTTT getInstance() {
		
		if(me==null)
			me = new SingleTTT();
		
		return me;
	}
}


public class SingleTonMain {

	public static void main(String[] args) {
		
		//SingleTTT st1 = new SingleTTT();
		SingleTTT st1 = SingleTTT.getInstance();
		SingleTTT st2 = SingleTTT.getInstance();
		SingleTTT st3 = SingleTTT.getInstance();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		
		
		System.out.println(st1.a+","+st2.a+","+st3.a);
		st1.a = 1234;
		
		System.out.println(st1.a+","+st2.a+","+st3.a);
	}

}
