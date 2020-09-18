package excep_p;

public class ForExcepMain {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			try {
				System.out.println("try 시작 "+i);
				int a = 10/0;
				System.out.println("try 종료 "+i);
			} catch (Exception e) {
				System.out.println("예외발생 "+i);
			}
		}
		System.out.println("---------------");
		
		try {
			for (int i = 0; i < 5; i++) {
			
				System.out.println("try 시작 "+i);
				int a = 10/0;
				System.out.println("try 종료 "+i);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생 ");
		}

	}

}
