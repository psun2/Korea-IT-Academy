package oops_p;

class Dragon{
	String name;
	
	int myMoney = 0;
	
	static int mom = 100;
	
	void showMeTheMoney(int money) {
		if(name.equals("아빠")) {
			System.out.println("죽을텨?");
			return;
		}
		myMoney += money;
		mom -= money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t 잔액:"+mom);
	}
	
	void missionComplete(int money) {
		if(!name.equals("아빠")) {
			System.out.println(name+" 건강하게만 자라다오");
			return;
		}
		myMoney += money;
		mom += money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t 잔액:"+mom);
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
		
		son.name = "아들";
		dau.name = "딸";
		scv.name = "아빠";
		
		son.showMeTheMoney(13);
		dau.showMeTheMoney(10);
		son.showMeTheMoney(8);
		dau.showMeTheMoney(14);
		scv.showMeTheMoney(10);   //죽을텨?
		son.showMeTheMoney(16);
		dau.showMeTheMoney(17);
		scv.missionComplete(10);
		son.missionComplete(10);  //아들 건강하게만 자라다오
		dau.showMeTheMoney(5);
		dau.missionComplete(10);
		
		/*
		 * 아빠는 용돈을 가져갈수 없고 벌어오기만 가능
		 * 자식은 용돈을 가져갈수 있고 벌어오기 불가능
		 * */

	}

}
