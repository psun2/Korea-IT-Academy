package control_p;

public class ForStarHomeWork {

	public static void main(String[] args) {
		
		int half = 5;
		for (int i = 0; i < 9; i++) {
			int half_i = i;
			
			if(i>=half)
				half_i = 8-i;
			
			for (int j = 0; j <=10; j++) {
				String ch = "*";
				
				if(half-half_i<=j && half+half_i >=j)
					ch = ""+j;
				System.out.print(ch);
			}
			
			System.out.println(half_i+","+(half-half_i)+","+(half+half_i));
		}

	}

}
