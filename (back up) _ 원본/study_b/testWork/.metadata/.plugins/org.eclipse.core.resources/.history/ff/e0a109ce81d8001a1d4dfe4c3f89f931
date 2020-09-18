package lang_p;

class AAA{
	int a;
	String b;
	public AAA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return a+","+b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
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
		AAA other = (AAA) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		AAA you = (AAA)obj;
//		//return super.equals(obj);
//		//return this == obj; 
//		return a==you.a && b.equals(you.b);
//	}
	
	
}

public class ObjectMain {

	public static void main(String[] args) {
		
		AAA a1 = new AAA(10, "아기상어");
		AAA a2 = new AAA(20, "엄마상어");
		AAA a3 = new AAA(10, "아기상어");
		AAA a4 = a1;
		
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		System.out.println("a4:"+a4);
		
		System.out.println("class--------------------");
		System.out.println("a1:"+a1.getClass().getName());
		System.out.println("a2:"+a2.getClass().getName());
		System.out.println("a3:"+a3.getClass().getName());
		System.out.println("a4:"+a4.getClass().getName());
		
		System.out.println("hashCode()--------------------");
		System.out.println("a1:"+a1.hashCode());
		System.out.println("a2:"+a2.hashCode());
		System.out.println("a3:"+a3.hashCode());
		System.out.println("a4:"+a4.hashCode());

		System.out.println("toString()--------------------");
		System.out.println("a1:"+a1.toString());
		System.out.println("a2:"+a2.toString());
		System.out.println("a3:"+a3.toString());
		System.out.println("a4:"+a4.toString());
		
		System.out.println("==");
		System.out.println("a1==a2 : "+(a1==a2));
		System.out.println("a1==a3 : "+(a1==a3));
		System.out.println("a1==a4 : "+(a1==a4));
		
		System.out.println("equals()----------------------");
		System.out.println("a1.equals(a2) : "+a1.equals(a2));
		System.out.println("a1.equals(a3) : "+a1.equals(a3));
		System.out.println("a1.equals(a4) : "+a1.equals(a4));
	}

}
