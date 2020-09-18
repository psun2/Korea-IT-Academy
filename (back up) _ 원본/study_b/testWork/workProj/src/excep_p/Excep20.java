package excep_p;

public class Excep20 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			int one = i%10;
			
			try {
				int a = 10/(one%3);
				System.out.println(i);
			} catch (Exception e) {
				
				try {
					int a = 10/one;
					System.out.println("¦");
				} catch (Exception e2) {
					System.out.println(i);
				}
				
				
			}
			
		}

	}

}
