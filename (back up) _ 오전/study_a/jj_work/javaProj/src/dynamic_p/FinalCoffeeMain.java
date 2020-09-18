package dynamic_p;

abstract class FinalCoffee{
	
	private static double [] tot = {0,0};
	
	final String name;
	final double [] rate;
	FinalCoffee(String name, double ... rate) {
		
		this.name = name;
		this.rate = rate;
	}
	
	final void order(int cnt) {
		for (int i = 0; i < rate.length; i++) {
			tot[i]+= rate[i]*cnt*200;
		}
		System.out.println(name+":"+cnt+"("+ppp()+")");
	}
	
	final static String ppp() {
		return tot[0]+","+tot[1];
	}
}

class FinalAmericano extends FinalCoffee{

	FinalAmericano() {
		super("�Ƹ޸�ī��", 0.2,0.8);
	}
	
}

class FinalAsiano extends FinalCoffee{

	FinalAsiano() {
		super("�ƽþƳ�", 0.3,0.7);
	}
	
}

class FinalAfricano extends FinalCoffee{

	FinalAfricano() {
		super("������ī��", 0.1,0.9);
	}
	
}




public class FinalCoffeeMain {

	public static void main(String[] args) {
		FinalCoffee ame = new FinalAmericano();
		FinalCoffee asia = new FinalAsiano();
		FinalCoffee afr = new FinalAfricano();

		ame.order(5);
		asia.order(4);
//		afr.order(6);
//		ame.order(5);
//		asia.order(9);
//		afr.order(1);
		
		//FinalCoffee.tot[0] = 1234;
		System.out.println(FinalCoffee.ppp());
		
	}

}
