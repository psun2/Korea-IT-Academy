package control_p;

public class BreakGo {

	public static void main(String[] args) {

		int i = 0;
		AAA:while(true) {  //반복문에 naming 작업
			
			i+= 100;
			System.out.println("while 1 시작 "+i);
			
			
			
			BBB:while(true) {
				i++;
				System.out.println("while 2 시작  "+i);
				if(i==105)
					//break;  //작은 while 탈출
					break AAA;  //while AAA 탈출
				
				System.out.println("while 2 끝 "+i);
			}
			
			//if(i==105)
			//	break;  //큰 while 탈출
			
			//System.out.println("while 1 끝  "+i);
		}
		
		System.out.println("시스템 종료");

	}

}
