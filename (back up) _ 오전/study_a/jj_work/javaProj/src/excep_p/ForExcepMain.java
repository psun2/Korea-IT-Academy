package excep_p;

public class ForExcepMain {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			try {
				System.out.println("try ���� "+i);
				int a = 10/0;
				System.out.println("try ���� "+i);
			} catch (Exception e) {
				System.out.println("���ܹ߻� "+i);
			}
		}
		System.out.println("---------------");
		
		try {
			for (int i = 0; i < 5; i++) {
			
				System.out.println("try ���� "+i);
				int a = 10/0;
				System.out.println("try ���� "+i);
			}
			
		} catch (Exception e) {
			System.out.println("���ܹ߻� ");
		}

	}

}
