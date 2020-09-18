package coll_p;

import java.util.Arrays;

class GenCla<TAA1,  T3>{
	TAA1 a;
	TAA1 b;
	T3 [] arr;
	public GenCla(TAA1 a, TAA1 b, T3 ... arr) {
		super();
		this.a = a;
		this.b = b;
		this.arr = arr;
	}
	@Override
	public String toString() {
		return "GenCla [a=" + a + ", b=" + b + ", arr=" + Arrays.toString(arr) + "]";
	}

}

public class GenericsClassMain {

	public static void main(String[] args) {
		
		//generics �� ������� ������ Object
		GenCla gc1 = new GenCla(12,34,55,66,77,88);
		gc1.a = "���λ�";
		System.out.println(gc1);
		//	String a1 = gc1.a;  gc1.a : Object �̱⶧���� ����ȯ �ʿ�
		
		
		
	//	GenCla<int, double, String> gc2;  Ŭ���� ���Ǹ����� Ÿ������
		GenCla<Integer,  String> gc2;
		// ������ generics �� ������� ������ Object �� ����
		gc2 = new GenCla(123.456,  11,22);
		
	//	gc2.a = "������";  ������� Ÿ���� ���缭 �����ؾ��� 
		gc2.a = 300;  //����ȯ ���� ����
		System.out.println(gc2);  //�������
		
		// ������ generics �� ����ϸ� Ÿ�Կ� �°� ����
		//gc2 = new GenCla<Integer, Double, String>(123.456, 123.456, 11,22);
		gc2 = new GenCla<Integer,  String>
		                 (100,    200,   "�Ƚ���","�̽���");
		System.out.println(gc2);  //�������

		
		
		int a2 = gc2.a;   //generics �� ��õǾ� ����ȯ ���� �ʾƵ� ��
		
		
		
		
		GenCla<Boolean,  Integer> gc3;
		gc3 =  new GenCla<Boolean,  Integer>
         (true, false,  111,222,333);
		System.out.println(gc3);
		
	}

}

