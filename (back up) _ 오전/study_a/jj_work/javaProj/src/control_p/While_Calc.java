package control_p;

import java.util.Scanner;

public class While_Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("수1:");
			int su1 = sc.nextInt();
			
			sc.nextLine();
			System.out.print("연산+, - , *, / ,% , c(다시하기),  g(종료):");
			String code = sc.nextLine();
			
			if(code.equals("g"))
				 break;
			 
			if(code.equals("c"))
				 continue;
			 
			System.out.print("수2:");
			int su2 = sc.nextInt();
			
			String msg ="";
			int res = 0;
			switch(code) {
				case "+":
					res = su1 + su2;
					break;
				case "-":
					res = su1 - su2;
					break;
				case "*":
					res = su1 * su2;
					break;
				case "/":
					res = su1 / su2;
					break;
				case "%":
					res = su1 % su2;
					break;
				default:
					msg = "연산 불가입니다.";
					break;
			}	
			
			if(msg.equals(""))
				msg = su1 +" "+ code + " "+ su2 +" = "+ res;
			
			System.out.println(msg);
		}
		
		System.out.println("계산기 종료");

	}

}
