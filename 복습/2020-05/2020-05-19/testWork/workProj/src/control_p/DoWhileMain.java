package control_p;

public class DoWhileMain {

	public static void main(String[] args) {

		int i = 0;

		while (i < 5) {
			System.out.println("while" + i);
			i++;
		}

		System.out.println("------------------");

		int j = 10;

//		TODO
//		do while 은 최초 1회는 무조건(조건에 포함이 되지 않아도...) 실행합니다.
//		그 이후 while 의 조건을 살피고 반복을 할 것인지 말것인지 판단합니다.
		
		
		do {
			System.out.println("do ~ while" + j);
			j++;

		} while (j < 5);

	}

}
