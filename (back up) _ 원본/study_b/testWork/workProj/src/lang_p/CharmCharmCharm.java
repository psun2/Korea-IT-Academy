package lang_p;

import java.util.Scanner;

public class CharmCharmCharm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] index = {"","����","������"};
		while(true) {
			System.out.println("�߾��� ���� ������");
			System.out.println("1. ����, 2. ������, 0.����");
			System.out.print("�Է�:");
			
			int user = sc.nextInt();
			
			if(user==0)
				break;
			
			int com = (int)(Math.random()*2)+1;
			
			String res = "��";
			if(user==com)
				res = "��";
			
			System.out.println("���̸�:"+index[user]);
			System.out.println("��ǻŸ:"+index[com]);
			System.out.println("���:"+res);
		}
		
		System.out.println("���� ����");

	}

}
