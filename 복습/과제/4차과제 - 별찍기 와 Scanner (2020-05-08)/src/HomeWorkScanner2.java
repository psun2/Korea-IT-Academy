import java.util.Scanner;

public class HomeWorkScanner2 {

	public static void main(String[] args) {

		// 과제
		// while 문과 Scanner 을 이용하여, 영화예약 프로그램을 생성하세요.

		// 영화종류
		// 1. 액션 2. 비액션 3. 안액션 4. 다시예매 0. 종료

		// 예약인원
		// 1. 성인 2. 학생 3. 어린이 4. 아줌마 5. 다시하기 0. 종료

		// 예약 인원수
		// 1 ~ 8명 0. 종료

		Scanner sc = new Scanner(System.in);
		
		String genres;
		
		String re = "다시예매";
		String end = "종료";
		
	while(true) {
			
			System.out.println("영화 예약 프로그램을 시작 합니다.");
			while(true) {
				
				int gNum = 0;
				
				String action = "액션";
				String nonAction = "비액션";
				String anAction = "안액션";
				
				System.out.println("1. 액션 2. 비액션 3. 안액션 4. 다시예매 0. 종료");
				System.out.print("영화 종류에 맞는 숫자를 입력하세요 : ");
				gNum = sc.nextInt();
				
				switch(gNum) {
				case 1:
					genres = action;
					System.out.println(genres + " 가 선택되었습니다.");
					break;
				case 2:
					genres = nonAction;
					System.out.println(genres + " 가 선택되었습니다.");
					break;
				case 3:
					genres = anAction;
					System.out.println(genres + " 가 선택되었습니다.");
					break;
				case 4:
					System.out.println("다시예매를 시작합니다.");
					continue;
				case 0:
					System.out.println("영화 예약 프로그램을 종료 합니다");
					break;
				}
				
			}
			
//			while(true) {
//				System.out.println("하이");
//			}
	}
	
//	System.out.println("dd");
		}
		
	}


