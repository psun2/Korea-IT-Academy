package dynamic_p;

class InHeriShape{
	String name;
	
	double border, area;
	
	void calc()
	{
		System.out.println("부모의 계산을 받아랐");
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
		name = "직사각형";
		super.name = "안알랴줌";
		//area = w*h;
		//border = (w+h)*2;
		this.w = w;
		this.h = h;
	}
	
	void calc() {
		System.out.println("자식의 오버라이딩 계산이다");
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
