
public class Main {

	public static void main(String[] args) {

		int N = 50; // 행과 열의 데이터 길이 50 * 50 = 2500

		int[][] array = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = (int) (Math.random() * 10); // 0 ~ 9까지의 랜덤 정수
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
