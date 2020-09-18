package thread_p;

class WaitNot{
	
	synchronized void meth_A(String name) {
		System.out.println(name +" meth_A() 실행");
		notifyAll(); 
		try {
			wait(); 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	synchronized void meth_B(String name) {
		System.out.println(name +" meth_B() 실행");
		notifyAll();  
		try {
			wait();  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

class ThreadA extends Thread{
	
	WaitNot wn;
	

	public ThreadA(String name,WaitNot wn) {
		super(name);
		this.wn = wn;
	}
	
	@Override
	public void run() {
		
		while (true) {
			System.out.println(getName()+" 자유다!!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			wn.meth_A(getName());
		}	
	}
}

class ThreadB extends Thread{
	
	WaitNot wn;

	public ThreadB(String name,WaitNot wn) {
		super(name);
		this.wn = wn;
	}
	
	@Override
	public void run() {
		
		while (true) {
			System.out.println(getName()+" 자유다!!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wn.meth_B(getName());
		}	
	}
}

public class WaitNotifyMain {

	public static void main(String[] args) {
		WaitNot wn = new WaitNot();
		ThreadA ta1 = new ThreadA("ta1",wn);
		ThreadA ta2 = new ThreadA("ta2",wn);
		ThreadA ta3 = new ThreadA("ta3",wn);
		
		ThreadB tb1 = new ThreadB("tb1",wn);
		ThreadB tb2 = new ThreadB("tb2",wn);
		ThreadB tb3 = new ThreadB("tb3",wn);
		
		ta1.start();
		ta2.start();
		ta3.start();
		tb1.start();
		tb2.start();
		tb3.start();

	}

}
