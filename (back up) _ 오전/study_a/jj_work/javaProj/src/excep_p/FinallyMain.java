package excep_p;

public class FinallyMain {

	public static void main(String[] args) {
		try {
			int a = 10/1;
			System.out.println("try ����");
		} catch (Exception e) {
			System.out.println("����ó��");
			//System.exit(0);
			return;
		}finally {
			System.out.println("�ý��� ����");
		}
		
		
	}

}
