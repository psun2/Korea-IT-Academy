
public class Main2 {

	public static void main(String[] args) {

		int[] array = new int[100];

		System.out.println(array.length); // 100

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1); // 1부터 100까지의 정수

		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println(sum); // 5282

		System.out.println("100개의 랜덤 정수의 평균 값은: " + sum / array.length);

	}

}
