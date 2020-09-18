package control_p;

import java.util.Scanner;

//영화종류
//1. 액션  2. 비액션   3. 안액션   4. 다시예매    0. 종료

//예약인원
//1. 성인   2. 학생   3. 어린이    4. 아줌마  5. 다시하기   0. 종료

//예약 인원수
//1~ 8명     0. 종료

/////정상예매시  영화예약 내용 화면 출력할 것


public class While_Movie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String res="", kind, person;
		int cnt, buf;
		
		TOT:while(true) {
			kind ="";
			person = "";
			cnt = 0;
			
			AAA:while(true) {
				System.out.println("영화종류");
				System.out.print("1. 액션  2. 비액션   3. 안액션   4. 다시예매    0. 종료:");
				
				buf = sc.nextInt();
				if(buf==0) {
					res = "예약 종료";
					break TOT;
				}
				if(buf==4)
					continue TOT;
				
				switch(buf) {
					case 1:
						kind = "액션";
						break AAA;
					case 2:
						kind = "비액션";
						break AAA;
					case 3:
						kind = "안액션";
						break AAA;
				}
				
			}
			
			BBB:while(true) {
				System.out.println("예약인원");
				System.out.print("1. 성인   2. 학생   3. 어린이    4. 아줌마  5. 다시하기   0. 종료:");
				
				buf = sc.nextInt();
				if(buf==0) {
					res = "예약 종료";
					break TOT;
				}
				if(buf==5)
					continue TOT;
				
				switch(buf) {
					case 1:
						person = "성인";
						break BBB;
					case 2:
						person = "학생";
						break BBB;
					case 3:
						person = "어린이";
						break BBB;
					case 4:
						person = "아줌마";
						break BBB;
				}
			}
			
			
			while(true) {
				System.out.println("영화종류");
				System.out.print("1~ 8명     0. 종료:");
				
				buf = sc.nextInt();
				if(buf==0) {
					res = "예약 종료";
					break TOT;
				}
				if(buf<=8) {
					cnt = buf;
					break TOT;
				}
				
			}
		}
		
		if(res.equals(""))
			res = kind+","+person+","+cnt;
		
		System.out.println(res);

	}

}
