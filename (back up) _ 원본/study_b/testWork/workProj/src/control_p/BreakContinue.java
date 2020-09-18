package control_p;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 0;; i++) {
			System.out.println("break 시작 "+i);
			
			if(i==5)
				break;
			
			System.out.println("break 끝 "+i);
		}

		System.out.println("--------------------------");
		
		for (int i = 0;i<10; i++) {
			System.out.println("continue 시작 "+i);
			
			if(i==5)
				continue;
			
			System.out.println("continue 끝  "+i);
		}

		System.out.println("--------------------------");
		
		for (int i = 0;i<10; i++) {
			System.out.println("if 시작 "+i);
			
			if(i!=5)
				System.out.println("if 끝 "+i);
		}

		System.out.println("--------------------------");
		
		for (int big = 0;big<5; big++) {
			System.out.println("big 시작:"+big);
			
			boolean chk = false;
			
			for (int small = 100; small < 500; small+=100) {
				System.out.println("\t small:"+small);
				if(small==200) {
					chk = true;
					break; //break;
				}
					
			}
			
			if(chk)
				break;
			
			System.out.println("big 끝:"+big);
		}
		
		System.out.println("--------------------------");
		
		
		AAA : for (int big = 0;big<5; big++) {
			System.out.println("big2 시작:"+big);
			
			BBB : for (int small = 100; small < 500; small+=100) {
				System.out.println("\t small2:"+small);
				if(small==200) {
					break AAA;
				}
					
			}
			
			System.out.println("big2 끝:"+big);
		}
		
		System.out.println("--------------------------");
	}

}
