package dynamic_p;
class InCar{
	
	String name;
	double jum;
	int price;
	
	void ppp() {
		System.out.println(name+"\t"+jum+"\t"+price);
	}
}

class InSport extends InCar{
	
	InSport(int speed, int safe) {
		name = "스포츠카";
		jum = speed*0.8+safe*0.2;
		price = 1234;
	}
}

class InTruck extends InCar{
	
	InTruck(int loadage,int speed, int safe) {
		name = "트럭";
		jum = loadage*0.4+speed*0.3+safe*0.3;
		price = 567;
	}
}

class InShape{
	String name;
	double area, border;
	
	void ppp() {
		System.out.println(name+":"+area+","+border);
	}
}

class InCircle extends InShape{
	InCircle(int r) {
		double pi = 3.141592;
		name = "원";
		area = (double)r*r*pi;
		border = (double)r*pi*2;
	}
}

class InRec extends InShape{
	InRec(int w, int h) {
		name = "직사각형";
		area = (double)w*h;
		border = (w+h)*2;
	}
}

class InTri extends InShape{
	InTri(int w, int h) {
		name = "직각삼각형";
		area = (double)w*h/2;
		border = Math.sqrt(w*w+h*h)+w+h;
	}
}


public class InheritanceCarMain {

	public static void main(String[] args) {
		InSport sp = new InSport(90,60);
		InTruck tr = new InTruck(50,40,50);
		sp.ppp();
		tr.ppp();
		
		
		System.out.println( Math.sqrt(9) );
		
		InCircle cc = new InCircle(5);
		InRec rr = new InRec(5, 6);
		InTri tt = new InTri(1,1);
		
		cc.ppp();
		rr.ppp();
		tt.ppp();
		
	}

}
