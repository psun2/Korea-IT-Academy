package control_p;

public class For99 {

	public static void main(String[] args) {
		
		int limit = 8;
		int line = 5;
		
		for (int big = 1; big <=limit; big+=line) {
			System.out.println();
			
			int end = big+line;
			
			if(end>limit)
				end=limit+1;
			
			for (int gob = 1; gob < 10; gob++) {
				
				for (int dan = big; dan <end ; dan++) {
					System.out.print(dan+" x "+gob +" = "+gob*dan+"\t");
				}
				System.out.println();
			}
		}

	}

}
