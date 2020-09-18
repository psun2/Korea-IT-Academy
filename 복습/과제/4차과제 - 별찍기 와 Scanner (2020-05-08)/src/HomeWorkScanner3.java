import java.util.Scanner; // 스캐너 사용을 위한 import

public class HomeWorkScanner3 {

	public static void main(String[] args) {

		// 과제
		// while 문과 Scanner 을 이용하여, 영화예약 프로그램을 생성하세요.

		// 영화종류
		// 1. 액션 2. 비액션 3. 안액션 4. 다시예매 0. 종료

		// 예약인원
		// 1. 성인 2. 학생 3. 어린이 4. 아줌마 5. 다시하기 0. 종료

		// 예약 인원수
		// 1 ~ 8명 0. 종료

		Scanner sc = new Scanner(System.in); // 사용자의 입력 값을 받기 위한 Scanner 생성

		String mKind = ""; // movie kind
		String pKind = ""; // person kind
		int nKind; // number of personnel Kind

		int start = 1; // toggle이 1과 같으면 반복합니다.
		int end = 0; // toggle이 0이 되면 반복을 중지합니다.

		int mainToggle = start; // 모든 while문을 제어라하는 while문의 조건 초기값 while문의 반복을 위한 조건 설정 초기값
		int mKindToggle = start; // Movies kind // while문의 반복을 위한 조건 설정 초기값
		int pKindToggle = start; // person // while문의 반복을 위한 조건 설정 초기값
		int nKindToggle = start; // number of personnel // while문의 반복을 위한 조건 설정 초기값

		while (mainToggle == start) {

			while (mKindToggle == start) {
				int num;
				int Progress;

				String option1 = "액션";
				String option2 = "비액션";
				String option3 = "안액션";

				System.out.println("영화 예약 프로그램입니다.");
				System.out.println("1. " + option1 + "\t2 ." + option2 + "\t3 ." + option3 + "\t4 . 다시예매" + "\t0 . 종료");
				System.out.print("관람하실 영화장르를 번호로 선택해 주세요 : ");
				num = sc.nextInt();

				System.out.println();
				if (num == 4) { // 4번을 눌러 전 단계로 돌아 갑니다.
					System.out.println();
					System.out.println("장르선택 화면으로 화면으로 돌아갑니다.");
					System.out.println();
					pKindToggle = end;
					nKindToggle = end;
					break;
				} else if (num == end) { // 0 번을 눌러 종료됩니다.
					System.out.println("영화 예약 프로그램을 종료합니다.");
					mKindToggle = end;
					pKindToggle = end;
					nKindToggle = end;
					mainToggle = end;
					break;
				} else if (num >= 1 && num <= 3) {
					if (num == 1) {
						System.out.print("선택하신 " + option1 + " 장르로 계속 진행을 원하시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
//						switch (Progress) {
//						case 1:
//							pKindToggle = start;
//							nKindToggle = start;
//							mKindToggle = end;
//							break;
//						case 2:
//							System.out.println("다시 선택해 주세요.");
//							System.out.println();
//							pKindToggle = end;
//							nKindToggle = end;
//							break;
//						case 0:
//							System.out.println("영화 예약 프로그램을 종료합니다.");
//							mKindToggle = end;
//							pKindToggle = end;
//							nKindToggle = end;
//							mainToggle = end;
//							break;
//						default:
//							pKindToggle = end;
//							nKindToggle = end;
//							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
//							System.out.println();
//							break;
//						}
						if (Progress == 1) {
							mKind = option1;
							pKindToggle = start;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							pKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							pKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					} else if (num == 2) {
						System.out.print("선택하신 " + option2 + " 장르로 계속 진행을 원하시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
						mKind = option2;
						if (Progress == 1) {
							mKind = option2;
							pKindToggle = start;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							pKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							pKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					} else {
						System.out.print("선택하신 " + option2 + " 장르로 계속 진행을 원하시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
						mKind = option2;
						if (Progress == 1) {
							mKind = option3;
							pKindToggle = start;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							pKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							pKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					}
				} else { // 선택 되지 않는 번호를 누를시 첫 화면으로 돌아갑니다.
					pKindToggle = end;
					nKindToggle = end;
					System.out.println("잘못 입력하여 초기화면 으로 돌아갑니다.");
					System.out.println();
					break;
				}
			}

			while (pKindToggle == start) {
				int num;
				int Progress;

				String option1 = "성인";
				String option2 = "학생";
				String option3 = "어린이";
				String option4 = "아줌마";

				System.out.println("1. " + option1 + "\t2 ." + option2 + "\t3 ." + option3 + "\t4 ." + option4
						+ "\t5 . 다시예매" + "\t0 . 종료");
				System.out.print("본인 신분 번호를 입력해 주세요 : ");
				num = sc.nextInt();
				System.out.println();
				if (num == 5) { // 5번을 눌러 전 단계로 돌아 갑니다.
					System.out.println();
					System.out.println("신분선택 화면으로 화면으로 돌아갑니다.");
					System.out.println();
					mKindToggle = end;
					nKindToggle = end;
					break;
				} else if (num == end) { // 0 번을 눌러 종료됩니다.
					System.out.println();
					System.out.println("영화 예약 프로그램을 종료합니다.");
					mKindToggle = end;
					pKindToggle = end;
					nKindToggle = end;
					mainToggle = end;
					break;
				} else if (num >= 1 && num <= 4) {
					if (num == 1) {
						System.out.print("선택하신 " + option1 + " 신분이 맞으신가요? 맞으시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
						if (Progress == 1) {
							pKind = option1;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							mKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							mKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					} else if (num == 2) {
						System.out.print("선택하신 " + option2 + " 신분이 맞으신가요? 맞으시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
						if (Progress == 1) {
							pKind = option2;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							mKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							mKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					} else if (num == 3) {
						System.out.print("선택하신 " + option3 + " 신분이 맞으신가요? 맞으시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
						if (Progress == 1) {
							pKind = option3;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							mKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							mKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					} else {
						System.out.print("선택하신 " + option4 + " 신분이 맞으신가요? 맞으시면 1, 다시선택은 2, 종료를 원하시면 end 을 입력해주세요 : ");
						Progress = sc.nextInt();
						System.out.println();
						if (Progress == 1) {
							pKind = option4;
							nKindToggle = start;
							break;
						} else if (Progress == 2) {
							System.out.println("다시 선택해 주세요.");
							System.out.println();
							mKindToggle = end;
							nKindToggle = end;
							break;
						} else if (Progress == end) {
							System.out.println("영화 예약 프로그램을 종료합니다.");
							mKindToggle = end;
							pKindToggle = end;
							nKindToggle = end;
							mainToggle = end;
							break;
						} else {
							mKindToggle = end;
							nKindToggle = end;
							System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
							System.out.println();
							break;
						}
					}
				} else { // 선택 되지 않는 번호를 누를시 첫 화면으로 돌아갑니다.
					nKindToggle = end;
					System.out.println("잘못 입력하여 초기화면 으로 돌아갑니다.");
					System.out.println();
					break;
				}
			}

			while (nKindToggle == start) {
				int num;
				int Progress;

				System.out.println("1. 1 ~ 8" + "\t2 . 다시선택" + "\t0 . 종료");
				System.out.print("예매 인원수를 1 ~ 8명까지 정수로 입력해주세요  : ");
				num = sc.nextInt();
				System.out.println();
				if (num == 2) { // 2번을 눌러 전 단계로 돌아 갑니다.
					mKindToggle = end;
					pKindToggle = end;
					System.out.println();
					System.out.println("신분선택 화면으로 화면으로 돌아갑니다.");
					System.out.println();
					break;
				} else if (num == end) { // 0 번을 눌러 종료됩니다.
					System.out.println("영화 예약 프로그램을 종료합니다.");
					mKindToggle = end;
					pKindToggle = end;
					nKindToggle = end;
					mainToggle = end;
				} else if (num >= 1 && num <= 8) {
					System.out.print("선택하신 " + num + " 명이 맞으신가요? 맞으시면 1, 다시선택은 2, 종료를 원하시면 0 을 입력해주세요 : ");
					Progress = sc.nextInt();
					System.out.println();
					if (Progress == 1) {
						nKind = num;
						System.out.println("==========[SUCCESS]==========");
						System.out.println("|                            |");
						System.out.println("|Genre  : " + mKind);
						System.out.println("|Kind 	: " + pKind);
						System.out.println("|Person : " + nKind);
						System.out.println("|                            |");
						System.out.println("=============================");
						mainToggle = end;
						break;
					} else if (Progress == 2) {
						System.out.println();
						System.out.println("다시 선택해 주세요.");
						System.out.println();
						mKindToggle = end;
						pKindToggle = end;
						break;
					} else if (Progress == end) {
						System.out.println("영화 예약 프로그램을 종료합니다.");
						mKindToggle = end;
						pKindToggle = end;
						nKindToggle = end;
						mainToggle = end;
						break;
					} else {
						mKindToggle = end;
						pKindToggle = end;
						System.out.println();
						System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
						System.out.println();
						break;
					}

				} else { // 선택 되지 않는 번호를 누를시 첫 화면으로 돌아갑니다.
					System.out.println();
					System.out.println("잘못 입력하여 초기화면 으로 돌아갑니다.");
					System.out.println();
					break;
				}
			}
		}
		sc.close();
	}

}
