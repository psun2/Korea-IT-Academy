package dynamic_p;


class OverrCar{
	
	String name = "�ڵ���";
	
	String wheel = "������";
	
	void go() {
		System.out.println(name+" "+wheel+" �޷���");
	}
}

class OVerrTank extends OverrCar{
	public OVerrTank() {
		name = "��ũ";
	}
	String wheel = "���ѱ˵�";
	void go() {
		System.out.println(name+" "+wheel+" �޷���");
	}
}

class OVerrAir extends OverrCar{
	public OVerrAir() {
		name = "�����";
	}
	
	void go() {
		System.out.println(name+" "+wheel+" ���ƿ�");
	}
}


class OVerrShape{
	String name ="�������m�����m";
	double area, border;
	
	void calc() {
		name = "Ʋ������";
		area = -1234;
		border = -5678;
	}
	
	void ppp() {
		calc();  //������ �� �ڽ� calc()�� ȣ��
		System.out.println(name+":"+area+","+border);
	}
}

class OverRec extends OVerrShape{
	int w, h;
	String name;  //hiding


	OverRec(int w, int h) { //overriding
		
		this.w = w;
		this.h = h;
	}

	void calc() {
		name = "���簢��";
		area = w*h;
		border = (w+h)*2;
	}
}

////��, �����ﰢ���� ���� �ϼ���





public class OverridingCarMain {

	public static void main(String[] args) {
		OverrCar car = new OverrCar();
		OVerrTank tank = new OVerrTank();
		OVerrAir air = new OVerrAir();
		car.go();
		tank.go();
		air.go();
		
		OVerrShape sh = new OVerrShape();
		sh.ppp();
		
		OverRec rec = new OverRec(5, 6);
		rec.ppp();

	}
	
	/*
	 * �θ� Ŭ���� - �Ϲ��л�(������)
	 * 
	 * �ڽ� Ŭ���� - ��ü�� (��������), ��ȯ�л�(������ �ܱ���)

	 * ����/ ��� ���
	 * 
	 * 
	 * */
	
	
	

}
