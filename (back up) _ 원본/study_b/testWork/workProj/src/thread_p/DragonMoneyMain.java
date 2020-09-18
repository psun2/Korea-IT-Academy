package thread_p;

class Mom{
	int total = 100;
	
	synchronized boolean showMeTheMoney(int money, String name) {
		
		boolean res = false;
		if(res = !name.equals("Å¬·¹¸àÅ¸ÀÎ") &&  total>=money) {
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(res= total<30 && name.equals("Å¬·¹¸àÅ¸ÀÎ")) {
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		
		
		
		
		return res;
	}
}

class SyChild extends Thread{
	int myMoney =0;
	Mom mom;
	public SyChild(String name, Mom mom) {
		super(name);
		this.mom = mom;
	}
	
	@Override
	public void run() {
		while(mom.total>0) {
			int money = (int)(Math.random()*50)+1;
			
			if(mom.showMeTheMoney(money, getName())) {
				myMoney += money;
				mom.total -=money;
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\tÀÜ¾×:"+mom.total);
			}
		}
	}
}


class SySCV extends Thread{
	int myMoney =0;
	Mom mom;
	public SySCV( Mom mom) {
		super("Å¬·¹¸àÅ¸ÀÎ");
		this.mom = mom;
	}
	
	@Override
	public void run() {
		while(mom.total>0) {
			
			
			int money = (int)(Math.random()*50)+50;
			
			if(mom.showMeTheMoney(money, getName())) {
				myMoney+= money;
				mom.total+=money;
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\tÀÜ¾×:"+mom.total);
			}
		}
	}
}




public class DragonMoneyMain {

	public static void main(String[] args) {
		Mom mom = new Mom();
		SyChild son = new SyChild("¾Æµé", mom);
		SyChild daughter = new SyChild("µþ", mom);
		SySCV scv = new SySCV(mom);
		
		scv.start();
		son.start();
		daughter.start();
	}

}
