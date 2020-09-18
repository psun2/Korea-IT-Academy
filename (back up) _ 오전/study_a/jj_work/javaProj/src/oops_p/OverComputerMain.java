package oops_p;
////��ǻ�͸� �����ϼ���
// �º� - ��ü(�̸�,����)
// ��Ʈ�� - ��ü(�̸�,����), ���콺(�̸�,����)
// ����ũž - ��ü(�̸�,����), ���콺(�̸�,����), Ű����(�̸�,����)
///  ��ǻ�� - ��ǰ��, ���� , ��ǰ � ���� ������ ���� ��


//------------------------------------------------------------------------------------------------------ 
/////// ������ �����ϼ���
/// ���콺 - ����/����, ���̹�/�Ϲ�
/// Ű���� - ����/���ڽ�, ����/����, led/������
//// Ŭ������ �Է¹ް�, Ŭ������ ����� ��
///  ��ǻ�� - ��ǰ��, ���� , ���� � ���� ������ ���� ��

class OverBonchae{
	String name;
	int price;
	
	OverBonchae(){
		
	}
	
	OverBonchae(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	String ppp() {
		return "��ü: ["+name+","+price+"]";
	}
}
class OverKeyboard{
	String type, wire, str;
	//����/���ڽ�, ����/����, led/������
	int price;
	
	String ppp() {
		return "Ű����: ["+type+","+wire+","+str+","+price+"]";
	}
	
}
class OverMouse{
	String wire, use;
	//����/����, ���̹�/�Ϲ�
	int price;
	String ppp() {
		return "���콺: ["+wire+","+use+","+price+"]";
	}
}

class OverComputer{
	
	String name;
	OverBonchae bc;
	OverKeyboard kb;
	OverMouse ms;
	int price;
	
	void init(OverBonchae bc) {
		name = "�º�";
		this.bc = bc;
		price = bc.price;
	}
	void init(OverBonchae bc, OverMouse ms) {
		name = "��Ʈ��";
		this.bc = bc;
		this.ms = ms;
		price = bc.price+ms.price;
	}
	void init(OverBonchae bc, OverKeyboard kb, OverMouse ms) {
		name = "����ũž";
		this.bc = bc;
		this.kb = kb;
		this.ms = ms;
		price = bc.price+kb.price+ms.price;
	}
	
	void ppp() {
		String ttt = name+"\t"+bc.ppp();
		if(kb!=null)
			ttt+="\t"+kb.ppp();
		if(ms!=null)
			ttt+="\t"+ms.ppp();
		
		System.out.println(ttt+"\t"+price);
		
	}
	
	
}

class OverYongsan{
	OverBonchae makeBC(String name,int price) {
		OverBonchae res = new OverBonchae();
		res.name = name;
		res.price = price;
		return res;
	}
	OverKeyboard makeKB(String type,String wire,String str,int price) {
		OverKeyboard res = new OverKeyboard();
		res.type = type;
		res.wire = wire;
		res.str = str;
		res.price = price;
		return res;
	}
	OverMouse makeMS(String wire,String use,int price) {
		OverMouse res = new OverMouse();
		res.wire  = wire;
		res.use = use;
		res.price = price;
		return res;
	}
	OverBonchae makeBC() {
		OverBonchae res = new OverBonchae();
		
		return res;
	}
	
	OverComputer mkCom(OverBonchae bc) {
		OverComputer res = new OverComputer();
		res.init(bc);
		return res;
	}
	OverComputer mkCom(OverBonchae bc, OverMouse ms) {
		OverComputer res = new OverComputer();
		res.init(bc, ms);
		return res;
	}
	OverComputer mkCom(OverBonchae bc, OverKeyboard kb, OverMouse ms) {
		OverComputer res = new OverComputer();
		res.init(bc, kb, ms);
		return res;
	}
	
	
}

public class OverComputerMain {

	public static void main(String[] args) {
		OverYongsan oy = new OverYongsan();
		
		OverBonchae [] bc = {
				oy.makeBC("����", 500000),
				oy.makeBC("�����", 300000),
				oy.makeBC("����", 200000),
				new OverBonchae("�����е�", 1600000)
		};
		OverKeyboard [] kb = {
				oy.makeKB("����", "����", "led", 120000),
				oy.makeKB("���ڽ�", "����", "������",8000)
		};
		OverMouse [] ms = {
				oy.makeMS("����", "�Ϲ�",20000),
				oy.makeMS("����", "���̹�",56000)
		};
		
		
		OverComputer [] com = {
			oy.mkCom(bc[0]),
			oy.mkCom(bc[0],ms[1]),
			oy.mkCom(bc[1],kb[1],ms[0]),
			oy.mkCom(bc[0],kb[0],ms[1]),
			oy.mkCom(bc[3]),
		};
		
		for (OverComputer overComputer : com) {
			overComputer.ppp();
		}
	}

}
