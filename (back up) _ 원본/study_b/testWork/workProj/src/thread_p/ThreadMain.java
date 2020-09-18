package thread_p;

class FirstTh extends Thread{
	
	public FirstTh(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.print(getName());
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadMain {

	public static void main(String[] args) {
		FirstTh t1 = new FirstTh("+");
		FirstTh t2 = new FirstTh("/");
		FirstTh t3 = new FirstTh("?");
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("\n"+Thread.activeCount()+"\n");
		System.out.println("\n"+Thread.currentThread()+"\n");
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n"+Thread.activeCount()+"\n");

	}

}
