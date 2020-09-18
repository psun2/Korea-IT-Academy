import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {

		int count = 0;
		for (;;) {
			System.out.print(count + " ");
			count++;
			if (count == 10) {
				break;
			}
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in); 

		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + " 입니다.");
		sc.close();
		
		File file = new File("input.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextInt()) {
				System.out.println("file 인자들에게 100을 곱한 값 : " + scanner.nextInt() * 100);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		
	}

}
