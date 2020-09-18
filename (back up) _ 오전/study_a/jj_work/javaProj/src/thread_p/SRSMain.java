package thread_p;

class SRS extends Thread{

	public SRS(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				sleep(1000);
				System.out.println(getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class SRSMain {

	public static void main(String[] args) throws InterruptedException {
		SRS s1 = new SRS("*");
		SRS s2 = new SRS("**");
		SRS s3 = new SRS("***");
		
		s1.start();
		s2.start();
		s3.start();
		
		Thread.sleep(2000);
		s1.suspend();
		Thread.sleep(2000);
		s2.suspend();
		Thread.sleep(2000);
		s1.resume();
		Thread.sleep(3000);
		s1.stop();
		s2.stop();
		Thread.sleep(3000);
		s3.stop();
		
		s1.start();
	}

}

