package control_p;

public class For_Main {

	public static void main(String[] args) {
		
		for(byte i = 0;i<=3 ;i++) {
		//      �ʱⰪ;  ����    ; ���� 
			
		//   int i = 0  						--1
		//             i<= 3  		0<=3 true	--2	
			
		//					 i++    i= 1	    --4
		//          	i<= 3  		1<=3 true	--5	
			
		//					 i++    i= 2	    --7
		//          	i<= 3  		2<=3 true	--8
			
		//			         i++    i= 3	    --10
		//          	i<= 3  		3<=3 true	--11
		
		//			         i++    i= 4	    --13
		//          	i<= 3  		4<=3 false	--14  for�� Ż��
			
			System.out.println("for ���̴� "+i);
		//   	for ���̴� "+ 0					--3
		//   	for ���̴� "+ 1					--6
		//		for ���̴� "+ 2					--9
		//		for ���̴� "+ 3					--12
		}

	}

}
