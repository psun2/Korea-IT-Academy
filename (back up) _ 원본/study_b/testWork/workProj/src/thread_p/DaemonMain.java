package thread_p;

class DaemonSave extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("자동저장");
			
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class DaemonMain {

	public static void main(String[] args) throws Exception {
		DaemonSave save = new DaemonSave();
		
		save.setDaemon(true);
		
		save.start();
		//save.setDaemon(true);
		
		new MulTimer().start();
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(i+"저장");
		}
		
		
	}

}
