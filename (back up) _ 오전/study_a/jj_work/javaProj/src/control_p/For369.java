package control_p;

public class For369 {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			
			int ten = i/10;
			int one = i%10;
			
			String res = "";
			
			if(ten%3==0 && ten!=0)
				res += "¦";
			
			if(one%3==0 && one!=0)
				res += "¦";
			
			if(res=="")
				res+=i;
			
			
			System.out.println(res);
		}

	}

}
