package oops_p;

class StringPri{
	String name;
	int pri;
	
	void init(String name, int pri) {
		this.name = name;
		this.pri = pri;
	}
}

class ReturnCoffee{
	
	String name, cafe;
	int price;
	
	StringPri spMake(String name, int pri) {
		StringPri ret = new StringPri();
		ret.init(name, pri);
		return ret;
	}
	
	int strToInt(String nn) {
		StringPri [] src = {
				spMake("�Ƹ޸�ī��",2000),
				spMake("�ƽþƳ�",2300),
				spMake("������ī��",2700),
				spMake("���̽�",300),
				spMake("��",0),
				spMake("���߰�",200),
				spMake("�������",1000)
				};
		
		for (StringPri ss : src) {
			if(ss.name == nn)
				return ss.pri;
		}
		
		return 0;
	}
	
	void init(String cafe,String name, String ih, String spec) {
		this.cafe = cafe;
		this.name = name;
		price = strToInt(name)+strToInt(ih)+strToInt(spec);
		//System.out.println(price);
		
	}
	
	void ppp() {
		System.out.println(cafe+"\t"+name+"\t"+price);
	}	
}

class ReturnCafe{
	String name;
	
	ReturnCoffee [] arr = new ReturnCoffee[0];
	
	void addCC(ReturnCoffee cc) {
		ReturnCoffee [] buf = new ReturnCoffee[arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		
		buf[arr.length] = cc;
		arr = buf;
	}
	
	ReturnCoffee makeRC(String name, String ih, String spec) {
		ReturnCoffee ret = new ReturnCoffee();
		
		ret.init(this.name,name, ih, spec);
		addCC(ret);
		return ret;
	}
	
	void ppp() {
		System.out.println(name+">>>");
		for (ReturnCoffee r : arr) {
			r.ppp();
		}
	}
}


public class ReturnCafeMain {

	public static void main(String[] args) {
		
		ReturnCafe rcf = new ReturnCafe();
		rcf.name = "�Ҹ���";
		ReturnCafe rcf1 = new ReturnCafe();
		rcf1.name = "���亣��";
		
		rcf.makeRC("������ī��", "��", "���߰�");
		rcf1.makeRC("������ī��", "���̽�", "���");
		rcf.makeRC("�ƽþƳ�", "��", "�������");
		rcf.makeRC("������ī��", "���̽�", "���߰�");
		rcf1.makeRC("�Ƹ޸�ī��", "��", "�������");
		rcf.makeRC("�ƽþƳ�", "��", "���");
		rcf1.makeRC("������ī��", "���̽�", "�������");
		rcf.makeRC("�Ƹ޸�ī��", "��", "���߰�");
		rcf1.makeRC("�Ƹ޸�ī��", "���̽�", "���");
		
		rcf.ppp();
		rcf1.ppp();
		
//		for (ReturnCoffee r : rcf.arr) {
//			r.ppp();
//		}
		
//		ReturnCoffee cf = new ReturnCoffee();
//		cf.init("������ī��","��","���߰�");
//		cf.ppp();
		
//		ReturnCoffee [] arr = {
//				rcf.makeRC("������ī��", "��", "���߰�"),
//				rcf.makeRC("������ī��", "���̽�", "���"),
//				rcf.makeRC("�ƽþƳ�", "��", "�������"),
//				rcf.makeRC("������ī��", "���̽�", "���߰�"),
//				rcf.makeRC("�Ƹ޸�ī��", "��", "�������"),
//				rcf.makeRC("�ƽþƳ�", "��", "���"),
//				rcf.makeRC("������ī��", "���̽�", "�������"),
//				rcf.makeRC("�Ƹ޸�ī��", "��", "���߰�"),
//				rcf.makeRC("�Ƹ޸�ī��", "���̽�", "���")
//		};
//		
//		for (ReturnCoffee r : arr) {
//			r.ppp();
//		}
	}

}
