package control_p;

public class breakContinue {

	public static void main(String[] args) {

		//for (int i = 0; i < 10; i++) {
		for (int i = 0; ; i++) {
			
			System.out.println("break 시작:"+i);
			
			if(i==5)
				break;
			
			System.out.println("break 끝:"+i);
		}
		
		System.out.println("break 종료----------------");
		
		
		for (int i = 0; i < 10; i++) {
				
			System.out.println("continue 시작:"+i);
			
			if(i==5)
				continue;
			
			System.out.println("continue 끝:"+i);
		}
		
		System.out.println("continue 종료--------------");
		
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("if 시작:"+i);
			
			if(i!=5)
				System.out.println("if 끝:"+i);
		}
		
		System.out.println("if 종료--------------");

	}

}
