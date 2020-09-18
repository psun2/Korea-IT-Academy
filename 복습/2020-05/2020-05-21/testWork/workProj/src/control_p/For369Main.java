package control_p;

public class For369Main {

	public static void main(String[] args) {
		
		int a = 13;
		int _ten = a / 10; // 1
		int _one = a % 10; // 3

		System.out.println(_ten); // 1
		System.out.println(_one); // 3
		System.out.println();
		System.out.println(_ten % 3); // 1
		System.out.println(_one % 3); // 0
		
	
		
		for (int i = 1; i <=100; i++) {
			
			String ttt = "";
			
			int ten=i/10;
			if(ten%3==0 && ten!=0)
//			0 과 같은 수 때문에 one != 0 이 아니여야합니다.
				if(ten%3==0)
				ttt+="짝";
			
			int one=i%10;
			if(one%3==0 && one!=0)
//			0 과 같은 수 때문에 one != 0 이 아니여야합니다.
				ttt+="짝";

			if(ttt=="")
				ttt+=i;
			
			System.out.println(ttt);
		}

	}

}