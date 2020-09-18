package array_p;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {

		int[] arr = { 23, 9, 72, 43, 51 };

		int buf = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					buf = arr[i];
					arr[i] = arr[j];
					arr[j] = buf;
				}

			}
		}

		System.out.println(Arrays.toString(arr));
		
	}

}
