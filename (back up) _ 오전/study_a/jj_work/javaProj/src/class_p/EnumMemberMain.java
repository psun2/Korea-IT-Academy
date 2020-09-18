package class_p;

enum Type2{
	//상수화==> 열거형 배열을 생성하는 과정임 -> 상수 (배열의 원소)
	//{new Type2(),new Type2(),new Type2(),new Type2() } 기본생성자
	//배열을 미리 만들어 놓고 사용 (상수임)
	WALKING, RUNNING, TRACKING, HIKING;
	
	String name;
	
	private int price;
	
	int cnt;
}

enum Type3{
	
	//상수화==> 열거형 배열을 생성하는 과정임 -> 상수 (배열의 원소)
	//사용자 정의 생성자일경우 생성시 생성자의 형태로 생성하여야 한다.
	//{new Type3(name, price), new Type3(name, price),...}
	//배열을 미리 만들어 놓고 사용 (상수임)
	//    0					1			2							3                   1
	WALKING("워킹화",3000), KOR_SH(), TRACKING("트래킹화",4800), HIKING("하이킹화",3400);
	
	//사용자 정의 생성자
	private Type3(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//기본생성자
	private Type3() {
		name = "고무신";
		price = 7000;
	}
	
	private String name;
	
	int price;
	
	int cnt;
	
	int tot() {
		return price*cnt;
	}
	
	String ppp() {
		return name+","+price+","+cnt+","+tot();
	}
}

public class EnumMemberMain {
	public static void main(String[] args) {
		//System.out.println(Type2);
		
		System.out.println(Type2.WALKING);
		
		Type2.WALKING.name = "워킹화";
		System.out.println(Type2.WALKING+":"+Type2.WALKING.name);
		System.out.println(Type2.RUNNING+":"+Type2.RUNNING.name);
		Type2.WALKING.name = "전투화";
		System.out.println(Type2.WALKING+":"+Type2.WALKING.name);
		System.out.println(Type2.RUNNING+":"+Type2.RUNNING.name);
		
		Type3.WALKING.cnt = 5;
		System.out.println(Type3.WALKING.ppp());
		
		System.out.println("---------------");
		for (Type3 tt : Type3.values()) {
			System.out.println(tt.ppp());
		}
		
	}
}
