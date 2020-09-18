package excep_p;

public class FinallyMain {

	public static void main(String[] args) {
		try {
			int a = 10/1;
			System.out.println("try 종료");
		} catch (Exception e) {
			System.out.println("예외처리");
			//System.exit(0);
			return;
		}finally {
			System.out.println("시스템 종료");
		}
		
		
	}

}
