package thread_p;

public class JoinMain {

	public static void main(String[] args) {
		FirstTh t1 = new FirstTh("+");
		FirstTh t2 = new FirstTh("/");
		FirstTh t3 = new FirstTh("?");
		
		t1.start();
		t2.start();
		
		try {
			t1.join(3000);  //start 되지 못하도록 막음
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
	}

}

