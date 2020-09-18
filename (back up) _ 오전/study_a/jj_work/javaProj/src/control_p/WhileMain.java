package control_p;

public class WhileMain {

	public static void main(String[] args) {
		
		int i = 0; 		//초기값
		while(i<10) {   //조건
			System.out.println("while "+i);
			i++;		//증감
		}
		
		
		//// 0->100 짝수들의 합을  while문을 이용하여 구하세요
		
		i = 0; 		//초기값\
		int tot=0;
		while(i<=100) {   //조건
			tot += i;
			
			i+=2;		//증감
		}
		
		System.out.println(tot);
	}

}
