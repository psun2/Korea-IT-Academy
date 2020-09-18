package control_p;

import java.util.Scanner;

/*과제 
//while scanner 을 이용하여 영화예약 프로그램을 생성하세요

//영화종류
1. 액션  2. 비액션   3. 안액션   4. 다시예매    0. 종료

//예약인원
//1. 성인   2. 학생   3. 어린이    4. 아줌마  5. 다시하기   0. 종료

//예약 인원수
1~ 8명     0. 종료

/////정상예매시  영화예약 내용 화면 출력할 것
*/
public class WhileMovie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		TOT:while(true) {
			String movie, person;
			int cnt, inp;
			
			MM:while(true) {
				System.out.println("영화종류(1. 액션  2. 비액션   3. 안액션   4. 다시예매    0. 종료)");
				System.out.print("종류:");
				inp = sc.nextInt();
				
				switch (inp) {
					case 0:
						System.out.println("시스템 종료");
						break TOT;
					case 4:
						continue TOT;		
					case 1:
						movie="액션";
						break MM;
					case 2:
						movie="비액션";
						break MM;
					case 3:
						movie="안액션";
						break MM;
					default:
						continue;
				}
			}
			
			MM:while(true) {
				System.out.println("예약인원(1. 성인   2. 학생   3. 어린이    4. 아줌마  5. 다시하기   0. 종료)");
				System.out.print("예약인원:");
				inp = sc.nextInt();
				
				switch (inp) {
					case 0:
						System.out.println("시스템 종료");
						break TOT;
					case 5:
						continue TOT;		
					case 1:
						person="성인";
						break MM;
					case 2:
						person="학생";
						break MM;
					case 3:
						person="어린이";
						break MM;
					case 4:
						person="아줌마";
						break MM;
					default:
						continue;
				}
			}

			while(true) {
				System.out.println("예약 인원수(1~ 8명     0. 종료)");
				System.out.print("인원수:");
				inp = sc.nextInt();
				
				if(inp==0) {
					System.out.println("시스템 종료");
					break TOT;
				}else if(inp>0 && inp<=8) {
					cnt = inp;
					break;
				}	
			}
			System.out.println(movie+":"+person+","+cnt);
			break;
		}
		
	}

}
