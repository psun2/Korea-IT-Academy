package lang_p;

import java.util.Arrays;
import java.util.Scanner;


public class MZBMain {
	String last;
	Scanner sc = new Scanner(System.in);
	String [][] index = {
			{"����","����","��"},
			{"��","��","��"}
		};
	
	String [][] res = {				//user
			{"���","����","����"},
			{"����","���","����"},
			{"����","����","���"}
	//com
	};

	int [] input(int i) throws Exception {
		
		System.out.println(Arrays.toString(index[i]));
		
		String str = "";
		for (int j = 0; j < index[i].length; j++) {
			str+=(j+1)+"."+index[i][j]+" , ";
		}
		str+="0.����";
		System.out.println(str);
		System.out.print("�Է�:");
		
		int user = sc.nextInt();
		
		if(user==0)
			throw new Exception();
		user--;
		int com = (int)(Math.random()*3);
		
		System.out.println("���̸�:"+index[i][user]);
		System.out.println("��ǻŸ:"+index[i][com]);
		
		return new int[] {user, com};
		
	}
	
	String firstGo() throws Exception{
		while(true) {
			int [] arr = input(0);
			
			
			String ttt = res[arr[0]][arr[1]];
			System.out.println("����:"+ttt);
			
			if(!ttt.equals("���"))
				return ttt;
		}
		
	}
	
	void gameModue() throws Exception{
		last = firstGo();
	
		while(true) {
			int [] arr = input(1);
			
			
			
			String ttt = res[arr[0]][arr[1]];
			if(ttt.equals("���")) {
				if(last.equals("����")) {
					
					System.out.println("���: ��");
				}else
					System.out.println("���: ��");
				
				break;
			}
			
			last = ttt;
			
			System.out.println("����:"+last);
						
		}
			
	}
	
	MZBMain() {
		try {
			while(true) {
				System.out.println("������ ���� >>>>>>>>>");
				gameModue();
				System.out.println("������ �� >>>>>>>>>");
			}
		} catch (Exception e) {
			System.out.println("������ ���� ����");
			
		} 
	}

	public static void main(String[] args) {

			new  MZBMain ();
	}

}
