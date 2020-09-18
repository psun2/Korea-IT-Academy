package lang_p;

import java.util.Scanner;

public class CharmCharmCharm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] title = {"왼쪽","오른쪽"};
		while(true) {
			
			System.out.println("추억의 게임 참참참 0.종료, 1.왼쪽, 2.오른쪽");
			System.out.print("입력:");
			int user = sc.nextInt();
			
			if(user == 0)
				break;
			
			int com = (int)(Math.random()*2);
			
			String res = "패";
			if(user == com+1)
				res = "승";
			
			System.out.println("게이머:"+title[user-1]);
			System.out.println("콤퓨타:"+title[com]);
			System.out.println("결과:"+res);
			
		}
		
		System.out.println("종료");

	}

}
