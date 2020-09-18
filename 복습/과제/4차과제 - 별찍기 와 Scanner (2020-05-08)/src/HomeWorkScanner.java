import java.util.Scanner; // scanner import

public class HomeWorkScanner {

	public static void main(String[] args) {

		// 과제
		// while 문과 Scanner 을 이용하여, 영화예약 프로그램을 생성하세요.

		// 영화종류
		// 1. 액션 2. 비액션 3. 안액션 4. 다시예매 0. 종료

		// 예약인원
		// 1. 성인 2. 학생 3. 어린이 4. 아줌마 5. 다시하기 0. 종료

		// 예약 인원수
		// 1 ~ 8명 0. 종료


		int start = 1, end = 0;
		int toggle = start, fToggle = start, sToggle = start, tToggle = start;

		String genres = ""; // 영화 종류를 담을 변수를 생성합니다.
		String person = ""; // 예약 인원을 담을 변수를 생성합니다.

		System.out.println("영화예약 프로그램을 시작합니다. \n");
		
		while (toggle == start) { // 맨처음으로 되돌아 갈수 있게 영화종류, 인원, 인원수 의 while 문을 다시한번 while 문으로 감싸 줍니다.

			Scanner sc = new Scanner(System.in); // 사용자의 입력값을 받는 scanner 클래스 생성
			String option1; // 옵션 값을 담을 변수를 생성합니다.
			String option2;
			String option3;
			String option4;
			String reOption;
			String endOption;
			int scNum; // 사용자의 입력값을 받아 저장하는 변수를 생성합니다.
			
			while (fToggle == start) { // 영화 종류 while 문 시작
				option1 = "액션";
				option2 = "비액션";
				option3 = "안액션";
				reOption = "다시예매";
				endOption = "종료";

				System.out.println(
						"✔   1. " + option1 + " 2. " + option2 + " 3. " + option3 + " 4. " + reOption + " 0. " + endOption);
				System.out.print("영화종류를 정수의 형태로 입력하세요 : ");
				scNum = sc.nextInt();

				switch (scNum) {
				default:
					System.out.println("\n 맨 처음으로.... \n");
					System.out.println("영화예약 프로그램을 재 시작합니다. \n");
					sToggle = end;
					tToggle = end;
					break;
				case 1:
					genres = option1;
					fToggle = end;
					sToggle = start;
					tToggle = start;
					break;
				case 2:
					genres = option2;
					fToggle = end;
					sToggle = start;
					tToggle = start;
					break;
				case 3:
					genres = option3;
					fToggle = end;
					sToggle = start;
					tToggle = start;
					break;
				case 4:
					System.out.println("\n 영화 종류를 다시 선택합니다. \n");
					continue;
				case 0:
					System.out.println("\n 영화예약 프로그램을 종료합니다.");
					toggle = end;
					fToggle = end;
					sToggle = end;
					tToggle = end;
					break;
				}
//				break;
			} // 영화 종류 while 문 종결

			while (sToggle == start) { // 예약 인원 while 문 시작
				option1 = "성인";
				option2 = "학생";
				option3 = "어린이";
				option4 = "아줌마";
				reOption = "다시하기";
				endOption = "종료";

				System.out.println();

				System.out.println("✔   1. " + option1 + " 2. " + option2 + " 3. " + option3 + " 4. " + option4 + " 5. "
						+ reOption + " 0. " + endOption);
				System.out.print("예약인원을 정수의 형태로 입력하세요 : ");
				scNum = sc.nextInt();

				switch (scNum) {
				default:
					System.out.println("\n 맨 처음으로.... \n");
					System.out.println("영화예약 프로그램을 재 시작합니다. \n");
					fToggle = start;
					sToggle = end;
					tToggle = end;
					break;
				case 1:
					person = option1;
					sToggle = end;
					tToggle = start;
					break;
				case 2:
					person = option2;
					sToggle = end;
					tToggle = start;
					break;
				case 3:
					person = option3;
					sToggle = end;
					tToggle = start;
					break;
				case 4:
					person = option4;
					sToggle = end;
					tToggle = start;
					break;
				case 5:
					System.out.println("\n 예약인원을 다시 선택합니다. \n");
					continue;
				case 0:
					System.out.println("\n 영화예약 프로그램을 종료합니다.");
					toggle = end;
					fToggle = end;
					sToggle = end;
					tToggle = end;
					break;

				}
			} // 예약 인원수 while 문 종결

			while (tToggle == start) { // 예약 인원 while 문 시작
				endOption = "종료";

				System.out.println();

				System.out.println("✔   1. 1 ~ 8 명" + " 0. " + endOption);
				System.out.print("예약인원을 정수의 형태로 입력하세요 : ");
				scNum = sc.nextInt();

				if (scNum >= 1 && scNum <= 8) {
					System.out.println("==========[SUCCESS]==========");
					System.out.println("|                            |");
					System.out.println("|Genre  : " + genres);
					System.out.println("|Kind 	: " + person);
					System.out.println("|Person : " + scNum);
					System.out.println("|                            |");
					System.out.println("=============================");
					toggle = end;
					tToggle = end;
				} else if (scNum == 0) {
					System.out.println("\n 영화예약 프로그램을 종료합니다.");
					toggle = end;
					fToggle = end;
					sToggle = end;
					tToggle = end;
				}

				else {
					System.out.println("\n 맨 처음으로.... \n");
					System.out.println("영화예약 프로그램을 재 시작합니다. \n");
					fToggle = start;
					sToggle = start;
					tToggle = end;
				}

			} // 예약 인원수 while 문 종결

		} // Main While 문 종결
		
//		 output
		
//		영화예약 프로그램을 시작합니다.
//
//		1. 액션 2. 비액션 3. 안액션 4. 다시예매 0. 종료
//		영화종류를 정수의 형태로 입력하세요 : 1
//
//		1. 성인 2. 학생 3. 어린이 4. 아줌마 5. 다시예매 0. 종료
//		예약인원을 정수의 형태로 입력하세요 : 1
//
//		1. 1 ~ 8 명 0. 종료
//		예약인원을 정수의 형태로 입력하세요 : 1
//		==========[SUCCESS]==========
//		|                            |
//		|Genre  : 액션
//		|Kind 	: 성인
//		|Person : 1
//		|                            |
//		=============================
		
	}

}
