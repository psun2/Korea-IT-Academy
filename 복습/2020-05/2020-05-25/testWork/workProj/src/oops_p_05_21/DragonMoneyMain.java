package oops_p_05_21;

class DragonChild {

	static int mom = 100;

	String name;
	int myMoney = 0;

	void showMeTheMoney(int money) {
		if (name.equals("아빠")) {
			System.out.println("뒤진다");
			System.out.println("\t잔액: " + mom);
			return;
		}
		mom -= money;
		myMoney += money;
		System.out.println(name + ": " + money + "(" + myMoney + ")");
		System.out.println("\t잔액: " + mom);
	}

	void missionComplete(int money) {
		if (!name.equals("아빠")) {
			myMoney += money;
			System.out.println("건강하게만 자라다오.");
			System.out.println(name + ": " + money + "(" + myMoney + ")");
			System.out.println("\t잔액: " + mom);
			return;
		}
		mom += money;
		System.out.println("scv good");
		System.out.println("\t잔액: " + mom);
	}
}

public class DragonMoneyMain {

	public static void main(String[] args) {

		// 아버지가 용돈에 손대면 용돈을 줄지 않고 엄마의 특별한 메세지가 송출됩니다.
		// 아버지가 돈을 벌어왔을때 용돈에 증가 됩니다.
		// 아이들이 돈을 벌어왓을때 용돈에 증가되지 않고 본인의 돈이 증가하면서 어머니의 특별한 메세지가 송출 됩니다

		// 문제의 핵심: 용돈은 공유된다, return의 효과적인 방법

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
		son.showMeTheMoney(14);
		daughter.showMeTheMoney(9);
		son.missionComplete(1);
		daughter.missionComplete(11);

	}

}
