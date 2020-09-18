package oops;

class DragonChild{
	static int mom = 100;
	
	String name;
	int myMoney=0;
	
	void showMeTheMoney(int money) {
		if(name.equals("아빠")) {
			System.out.println("죽고잡냐?");
			 return;
		}
		myMoney+=money;
		mom-=money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t잔액:"+mom);
	}
	
	void missionComplete(int money) {
		if(!name.equals("아빠")) {
			System.out.println("건강하게만 자라다오");
			 return;
		}
		myMoney+=money;
		mom+=money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t잔액:"+mom);
	}
}

public class DragonMoneyMain {

	public static void main(String[] args) {
		DragonChild son = new DragonChild();
		DragonChild daughter = new DragonChild();
		DragonChild scv = new DragonChild();
		
		son.name = "아들";
		daughter.name = "딸";
		scv.name = "아빠";
		
		son.showMeTheMoney(15);
		daughter.showMeTheMoney(8);
		son.showMeTheMoney(12);
		scv.showMeTheMoney(12);
		daughter.showMeTheMoney(13);
		scv.missionComplete(100);
		daughter.showMeTheMoney(9);
		son.missionComplete(100);
		son.showMeTheMoney(14);
		
	}

}
