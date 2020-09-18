package thread_p;

class Run1 implements Runnable{

	String name;
	
	
	
	public Run1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
				System.out.print(name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
}
public class RunnableMain {

	public static void main(String[] args) {
//		Run1 r1 = new Run1("+");
		Run1 r2 = new Run1("?");
//		//r1.start();
//		r1.run();
//		r2.run();
		
		Thread t1 = new Thread(new Run1("+"));
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}

}
