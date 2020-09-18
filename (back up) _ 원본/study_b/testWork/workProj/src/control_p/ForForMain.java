package control_p;

public class ForForMain {

	public static void main(String[] args) {
		for (int h = 1; h <=12; h++) {
			System.out.println("=== "+h+"�� ===");
			
			for (int m = 0; m < 60; m++) {
				System.out.println(h+":"+m);
			}
			
			//System.out.println(m); ���� �Ұ�
		}
		
		for (int gob = 1; gob <10; gob++) {
			
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan+" x "+gob+" = "+dan*gob+"\t");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------");
		
		int kan = 4;	//�� �ٿ� ��Ÿ�� ���� ����
		int max = 14;	//������ ������ ��
		
		for (int big = 1; big <=max; big+=kan) { //ũ�� ������.
			/*
			 . . .       .
			 . . .   =>  .
			 . . .       .
			  
			 */
			
			int end = big+kan-1;
			if(end > max)
				end = max;
			for (int gob = 1; gob < 10; gob++) {//���� ��Ÿ��
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
				
				
				for (int dan = big; dan <=end; dan++) {//���� ��
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
