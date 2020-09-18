package dynamic_p;

class ConstShape{
	String name;
	
	double border, area;
	

	ConstShape(String name) {
		this.name = name;
	}

	void calc()
	{
		
		System.out.println("부모의 계산을 받아랐");
	}
	
	void ppp() {
		calc();
		System.out.println(name+":"+area+","+border);
	}
}

class ConstRec extends ConstShape
{
	
	int w, h;
	
	ConstRec(int w, int h) {
	
		super("직사각형");
		
		this.w = w;
		this.h = h;
	}
	
	void calc() {
		System.out.println("자식의 오버라이딩 계산이다");
		area = w*h;
		border = (w+h)*2;
	}
}

class ConstCircle extends ConstShape
{
	
	int r;
	
	ConstCircle(int r) {
	
		super("원");
		
		this.r = r;
		
	}
	
	void calc() {
		double pi = 3.141592;
		area = pi*r*r;
		border = pi*r*2;
	}
}

public class ConstShapeMain {

	public static void main(String[] args) {

		ConstRec rec = new ConstRec(5, 6);
		ConstRec rec1 = new ConstRec(7,8);
		ConstCircle cir = new ConstCircle(5);
		rec.ppp();
		rec1.ppp();
		cir.ppp();

	}
	
	
	//학생 성적을 상속, 오버라이딩으로 구현하세요
	//일반 -   국(40), 영(30), 수(30)
	//예체능 -  국(20), 영(10), 수(10), 예체능(60)
	
	//구분, 이름, 과목, 총점, 점수, 등수(구분별)

}
