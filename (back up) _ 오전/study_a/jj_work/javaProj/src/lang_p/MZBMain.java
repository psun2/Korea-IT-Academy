package lang_p;

import java.util.Scanner;

class MZB{
	
	String [] title = {"가위","바위","보"};
	
	String [][]res = {			
			{"비김","수비","공격"},
			{"공격","비김","수비"},
			{"수비","공격","비김"}
	};
	
	int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 0.종료, 1.가위, 2.바위, 3.보");
		System.out.print("입력:");
		int user = sc.nextInt();
		user--;

		int com = (int)(Math.random()*3);
		if(user>=0) {
			System.out.println("게이머:"+title[user]);
			System.out.println("콤퓨타:"+title[com]);
		}
		return new int[] {user, com};
	}
	
	String gameGo() {
		while(true) {
			
			int [] user =input();
			if(user[0] == -1)
				break;

			System.out.println("공수:"+res[user[0]][user[1]]);
			
			if(!res[user[0]][user[1]].equals("비김"))
				return res[user[0]][user[1]];
		}
		return null;
		
	}
}

class MZBChild extends MZB{
	String first="승";
	
	String [][]res2 = {			//user
			{"비김","패","승"},
			{"승","비김","패"},
			{"패","승","비김"}
	//com
	};

	public MZBChild(String first) {
		super();
		if(first.equals("수비"))
			this.first = "패";
	}
	
	String gameGo() {
		while(true) {
			int [] user =input();
			
			if(user[0] == -1) {
				break;
			}

			if(res[user[0]][user[1]].equals("비김")) 
				return first;
			else {
				System.out.println("공수:"+res[user[0]][user[1]]);
				first = res2[user[0]][user[1]];
			}
			
		}
		return "게임종료";
		
	}
	
}

public class MZBMain {

	public static void main(String[] args) {
		String res = new MZB().gameGo();
		
		if(res==null) {
			System.out.println("게임종료");
			return;
		}
		
		System.out.println("게임결과:"+new MZBChild(res).gameGo());
		
	}

}
