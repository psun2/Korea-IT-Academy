package control_p;

import java.util.Scanner;

public class While_Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("��1:");
			int su1 = sc.nextInt();
			
			sc.nextLine();
			System.out.print("����+, - , *, / ,% , c(�ٽ��ϱ�),  g(����):");
			String code = sc.nextLine();
			
			if(code.equals("g"))
				 break;
			 
			if(code.equals("c"))
				 continue;
			 
			System.out.print("��2:");
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
					msg = "���� �Ұ��Դϴ�.";
					break;
			}	
			
			if(msg.equals(""))
				msg = su1 +" "+ code + " "+ su2 +" = "+ res;
			
			System.out.println(msg);
		}
		
		System.out.println("���� ����");

	}

}
