package control_p;

public class For_Debug {

	public static void main(String[] args) {
		
		System.out.println("for 문 시작>>>>>>");
		int b = 0;
		int tot = 0;
		
		for (int i = 0; i <100; i++) {
			
			tot += i;
			b++;
			
			int a = 1;		
			a++;
			
			System.out.println(i+","+a+","+b+","+tot);
				
		}
		System.out.println("for문 종료 : "+b+","+tot);

	}

}
