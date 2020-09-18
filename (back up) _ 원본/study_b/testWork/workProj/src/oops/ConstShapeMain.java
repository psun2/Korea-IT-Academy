package oops;


class ConstShape{

	String name;
	double area, border;
	
	ConstShape(int r) {
		name = "¿ø";
		double pi = 3.141592;
		area = pi *r*r;
		border = pi *r*2;
		ppp();
	}
	
	ConstShape(int w, int h) {
		name = "Á÷»ç°¢Çü";
		
		area = w*h;
		border = (w+h)*2;
		ppp();
	}
	
	ConstShape(int w, int h, int a) {
		name = "Á÷°¢»ï°¢Çü";
		
		area = w*h/2;
		border = w+h+a;
		ppp();
	}
	void ppp() {
		System.out.println(name+":"+area+","+border);
	}
}


class ConstCar{
	
	String kind, name, ttt;
	
	
	double res;
	
	ConstCar(String name,int speed, int fuel){
		kind = "½ºÆ÷Ã÷";
		this.name = name;
		
		res = speed*0.6+fuel*0.4;
		ttt = speed+","+fuel+"\t";
		ppp();
	}
	
	ConstCar(String name, int fuel, int person, int safe){
		kind = "½ÂÇÕÂ÷";
		this.name = name;
		
		res = fuel*0.3+person*0.3+safe*0.4;
		ttt = fuel+","+person+","+safe;
		ppp();
	}
	
	ConstCar(String name,int fuel, int gg, String pp){
		kind = "½ºÆ÷Ã÷";
		this.name = name;
		
		res = fuel*0.5+gg*0.5;
		ttt = fuel+","+gg+","+pp;
		ppp();
	}
	
	void ppp() {
		System.out.println(kind+"\t"+name+"\t"+ttt+"\t"+res);
	}
	
	
}

public class ConstShapeMain {

	public static void main(String[] args) {
//		ConstShape [] arr = {
//			new ConstShape(5),
//			new ConstShape(5,6),
//			new ConstShape(5,6,8)
//		};
//		
//		for (ConstShape sh : arr) {
//			sh.ppp();
//		}
		
		new ConstShape(5);
		new ConstShape(5,6);
		new ConstShape(5,6,8);
		
		new ConstCar("Æä¶ó¸®", 91,84);
		new ConstCar("½ºÅ¸·º½º", 48,56,85);
		new ConstCar("ºÀ°í¸£±â´Ï", 81,75,"ÀÌ»ñÁü");

	}

}
