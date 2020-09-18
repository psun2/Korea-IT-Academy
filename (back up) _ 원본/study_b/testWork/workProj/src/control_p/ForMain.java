package control_p;

public class ForMain {

	public static void main(String[] args) {
		
		
		int tot = 0;
		System.out.println("for문 시작:"+tot);
		
		for(int i = 0; i<5 ; i++ ) {
		       //초기값 ;  조건 ; 증감
			//i = 0  					--- 1
			
			//			0 < 5 :true		--- 2
			//			1 < 5 :true		--- 6
			//			2 < 5 :true		--- 10
			//			3 < 5 :true		--- 14
			//			4 < 5 :true		--- 18
			//			5 < 5 :false	--- 22  for문 탈출
			
			//				  i++ : i=1 --- 5
			//			  	  i++ : i=2 --- 9
			//			  	  i++ : i=3 --- 13
			//			  	  i++ : i=4 --- 17
			//			  	  i++ : i=5 --- 21
			
			tot += i;
			//tot = 0+0					--- 3
			//tot = 0+1					--- 7
			//tot = 1+2					--- 11
			//tot = 3+3					--- 15
			//tot = 6+4					--- 19
			
			System.out.println("for문이다..."+i+","+tot);	
			// for문이다...0,0			--- 4
			// for문이다...1,1			--- 8
			// for문이다...2,3			--- 12
			// for문이다...3,6			--- 16
			// for문이다...4,10			--- 20
		}
		
		
		
		//System.out.println("for문 종료 "+i+","+tot);
		System.out.println("for문 종료 "+tot);	//---23
		
		
		//1 -> 100 짝수들의 합
		
		tot=0;
		for (int i = 0; i <=100; i+=2) {
			tot+=i;
		}
		System.out.println("1st:"+tot);
		
		tot=0;
		for (int i = 0; i <=100; i++) {
			if(i%2==0)
				tot+=i;
		}
		System.out.println("2nd:"+tot);
		
		tot=0;
		for (int i = 1; i <=100; i+=2) {
			i += i%2;
			tot += i;
			//System.out.println(i+":"+tot);
		}
		System.out.println("3rd:"+tot);
	}

}
