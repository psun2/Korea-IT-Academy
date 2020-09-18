package control_p;

public class For369Main {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <=100; i++) {
			
			String ttt = "";
			
			int ten=i/10;
			if(ten%3==0 && ten!=0)
				ttt+="¦";
			
			int one=i%10;
			if(one%3==0 && one!=0)
				ttt+="¦";

			if(ttt=="")
				ttt+=i;
			
			System.out.println(ttt);
		}

	}

}
