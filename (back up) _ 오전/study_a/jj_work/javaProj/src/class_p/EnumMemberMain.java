package class_p;

enum Type2{
	//���ȭ==> ������ �迭�� �����ϴ� ������ -> ��� (�迭�� ����)
	//{new Type2(),new Type2(),new Type2(),new Type2() } �⺻������
	//�迭�� �̸� ����� ���� ��� (�����)
	WALKING, RUNNING, TRACKING, HIKING;
	
	String name;
	
	private int price;
	
	int cnt;
}

enum Type3{
	
	//���ȭ==> ������ �迭�� �����ϴ� ������ -> ��� (�迭�� ����)
	//����� ���� �������ϰ�� ������ �������� ���·� �����Ͽ��� �Ѵ�.
	//{new Type3(name, price), new Type3(name, price),...}
	//�迭�� �̸� ����� ���� ��� (�����)
	//    0					1			2							3                   1
	WALKING("��ŷȭ",3000), KOR_SH(), TRACKING("Ʈ��ŷȭ",4800), HIKING("����ŷȭ",3400);
	
	//����� ���� ������
	private Type3(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//�⺻������
	private Type3() {
		name = "����";
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
		
		Type2.WALKING.name = "��ŷȭ";
		System.out.println(Type2.WALKING+":"+Type2.WALKING.name);
		System.out.println(Type2.RUNNING+":"+Type2.RUNNING.name);
		Type2.WALKING.name = "����ȭ";
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
