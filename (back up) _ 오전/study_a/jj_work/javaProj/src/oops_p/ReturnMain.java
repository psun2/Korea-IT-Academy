package oops_p;

import java.util.Arrays;

class RetCla{
	
	int a = 123;
	
	int meth_1() {
		System.out.println("meth_1() ����");
		
		return 100;
	}
	
	int getA() {
		System.out.println("getA() ����");
		
		return a;
	}
	
	int [] meth_2() {
		System.out.println("meth_2() ����");
		
		return new int[] {10,20};  //��� ���� ����
	}	
	
	RetMember makeRM() {
		
		RetMember ret = new RetMember();
		
		return ret;
	}
	
	RetMember rmInit(String name, String tel,int age) {
		
		RetMember ret = new RetMember();
		ret.init(name, tel, age);
		return ret;
	}
	
}

class RetMember{
	
	String name, tel;
	int age;
	
	void init(String name, String tel,int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	void ppp() {
		String ttt = name +"\t"+tel+"\t"+age;
		System.out.println(ttt);
	}
	
}




public class ReturnMain {

	public static void main(String[] args) {
		RetCla rc = new RetCla();
		int r1 = rc.meth_1();
		System.out.println("r1:"+r1);
		System.out.println("getA():"+rc.getA());
		rc.a = 456;
		System.out.println("getA():"+rc.getA());
		
		int [] r2 = rc.meth_2();  //1
		r2[1] = 2222;
		System.out.println("r2:"+Arrays.toString(r2));
		System.out.println("rc.meth_2():"+Arrays.toString(rc.meth_2())); //2
		
		rc.meth_2()[1]=3333; //3
		System.out.println("rc.meth_2():"+Arrays.toString(rc.meth_2())); //4
		
		RetMember rm = new RetMember();
		rm.init("������", "1111-1111",34);
		
		rm.ppp();
		
		RetMember rm2 = rc.makeRM();
		rm2.init("�����", "222-2222",36);
		rm2.ppp();
		
		RetMember rm3 = rc.rmInit("������", "3333-3333",39);
		
		rm3.ppp();
		
		
		RetMember [] arr = {
				rc.rmInit("����", "123",41),
				rc.rmInit("����", "456",42),
				rc.rmInit("����", "789",38),
				rc.rmInit("����", "901",37)
		};
		
		for (RetMember rr : arr) {
			rr.ppp();
		}
		
		/*
		���並 �����ϼ���

		(Ŀ���̸�, ���̽�/��, �����(���߰�/�������/���)) ���� �־� Ŀ�Ǹ� �������ּ���
  				
  		Ŀ���̸� : 
  		�Ƹ޸�ī�� 2000  �ƽþƳ� 2300  ������ī�� 2700
  		
  		���̽� +300  , �� +0
  		
  		���߰� +200 , �������+1000, ��� +0
  		
		Ŀ�� : Ŀ���̸�, ����

		������ Ŭ������ �Ұ�
		 */
	}

}
