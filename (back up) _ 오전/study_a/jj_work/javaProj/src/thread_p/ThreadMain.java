package thread_p;

class FirstTh extends Thread{
	
	//String name;

	public FirstTh(String name) {
		super(name);
		//this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			//System.out.print(name);
			System.out.print(getName());
			
			try {
				sleep(10);
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
		System.out.println("\nThread.activeCount():"+Thread.activeCount());
		System.out.println("\nThread.currentThread():"+Thread.currentThread());
		//  Thread[main,5,main]  : 쓰레드이름,  우선순위, 쓰레드그룹
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nThread.activeCount():"+Thread.activeCount());
	}

}


