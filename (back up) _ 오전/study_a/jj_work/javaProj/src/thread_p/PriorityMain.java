package thread_p;
class Priority extends Thread{

	public Priority(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
		}
	}
}
public class PriorityMain {

	public static void main(String[] args) {
		Priority p1 = new Priority("+");
		Priority p2 = new Priority("?");
		Priority p3 = new Priority("/");
		
		p1.setPriority(1);
		p2.setPriority(5);
		p3.setPriority(10);
		
		p1.start();
		p2.start();
		p3.start();

	}

}
