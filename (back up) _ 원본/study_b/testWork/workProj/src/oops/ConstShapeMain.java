package oops;


class ConstShape{

	String name;
	double area, border;
	
	ConstShape(int r) {
		name = "��";
		double pi = 3.141592;
		area = pi *r*r;
		border = pi *r*2;
		ppp();
	}
	
	ConstShape(int w, int h) {
		name = "���簢��";
		
		area = w*h;
		border = (w+h)*2;
		ppp();
	}
	
	ConstShape(int w, int h, int a) {
		name = "�����ﰢ��";
		
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
		kind = "������";
		this.name = name;
		
		res = speed*0.6+fuel*0.4;
		ttt = speed+","+fuel+"\t";
		ppp();
	}
	
	ConstCar(String name, int fuel, int person, int safe){
		kind = "������";
		this.name = name;
		
		res = fuel*0.3+person*0.3+safe*0.4;
		ttt = fuel+","+person+","+safe;
		ppp();
	}
	
	ConstCar(String name,int fuel, int gg, String pp){
		kind = "������";
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
		
		new ConstCar("���", 91,84);
		new ConstCar("��Ÿ����", 48,56,85);
		new ConstCar("���������", 81,75,"�̻���");

	}

}
