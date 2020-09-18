package array_p;

public class ArrayForMain {

	public static void main(String[] args) {

		int[] arr = { 98, 92, 91, 85, 75, 86 };

		int tot = 0;

		tot += arr[0];
		tot += arr[1];
		tot += arr[2];
		tot += arr[3];
		tot += arr[4];
		tot += arr[5];

		System.out.println(tot);
		System.out.println(tot / 6);
		System.out.println("length " + arr.length);

		System.out.println("---------------");

		tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
			System.out.println("arr[" + i + "]" + arr[i]);
		}

		System.out.println(tot);
		System.out.println(tot / arr.length);

		System.out.println("---------------");

		int[] array = { 87, 65, 82, 46, 98, 65, 72, 34, 91, 79, 45, 67 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 70) {
				sum += array[i];
				count++;
			}
		}
		double avg = (double) sum / count;

//		double avg = sum / array.length;
		System.out.println("총점" + sum);
		System.out.println("평균" + avg);

		System.out.println("---------------");

		int[] array2 = { 65, 22, 13, 4, 67, 7, 12, 98, 23, 70, 5, 53, 43, 82, 19, 37, 16, 8, 32 };

		count = 0;
		int count2 = array2.length;
		for (int i = 0; i < array2.length; i++) {
			count = 0;
			for (int j = 2; j < array2[i]; j++) {
				if (array2[i] % j == 0) {
					count2--;
//					System.out.println(array2[i] + ", " + j);
					count++;
					
					break;
				}
			}
			if (count == 0) {
				System.out.print(array2[i] + ", ");
			}
		}

		System.out.println();
		System.out.println("소수의 갯수는 : " + count2);

		System.out.println();

		int[] arr3 = { 22, 13, 4, 67, 7, 12, 98, 23, 70, 5, 53, 43, 82, 19, 37, 16, 8, 32 };

		tot = 0;
		for (int j = 0; j < arr3.length; j++) {

			int chk = 1;
			for (int i = 2; i < arr3[j]; i++) {
				if ((chk = arr3[j] % i) == 0) {

					break;
				}
			}
			tot += chk;
			if (chk != 0)
				System.out.print(arr3[j] + ", ");
		}
		
		System.out.println();
		System.out.println(tot);

	}

}