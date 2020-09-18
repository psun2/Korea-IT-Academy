package lang_p;

import java.util.Scanner;

class MZB{
	
	String [] title = {"����","����","��"};
	
	String [][]res = {			
			{"���","����","����"},
			{"����","���","����"},
			{"����","����","���"}
	};
	
	int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� 0.����, 1.����, 2.����, 3.��");
		System.out.print("�Է�:");
		int user = sc.nextInt();
		user--;

		int com = (int)(Math.random()*3);
		if(user>=0) {
			System.out.println("���̸�:"+title[user]);
			System.out.println("��ǻŸ:"+title[com]);
		}
		return new int[] {user, com};
	}
	
	String gameGo() {
		while(true) {
			
			int [] user =input();
			if(user[0] == -1)
				break;

			System.out.println("����:"+res[user[0]][user[1]]);
			
			if(!res[user[0]][user[1]].equals("���"))
				return res[user[0]][user[1]];
		}
		return null;
		
	}
}

class MZBChild extends MZB{
	String first="��";
	
	String [][]res2 = {			//user
			{"���","��","��"},
			{"��","���","��"},
			{"��","��","���"}
	//com
	};

	public MZBChild(String first) {
		super();
		if(first.equals("����"))
			this.first = "��";
	}
	
	String gameGo() {
		while(true) {
			int [] user =input();
			
			if(user[0] == -1) {
				break;
			}

			if(res[user[0]][user[1]].equals("���")) 
				return first;
			else {
				System.out.println("����:"+res[user[0]][user[1]]);
				first = res2[user[0]][user[1]];
			}
			
		}
		return "��������";
		
	}
	
}

public class MZBMain {

	public static void main(String[] args) {
		String res = new MZB().gameGo();
		
		if(res==null) {
			System.out.println("��������");
			return;
		}
		
		System.out.println("���Ӱ��:"+new MZBChild(res).gameGo());
		
	}

}
