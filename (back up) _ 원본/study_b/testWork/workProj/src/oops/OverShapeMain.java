package oops;

class OverShape{
	String name;
	double area, border;
	
	void init(int r) {
		name = "��";
		double pi = 3.14;
		area = r*r*pi;
		border = r*pi*2;
		ppp();
	}
	
	void init(int w, int h) {
		name = "���簢��";
		area = w*h;
		border = (w+h)*2;
		ppp();
	}
	
	void init(int hh, double bb) {
		name = "�����ﰢ��";
		area = hh*bb/2;
		border = Math.sqrt(hh*hh+bb*bb)+hh+bb;
		ppp();
	}
	
	void ppp() {
		System.out.println(name+":"+area+","+border);
	}
}
public class OverShapeMain {

	public static void main(String[] args) {
		OverShape os = new OverShape();
		os.init(5);
		//os.ppp();
		os.init(5,6);
		//os.ppp();
		os.init(5,6.0);
		//os.ppp();

	}

}
