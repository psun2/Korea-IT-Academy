package dynamic_p;

class InHeriShape{
	String name;
	
	double border, area;
	
	void calc()
	{
		System.out.println("�θ��� ����� �޾ƶ�");
	}
	
	void ppp() {
		calc();
		System.out.println(name+":"+area+","+border);
	}
}

class InHeriRec extends InHeriShape{
	
	int w, h;
	String name;
	InHeriRec(int w, int h) {
		name = "���簢��";
		super.name = "�Ⱦ˷���";
		//area = w*h;
		//border = (w+h)*2;
		this.w = w;
		this.h = h;
	}
	
	void calc() {
		System.out.println("�ڽ��� �������̵� ����̴�");
		area = w*h;
		border = (w+h)*2;
	}
}

public class InHeriShapeMain {

	public static void main(String[] args) {

		InHeriRec rec = new InHeriRec(5, 6);
		InHeriRec rec1 = new InHeriRec(7,8);
		rec.ppp();
		rec1.ppp();

	}

}
