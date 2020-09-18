package control_p;

public class If_Main2 {

	public static void main(String[] args) {
		
		int a, b = 10;
		
		if(b > 5) {
			
			a = 10;
			System.out.println("참이지롱요");
		}
		else {
			a = 20;
			System.out.println("거짓입니다");
		}
		
		
//		else {    if 없이 단독으로 사용불가
//			System.out.println("거짓입니다");
//		}
		
		System.out.println("if ~ else  종료 a:"+a);
		
		int jum = 65;
		
		if(jum >= 80) {
			System.out.println("우수");
		}
		
		/////////////////////////////
		
		if(jum >= 60) {
			System.out.println("보통");
		}else {
			System.out.println("미달");
		}
		
		System.out.println("-------------------------");
		
		if(jum >= 80) {
			System.out.println("우수");
		
		}else if(jum >= 60) {
			System.out.println("보통");
			
		}else {
			System.out.println("미달");
		}
		
		
		System.out.println("-------------------------");
		
		if(jum >= 80) {
			System.out.println("우수");
			
		}else if(jum >= 60) {
			System.out.println("보통");
			if(jum % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
				
		}else if(jum >= 40) {
			System.out.println("미흡");
			
		}else {
			System.out.println("불량");
		}
	}

}
