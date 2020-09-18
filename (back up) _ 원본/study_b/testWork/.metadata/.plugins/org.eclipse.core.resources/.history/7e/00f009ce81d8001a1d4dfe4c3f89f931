package lang_p;

class ClaAAA{
	int a = 10;
	String b = "양다리 미워";
	
	@Override
	public String toString() {
		return "ClaAAA [a=" + a + ", b=" + b + "]";
	}

}


class ClaBBB{
	String a = "그럼 난 오다리";
	String b = "투다리 미워";
	
	
	
	public ClaBBB(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}



	@Override
	public String toString() {
		return "ClaBBB [a=" + a + ", b=" + b + "]";
	}
	
	
}

public class ClassMain {

	public static void main(String[] args) throws Exception{
		ClaAAA aa = new ClaAAA();
		Class cc = aa.getClass();
		ClaAAA aa1 = (ClaAAA)cc.newInstance();
		
		System.out.println("cc:"+cc);
		System.out.println("aa1:"+aa1);
		System.out.println("aa:"+aa.hashCode());
		System.out.println("aa1:"+aa1.hashCode());
		System.out.println(aa==aa1);
		
		Class cc1 = Class.forName("lang_p.ClaAAA");
		System.out.println("cc1:"+cc1);
		ClaAAA aa2 = (ClaAAA)cc.newInstance();
		System.out.println("aa2:"+aa2);
		System.out.println("aa2:"+aa.hashCode());
		
		String claName = "lang_p.ClaAAA";
		ClaAAA aa3= (ClaAAA)Class.forName(claName).newInstance();
		System.out.println("aa3:"+aa3);
		
		//ClaBBB bb1= (ClaBBB)Class.forName("lang_p.ClaBBB").newInstance();
		//getConstructor(), 생성자 타입을 지정한다. :: 인수는 가변 매개변수
		ClaBBB bb1= (ClaBBB)Class.forName("lang_p.ClaBBB").
							getConstructor(String.class, String.class).
							newInstance("아기상어","뚜루루뚜루");
		
		
		System.out.println("bb1:"+bb1);
		
		Class [] conArr = {String.class, String.class};
		
		ClaBBB bb2= (ClaBBB)Class.forName("lang_p.ClaBBB").
				getConstructor(conArr).
				newInstance("엄마상어","뚜루루뚜루");


		System.out.println("bb2:"+bb2);
		
		
		Class [] conArr2 = {
				
				Class.forName("java.lang.String"),
				Class.forName("java.lang.String")
			};
		
		ClaBBB bb3= (ClaBBB)Class.forName("lang_p.ClaBBB").
				getConstructor(conArr2).
				newInstance("아빠상어","뚜루루뚜루");


		System.out.println("bb3:"+bb3);
		
		String [] strArr = "java.lang.String,java.lang.String".split(",");
		
		Class [] conArr3 = new Class[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			conArr3[i] = Class.forName(strArr[i]);
		}
		
		ClaBBB bb4= (ClaBBB)Class.forName("lang_p.ClaBBB").
				getConstructor(conArr3).
				newInstance("할머니상어","뚜루루뚜루");


		System.out.println("bb4:"+bb4);

	}

}
