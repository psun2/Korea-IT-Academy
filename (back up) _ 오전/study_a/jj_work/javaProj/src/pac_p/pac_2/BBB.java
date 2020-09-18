package pac_p.pac_2;

public class BBB {
	String a = "pac_2.BBB.a";
	public String b = "pac_2.BBB.b";
	protected String c = "pac_2.BBB.c";
	private String d = "pac_2.BBB.d";
	
	void meth_1() {
		System.out.println("pac_2.BBB.meth_1() 실행");
	}
	
	public void meth_2() {
		System.out.println("pac_2.BBB.meth_2() 실행:"+a+","+b+","+c+","+d);
	}
}
