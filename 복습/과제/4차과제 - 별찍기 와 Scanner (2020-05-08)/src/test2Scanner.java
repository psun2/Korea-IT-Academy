import java.util.Scanner;

public class test2Scanner {

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
		String Person;

		int start = 1, end = 0;
		int fToggle = start, sToggle = start, tToggle = start, toggle = start;

		System.out.println("영화 예약 프로그램을 시작 합니다.");
			
		while (true) {

			int scNum ;

			while (true) {	
				
				String option1 = "액션";
				String option2 = "비액션";
				String option3 = "안액션";
				String reOption = "다시예매";
				String endOption = "종료";

				System.out.println(
						"1. " + option1 + " 2. " + option2 + " 3. " + option3 + " 4. " + reOption + " 0. " + endOption);
				System.out.print("영화 종류에 맞는 숫자를 입력하세요 : ");
				scNum = sc.nextInt();

				switch (scNum) {
				case 1:
					genres = option1;
					System.out.println(genres + " 가 선택되었습니다.");
					fToggle = end;
					break;
				case 2:
					genres = option2;
					System.out.println(genres + " 가 선택되었습니다.");
					break;
				case 3:
					genres = option3;
					System.out.println(genres + " 가 선택되었습니다.");
					break;
				case 4:
					System.out.println("다시예매를 시작합니다.");
					continue;
				case 0:
					System.out.println("영화 예약 프로그램을 종료 합니다.");
					toggle = end;
					break;
				default:
					System.out.println("잘 못 누르셨습니다. 처음부터 다시시작 됩니다.");
//					fToggle = end;
//					sToggle = end;
//					tToggle = end;
					toggle = end;
					break;
				}

				break;
			}
			while (true) {

				String option1 = "성인";
				String option2 = "학생";
				String option3 = "어린이";
				String option4 = "아줌마";
				String reOption = "다시하기";
				String endOption = "종료";

				System.out.println("1. " + option1 + " 2. " + option2 + " 3. " + option3 + " 4. " + option4 + " 5. "
						+ reOption + " 0. " + endOption);
				System.out.print("영화 종류에 맞는 숫자를 입력하세요 : ");
				scNum = sc.nextInt();

				switch (scNum) {
				case 1:
					Person = option1;
					System.out.println(Person + " 가 선택되었습니다.");
					break;
				case 2:
					Person = option2;
					System.out.println(Person + " 가 선택되었습니다.");
					break;
				case 3:
					Person = option3;
					System.out.println(Person + " 가 선택되었습니다.");
					break;
				case 4:
					Person = option4;
					System.out.println(Person + " 가 선택되었습니다.");
					break;
				case 5:
					System.out.println("다시예매를 시작합니다.");
					continue;
				case 0:
					System.out.println("영화 예약 프로그램을 종료 합니다.");
					break;
				default:
					System.out.println("잘 못 누르셨습니다. 처음부터 다시시작 됩니다.");
//					fToggle = end;
//					sToggle = end;
//					tToggle = end;
					toggle = end;
					break;
				}
				
				break;
			} 
			
//			while (tToggle == start) {
//
//			}

		
		}

	}

}
