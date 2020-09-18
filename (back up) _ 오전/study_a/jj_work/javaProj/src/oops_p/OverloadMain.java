package oops_p;

import java.util.Arrays;

class OverCla{
	
	void meth(int a, int b) {
		System.out.println("meth() �⺻:"+a+","+b);
	}
	
	void meth(int a, int b,  int c) {
		System.out.println("������ �ٸ� ���:"+a+","+b+","+c);
	}
	
	void meth(int a, String b) {
		System.out.println("�ڷ����� �ٸ� ���:"+a+","+b);
	}
	void meth(String b, int a) {
		System.out.println("������ �ٸ� ���:"+a+","+b);
	}
	
	
//	void meth(int c, int b) { �Ű������� �̸��� �ٸ� �͸����δ�  overloading �Ұ�
//		System.out.println("meth() �⺻:"+a+","+b);
//	}
	
//	void meth(int a, int b) {
//		System.out.println("meth() �⺻:"+a+","+b);
//	}
	
//	int meth(int a, int b) {  �������� overloading �� �������
//		System.out.println("meth() �⺻:"+a+","+b);
//		return 10;
//	}
	
	
}

class Bakery{
	
	void baking(int wheat) {
		int cnt = wheat/100;
		System.out.println("�ǻ��� ������"+cnt);
	}
	
	void baking(int wheat, int cream) {
		int cnt = wheat/80;
		System.out.println("ũ������ ������"+cnt);
	}
	
	void baking(int wheat, String to) {
		int cnt = wheat/50;
		System.out.println(to+"���� ������"+cnt);
	}

	void baking(int wheat, String ... cream) {  //���� �Ű������� �ٸ��ɷ� ����
		System.out.println("«�ͻ��� ������"+Arrays.toString(cream));
	}
	
}

class OverNUm{
	
	void calc(int a, int b, char code ) {
		
	}
	
	void calc(int a, int b, String code ) {
		
	}
	
	void calc(int a, char code, int b ) {
		
	}
	void calc(int a, String code , int b) {
		
	}
	
	void calc( char code, int a, int b ) {
		
	}
	
	void calc( String code , int a, int b) {
		
	}
	
}


public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverCla oc = new OverCla();
		
		oc.meth(10, 20);
		oc.meth(10, 20, 30);
		oc.meth(10, "��/��-��\\��/");
		oc.meth("��/��-��\\��/", 10);
		System.out.println("-----------------");
		Bakery pb = new Bakery();
		pb.baking(350);
		pb.baking(350);
		pb.baking(350,"���ڿϽ�");
		pb.baking(350,60);
		pb.baking(350,"ȣ��","�޹�","����","��");
		
	}

}
