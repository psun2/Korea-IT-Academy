
public class Main {

	public static void main(String[] args) {

		String a = "I Love You";
//		TODO contains : 포함하다. (대, 소문자 를 구분합니다.)
		if (a.contains("Love")) {
			// 포함하는 경우 실행되는 부분
			System.out.println("Me Too.");
		} else {
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You.");
		}
//		출력 값 : Mee Too.
		
		if (a.contains("love")) {
			// 포함하는 경우 실행되는 부분
			System.out.println("Me Too.");
		} else {
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You.");
		}
//		출력 값 : I Hate You.

	}

}
