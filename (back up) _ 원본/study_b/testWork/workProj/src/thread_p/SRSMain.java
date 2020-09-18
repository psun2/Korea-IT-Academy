package thread_p;


class SRS extends Thread{
	
	public SRS(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				System.out.println(getName());
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}

public class SRSMain {

	public static void main(String[] args) throws Exception {
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
		Thread.sleep(2000);
		s1.stop();
		Thread.sleep(2000);
		s2.stop();
		Thread.sleep(2000);
		System.out.println(Thread.activeCount());
		Thread.sleep(2000);
		s3.stop();
		
		System.out.println("--------------------");
		s1 = new SRS("*");
		s1.start();
	}

}
