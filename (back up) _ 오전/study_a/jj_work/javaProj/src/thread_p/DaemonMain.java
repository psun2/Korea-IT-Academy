package thread_p;
class Daemon extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				sleep(3000);
				System.out.println("자동저장");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

class DaeGo extends Thread{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <50; i++) {
			
			try {
				sleep(1000);
				System.out.println("gogo:"+i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class DaemonMain {

	public static void main(String[] args) {
		
		DaeGo dg = new DaeGo();
		dg.start();
		
		Daemon dm = new Daemon();
		dm.setDaemon(true);
		dm.start();
		//dm.setDaemon(true);
		
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main 종료----------------");

	}

}
