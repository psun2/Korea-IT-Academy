package oops_p;

import java.util.Arrays;

/*
���並 �����ϼ���

(Ŀ���̸�, �ɼ�...) �� �־� Ŀ�Ǹ� �������ּ���

Ŀ���̸� : 
�Ƹ޸�ī�� 2000  �ƽþƳ� 2300  ������ī�� 2700

���̽� +300  , ����ũ�� + 400

���߰� +200 , �������+1000, 

1. Ŀ�� : Ŀ���̸�, ����

2. ������  Ŀ���������� �Ұ�

3. Ŀ�������� �����հ�, �Ǽ� ����� ��
* 
*/



class ParamMenu{
	String name;
	int price , cnt, totPrice;
	
	void init(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	int use(String name) {
		if(this.name == name) {
			cnt++;
			totPrice+=price;
			return price;
		}
		return 0;
	}
}

class ParamCoffeeShop{
	
	ParamCoffee [] coffee = new ParamCoffee[0];
	
	ParamCoffee [] cateTitle;
	
	ParamCoffee [][] cate;
	
	ParamMenu [] menu;
	
	void init() {
		cateTitle = new ParamCoffee[3]; 
		for (int i = 0; i < cateTitle.length; i++) {
			cateTitle[i] = new ParamCoffee();
		}
		cateTitle[0].name="�Ƹ޸�ī��";
		cateTitle[1].name="�ƽþƳ�";
		cateTitle[2].name="������ī��";
		cate = new ParamCoffee[cateTitle.length][0];
		
		menu = new ParamMenu[7];
		
		for (int i = 0; i < menu.length; i++) {
			menu[i] = new ParamMenu();
		}
		
		menu[0].init("�Ƹ޸�ī��",2000);
		menu[1].init("�ƽþƳ�", 2300);
		menu[2].init("������ī��",2700);
		menu[3].init("���̽�",300);
		menu[4].init("����ũ��",400);
		menu[5].init("���߰�",200);
		menu[6].init("�������",1000);
	}
	
	void order(String name, String ...option) {
		ParamCoffee nC = new ParamCoffee();
		nC.init(name, menu, option);
		
		coffee = addCoffee(nC, coffee); 
		
		int no= noSet(name);

		cate[no] = addCoffee(nC, cate[no]);
		cateTitle[no].price += nC.price;
		cateTitle[no].cnt++; 
		
	}
	
	int noSet(String name) {
		
		int res = 0;
		for (int i = 0; i < cateTitle.length; i++) {
			
			if(name.equals(cateTitle[i].name))
			{
				res = i;
				break;
			}
		}
		
		return res;
	}
	
	
	ParamCoffee [] addCoffee(ParamCoffee nC, ParamCoffee [] arr) {
		ParamCoffee [] buf = new ParamCoffee[arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		
		buf[arr.length] = nC;
		return buf;
	}
	
	void ppp(String kind) {
		
		System.out.println("["+kind+"]");
		
		if(kind.equals("��ü")) {
			for (ParamCoffee co : coffee) {
				co.ppp();
			}
			return;
		}
		
		for (int i = 0; i < cate.length; i++) {
			
			System.out.println(cateTitle[i].name+">>>>");
			for (ParamCoffee co : cate[i]) {
				co.ppp();
			}
			cateTitle[i].tong();	
		}
		
	}
}

class ParamCoffee{
	String name;
	int price, cnt, totPrice;
	String ttt;
	void init(String name,ParamMenu [] menu, String ...option) {
		this.name = name;
		ttt = Arrays.toString(option);
		
		price+=menuChk(menu, name);
		for (String op : option) {
			
			price+=menuChk(menu, op);
		}

	}
	
	int menuChk(ParamMenu [] menu, String nn) {
		int ret = 0;
		
		for (ParamMenu mm : menu) {
			
			ret+=mm.use(nn);
		}
		
		return ret;
	}
	
	
	void ppp() {
		System.out.println(name+"\t"+ttt+"\t"+price);
	}
	
	void tong() {
		System.out.println(name+"\t"+cnt+"\t"+price);
	}
}



public class ParamCoffeeMain {

	public static void main(String[] args) {
		ParamCoffeeShop shop = new ParamCoffeeShop();
		shop.init();

		shop.order("������ī��", "�������", "���߰�");
		shop.order("������ī��", "���̽�");
		shop.order("�ƽþƳ�",  "�������");
		shop.order("������ī��", "���̽�", "���߰�");
		shop.order("�Ƹ޸�ī��", "���̽�", "�������");
		shop.order("�ƽþƳ�");
		shop.order("������ī��", "���̽�", "�������", "���߰�");
		shop.order("�Ƹ޸�ī��", "�������", "���߰�");
		shop.order("�Ƹ޸�ī��", "���̽�", "�������", "���߰�","����ũ��");
		
		shop.ppp("��ü");

	}

}
