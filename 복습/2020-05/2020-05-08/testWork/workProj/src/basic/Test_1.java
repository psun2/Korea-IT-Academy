package basic;

public class Test_1 {

	public static void main(String[] args) {
		
		System.out.println("정수 출력 : " + 1234);
		System.out.println("실수 출력 : " + 123.456);
		System.out.println("문자 출력 : " + 'a');
		System.out.println("문자열 출력 : " + "아기상어");

		/*
		 * 
		 * 주석 구간
		 * 
		 * System.out.println("내용"); 내용 출력 후 줄바꿈 진행 O
		 * 
		 * System.out.print("내용"); 내용 출력 후 줄바꿈 진행 X
		 * 
		 */

//		print 는 내용 출력후 줄바꿈을 진행 하지 않습니다.
		System.out.print("개나리");
		System.out.print("개나리");
		System.out.print("얼룩 개나리");
		System.out.print("개나리");

//		println 은 내용 출력후 줄바꿈을 진행 합니다.
		System.out.println("개나리");
		System.out.println("개나리");
		System.out.println("얼룩 개나리");
		System.out.println("개나리");
		
		/*
			\t : tab
			\n : enter 줄바꿈을 의미합니다.
			\b : backspace (뒤로한칸이동)
			\r : \n 과 같이 enter 줄바꿈을 의미하지만, 리눅스에서는 사용되지 않습니다.
			\" : "(따옴표) 출력
			\' : '(홀 따옴표) 출력
			\\ : \(역슬래쉬) 출력
		*/
		
		System.out.print("123	456\t789\n123\b456\n789\n");
		System.out.println("나폴레옹은 '이 산이 아닌데?' 라고 생각했다.");
		System.out.println("나폴레옹은 \"불이야\" 라고 생각했다.");
		System.out.println("나폴레옹은 \'fire\' 라고 생각했다.");
		System.out.println("나폴레옹은 \\ 라고 생각했다.");
		
		System.out.println("  +--------------------------------+");
		System.out.println(" /                                /|");
		System.out.println("+--------------------------------+ |");
		System.out.println("|                                | |");
		System.out.println("|       ^                ^       | |");
		System.out.println("|       ●                ●       | |");
		System.out.println("|               ＠                                                       | |");
		System.out.println("|               ▽                                                       | |");
		System.out.println("|                                | +");
		System.out.println("|                                |/");
		System.out.println("+--------------------------------+");
	
	
		System.out.println(200);
		System.out.format("200의 8진수 : %o\n", 200);
		System.out.format("200의 16진수 : %x\n", 200);

	}

}
