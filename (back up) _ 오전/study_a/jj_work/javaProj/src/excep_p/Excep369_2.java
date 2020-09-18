package excep_p;

public class Excep369_2 {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			String ttt="";
			int cnt=0;
			int one = i%10;
			int ten = i/10;
			//one
			try {
				
				int a = 123/(one%3);
			} catch (Exception e) {
				try {
					int a = 123/one;
					ttt += "¦";
					cnt++;
				} catch (Exception e2) {
					
				}
			}
			
			//ten
			try {
				
				int a = 123/(ten%3);
			} catch (Exception e) {
				try {
					int a = 123/ten;
					ttt += "¦";
					cnt++;
				} catch (Exception e2) {
					
				}
			}
			
			//num
			try {
				int a = 123/cnt;
			} catch (Exception e) {
				ttt+=i;
			}
			
			System.out.println(ttt);
		}

	}

}
