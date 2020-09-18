package 기초복습;

import java.io.IOException;

public class SystemIn {

	public static void main(String[] args) throws IOException {

//		TODO System.in.read() 로 입력 받은 수 혹은 문자 를 문자열로 변환(?) 시킨다고 생각하시면 됩니다.

//		String no = "";
		int no = 0;

		while (true) {
			int ch = System.in.read();

			System.out.println("System.in.read() 로 받아온 ch 변수 : " + ch);
//			 입력값 : 5
//			 출력값 : 53, 13, 10
//			 '5' = 아스키 코드로 53 입니다.
//			 13, 10 은 엔터를 의미합니다.
//			 if 만약에 입력받은  숫자를 그래로 출력하고 싶으면?
//			 '0'을 빼주면 숫자 본연의 값이 나옵니다.
			if (ch == 10 || ch == 13) {
				System.out.print("Enter 입니다. \n");
				break;
			}
//			switch (ch) {
//			case 10:
//				System.out.print("Enter 입니다. \n");
//				break;
//			case 13:
//				System.out.print("Enter 입니다. \n");
//				break;
//			default:
//				System.out.println("switch 문의 default 값 입니다.");
//			}

			// 문제 2
			// 문제 1에 따라 일의 자리는 상관없었는데 10의 자리로 넘어갈때 문제가 발생했습니다.
			// ex 12를 출력하고 싶은데 12를 입력하면 3이 출력됩니다.
			// 먼저 입력받은 1을 -'0'으로 변환하여 no 변수에 담고 그다음의 2또한 -'0'으로 변환되어 서로 더해 3이라는 새로운 값이 출력
			// 됩니다.
			// 이를 방지하기 위해 먼저 들어간 수의 자릿수를 보존하기 위해 10을 곱합니다.
			System.out.println("10 을  곱하기 전 no변수 : " + no);
			no *= 10;
			System.out.println("10 을 곱한이 후 no변수 : " + no);

			// 문제 1
			// 받아온 수가 아스키 코드 값이기 때문에 0(48)을 빼주면 받아온 수를 그대로 출력이 가능합니다.
			System.out.println("\'0\' 을 빼주기전 no변수 : " + no);
			no += ch - '0';
			System.out.println("\'0\' 을 빼준 후 no변수 : " + no);

		}

		// 위 콘솔창의 결과를 보아 13 만 버립니다. 즉 10은 계속 가지고 있게 되는 것 입니다.
		// 위의 while 문에서 if 문을 주석처리 해보시면 13 과 10을 동시에 가지고 있는 것을 알 수 있습니다.
		// 13 과 10은 enter의 기능을 하는 번호 입니다.
		// 위의 결과에 따라 10을 버리기 위해 의미 없는 System.in.read(); 를 통해 10을 버릴 수 있도록 합니다.
		System.in.read(); // 엔터키가 13, 10 두개의 값을 받으므로 한개를 더 버려야함

		int no2 = 0;

		while (true) {
			int ch = System.in.read();

			if (ch == 13)
				break;

			no2 *= 10;
			no2 += ch - '0';

		}

		System.in.read(); // 엔터키가 13, 10 두개의 값을 받으므로 한개를 더 버려야함

		System.out.println(no2);
		System.out.println("결과 : " + (no + no2));

	}

}
