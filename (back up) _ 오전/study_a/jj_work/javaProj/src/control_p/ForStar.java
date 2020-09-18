package control_p;

public class ForStar {
	
	

	public static void main(String[] args) {
		
		int limit = 7;
		
		System.out.println("1 번");
		for (int line = 0; line < limit; line++) {
			
			for (int star = 0; star <= line; star++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
		
		System.out.println("2 번");
		for (int i = 0; i < limit; i++) {
			
			for (int j = i; j < limit; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("3 번");
		for (int i = 0; i < limit; i++) {
			
			for (int j = i; j < limit-1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4 번");
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < limit; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		System.out.println("5 번");
		for (int i = 0; i < limit; i++) {
			
			for (int j = i; j < limit-1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("6 번");
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (limit-i)*2; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		/*
		 
----*

---**

--***

-****

*****


		 * */

	}

}
