package lang_p;

import java.util.Scanner;

public class CharmCharmCharm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] title = {"����","������"};
		while(true) {
			
			System.out.println("�߾��� ���� ������ 0.����, 1.����, 2.������");
			System.out.print("�Է�:");
			int user = sc.nextInt();
			
			if(user == 0)
				break;
			
			int com = (int)(Math.random()*2);
			
			String res = "��";
			if(user == com+1)
				res = "��";
			
			System.out.println("���̸�:"+title[user-1]);
			System.out.println("��ǻŸ:"+title[com]);
			System.out.println("���:"+res);
			
		}
		
		System.out.println("����");

	}

}
