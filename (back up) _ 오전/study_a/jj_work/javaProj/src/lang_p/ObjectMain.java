package lang_p;

class ObjAAA{

	int a, b;

	public ObjAAA(int a, int b) {	
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ObjAAA [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjAAA other = (ObjAAA) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
	
//	@Override
//	public String toString() { ///인스턴스명을 호출할경우 리턴하는 함수
//		return super.toString();
//		//return "toString() 이여";
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		//return super.equals(obj);
//		
//		ObjAAA you = (ObjAAA)obj;
//		return a == you.a && b == you.b;
//		
//	}
//	
	
	
}
public class ObjectMain {

	public static void main(String[] args) {
		
		ObjAAA a1 = new ObjAAA(10, 20);
		ObjAAA a2 = new ObjAAA(10, 20);
		ObjAAA a3 = a1;
		ObjAAA a4 = new ObjAAA(10, 40);
		
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		
		System.out.println("toString() >>>>");
		System.out.println("a1:"+a1.toString());
		System.out.println("getClass() >>>>");
		System.out.println("a1:"+a1.getClass());  //class가 무엇인지 리턴
		
		Class c1 = a1.getClass();
		System.out.println("a1:"+c1);
		System.out.println("a1:"+a1.getClass().getName());
		System.out.println("a1:"+c1.getName());
		System.out.println("hashCode() >>>>");
		System.out.println("a1:"+a1.hashCode());  //주소
		System.out.println("a2:"+a2.hashCode());  //주소
		System.out.println("a3:"+a3.hashCode());  //주소
		System.out.println("a4:"+a4.hashCode());  //주소
		System.out.println("(a1==a2):"+(a1==a2)); 
		System.out.println("(a1==a3):"+(a1==a3));
		
		System.out.println("equals() >>>>");
		System.out.println("a1.equals(a2):"+a1.equals(a2)); 
		System.out.println("a1.equals(a3):"+a1.equals(a3));
		System.out.println("a1.equals(a4):"+a1.equals(a4));
		
	}

}
