package thread_p;

class Mom{
	int tot = 100;
	
	synchronized boolean showMeTheMoney(int money) {
		boolean res = false;
		
		if(res = tot>=money) {
			try {
				Thread.sleep(1000);
				tot-=money;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return res;
	}
}

class Child extends Thread{

	Mom mm;
	int myMoney = 0;
	public Child(String name, Mom mm) {
		super(name);
		this.mm = mm;
	}
	
	@Override
	public void run() {

		while(mm.tot>0) {
			int money= (int)(Math.random()*50+1);
			
			if(mm.showMeTheMoney(money)) {
				myMoney+=money;
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\tÀÜ¾×:"+mm.tot);
			}
			try {
				
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class Father extends Thread{

	Mom mm;
	int myMoney = 0;
	public Father( Mom mm) {
		super("¾Æºü");
		this.mm = mm;
	}
	
	@Override
	public void run() {

		while(mm.tot>0) {
			
			if(mm.tot<50) {
				int money= (int)(Math.random()*50+50);
				
				if(mm.showMeTheMoney(-money)) {
					myMoney+=money;
					System.out.println(getName()+":"+money+"("+myMoney+")");
					System.out.println("\tÀÜ¾×:"+mm.tot);
				}
			}
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}



public class SynchronizedMain {

	public static void main(String[] args) {
		Mom mm = new Mom();
		
		Child son = new Child("¾Æµé", mm);
		Child daughter = new Child("µþ", mm);
		Father scv = new Father(mm);
		
		son.start();
		daughter.start();
		scv.start();

	}

}
