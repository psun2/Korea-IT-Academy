package thread_p;

class InterruptTh extends Thread{
	
	public InterruptTh(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			
			//isInterrupted() : interrupt() 호출 유무	
			if(isInterrupted())
				break;
				
			System.out.print(getName());
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n"+getName()+ " 종료\n");
	}
	
}

public class InterruptMain {

	public static void main(String[] args) throws Exception {
		InterruptTh t1 = new InterruptTh("+");
		InterruptTh t2 = new InterruptTh("/");
		InterruptTh t3 = new InterruptTh("?");

		System.out.println("\nt1"+t1.isInterrupted()+"\n");
		System.out.println("\nt2"+t2.isInterrupted()+"\n");
		System.out.println("\nt3"+t3.isInterrupted()+"\n");
		
		t1.start();
		t2.start();
		t3.start();
		
		//Thread.sleep(3000);
		
		t1.interrupt(); //start() 이후 호출 가능
		
		System.out.println("\nt1"+t1.isInterrupted()+"\n");
		System.out.println("\nt2"+t2.isInterrupted()+"\n");
		System.out.println("\nt3"+t3.isInterrupted()+"\n");
	}

}
