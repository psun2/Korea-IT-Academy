package control_p;

public class ForForMain {

	public static void main(String[] args) {

		for (int h = 1; h <= 12; h++) {
			for (int m = 0; m < 60; m++) {
				System.out.println(m + " 분");
				System.out.println(h + "시 " + m + "분");
			}
//			System.out.println(m + " 분"); // 접근 불가	
		}

	}

}
