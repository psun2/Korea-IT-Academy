package util_p;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random r1 = new Random();

		System.out.println(r1.nextInt());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextFloat());
		System.out.println(r1.nextLong());
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt(3));
		
		
		
		Random r2 = new Random();
		Random r3 = new Random(10);
		Random r4 = new Random(10);
		System.out.println("--------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(r2.nextInt());
		}
		System.out.println("--------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(r3.nextInt());
		}
		System.out.println("--------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(r4.nextInt());
		}
		
	}

}
