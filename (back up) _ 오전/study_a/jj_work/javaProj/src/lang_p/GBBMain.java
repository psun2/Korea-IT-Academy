package lang_p;

import java.util.Scanner;

public class GBBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] title = {"����","����","��"};
		
		String [][]res = {			//user
					{"���","��","��"},
					{"��","���","��"},
					{"��","��","���"}
			//com
		};
		while(true) {
			System.out.println("���������� 0.����, 1.����, 2.����, 3.��");
			System.out.print("�Է�:");
			int user = sc.nextInt();
			
			if(user == 0)
				break;
			
			user--;
			int com = (int)(Math.random()*3);
			System.out.println("���̸�:"+title[user]);
			System.out.println("��ǻŸ:"+title[com]);
			System.out.println("���:"+res[user][com]);
		}
		
		System.out.println("����");

	}

}
