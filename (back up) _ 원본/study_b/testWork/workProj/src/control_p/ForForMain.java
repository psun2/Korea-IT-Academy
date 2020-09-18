package control_p;

public class ForForMain {

	public static void main(String[] args) {
		for (int h = 1; h <=12; h++) {
			System.out.println("=== "+h+"시 ===");
			
			for (int m = 0; m < 60; m++) {
				System.out.println(h+":"+m);
			}
			
			//System.out.println(m); 접근 불가
		}
		
		for (int gob = 1; gob <10; gob++) {
			
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan+" x "+gob+" = "+dan*gob+"\t");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------");
		
		int kan = 4;	//각 줄에 나타날 단의 갯수
		int max = 14;	//구구단 마지막 단
		
		for (int big = 1; big <=max; big+=kan) { //크게 돌린다.
			/*
			 . . .       .
			 . . .   =>  .
			 . . .       .
			  
			 */
			
			int end = big+kan-1;
			if(end > max)
				end = max;
			for (int gob = 1; gob < 10; gob++) {//곱을 다타냄
				/*
				 . . .       .
				              -
				              -
				              -
				              -
				              -
				              -
				              
				 . . .   =>  .
				              -
				              -
				              -
				              -
				              -
				              -
				              
				 . . .       .
				              -
				              -
				              -
				              -
				              -
				              -
				              
				 */
				
				
				for (int dan = big; dan <=end; dan++) {//작은 단
					/*
					  
					 . . .       big :1			      end = big+kan-1;	
					                1->4     (dan =  1 ->  1+4-1)
					 				| | | |
					 . . .   =>  big :5
					                5-> 8	 (dan =  5 ->  5+4-1)
					 				| | | |
					 . . .       big :9
					                9-> 12    (dan = 9 ->  9+4-1)
					 				| | | |
					 . . .       big :13      					                                        
					                13-> 14 ?  (dan = 13 ->  13+4-1)
					 				| |                        16?   
					 				                        end > max
					 				                        16 > 14
					 				                        end = max
					 				                           14  
					  
					 */
					System.out.print(dan+" x "+gob+" = "+dan*gob+"\t");
				}
				
				System.out.println();
			}

			System.out.println();
			
		}

	}

}
