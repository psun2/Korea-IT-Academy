package oops_p;

class Dragon{
	String name;
	
	int myMoney = 0;
	
	static int mom = 100;
	
	void showMeTheMoney(int money) {
		if(name.equals("�ƺ�")) {
			System.out.println("������?");
			return;
		}
		myMoney += money;
		mom -= money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t �ܾ�:"+mom);
	}
	
	void missionComplete(int money) {
		if(!name.equals("�ƺ�")) {
			System.out.println(name+" �ǰ��ϰԸ� �ڶ�ٿ�");
			return;
		}
		myMoney += money;
		mom += money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t �ܾ�:"+mom);
	}
	
}

public class DragonMoneyMain {

	int a = 10;
	static int b = 20;
	
	void meth_1() {
		System.out.println("meth_1()");
	}
	static void meth_2() {
		System.out.println("meth_2()");
	}
	
	public static void main(String[] args) {
		
		//System.out.println(a);
		System.out.println(b);
		//meth_1();
		meth_2();
		
		Dragon son = new Dragon();
		Dragon dau = new Dragon();
		Dragon scv = new Dragon();
		
		son.name = "�Ƶ�";
		dau.name = "��";
		scv.name = "�ƺ�";
		
		son.showMeTheMoney(13);
		dau.showMeTheMoney(10);
		son.showMeTheMoney(8);
		dau.showMeTheMoney(14);
		scv.showMeTheMoney(10);   //������?
		son.showMeTheMoney(16);
		dau.showMeTheMoney(17);
		scv.missionComplete(10);
		son.missionComplete(10);  //�Ƶ� �ǰ��ϰԸ� �ڶ�ٿ�
		dau.showMeTheMoney(5);
		dau.missionComplete(10);
		
		/*
		 * �ƺ��� �뵷�� �������� ���� ������⸸ ����
		 * �ڽ��� �뵷�� �������� �ְ� ������� �Ұ���
		 * */

	}

}
