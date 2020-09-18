package dynamic_p;

class DyShape{
	String name;
	double area, border;

	DyShape(String name) {
		
		this.name = name;
	}

	void calc() {}
	
	void ppp() {
		calc();
		System.out.println(name+":"+area+","+border);
	}	
}

class DyRec extends DyShape{
	int w, h;


	DyRec(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
	}
	void calc() {
		area = w*h;
		border= (w+h)*2;
	}
	
}

class DyCircle extends DyShape{
	int r;

	DyCircle(int r) {
		super("원");
		this.r = r;
	}
	void calc() {
		double pi = 3.14;
		area = pi*r*r;
		border= pi*r*2;
	}
	
}


public class DyShapeMain {

	public static void main(String[] args) {
		DyShape [] arr = {
				new DyRec(5, 6),
				new DyCircle(5),
				new DyRec(5, 6),
				new DyCircle(8)
		};
		
		for (DyShape sh : arr) {
			sh.ppp();
		}

	}

}
