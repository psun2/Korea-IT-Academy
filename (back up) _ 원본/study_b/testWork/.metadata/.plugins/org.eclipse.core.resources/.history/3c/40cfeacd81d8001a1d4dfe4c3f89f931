package thread_p;

class PriorityTh extends Thread{
	
	public PriorityTh(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.print(getName());
		}
	}
}


public class PriorityMain {

	public static void main(String[] args) {
		PriorityTh t1 = new PriorityTh("+");
		PriorityTh t2 = new PriorityTh("/");
		PriorityTh t3 = new PriorityTh("?");
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
