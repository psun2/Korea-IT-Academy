package lang_p;

import java.util.Scanner;

public class GBBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] index = {"����","����","��"};
		
		String [][] res = {				//user
				{"���","��","��"},
				{"��","���","��"},
				{"��","��","���"}
		//com
		};
		while(true) {
			System.out.println("����������");
			System.out.println("1. ����, 2. ����, 3.��,  0.����");
			System.out.print("�Է�:");
			
			int user = sc.nextInt();
			
			if(user==0)
				break;
			
			user--;
			int com = (int)(Math.random()*3);
			
			
			System.out.println("���̸�:"+index[user]);
			System.out.println("��ǻŸ:"+index[com]);
			System.out.println("���:"+res[user][com]);
		}
		
		System.out.println("���� ����");

	}

}
