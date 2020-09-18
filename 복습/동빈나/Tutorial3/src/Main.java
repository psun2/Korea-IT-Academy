
public class Main {

	public static void main(String[] args) {
		
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		System.out.println("a + b + c 의 평균 : " + (a + b + c) / 3); // 10.0
		
//		TODO 반복문에서 char를 사용시 "(쌍따옴표)가 아닌 '(홀 따옴표)를 사용해야 에러가 없습니다.
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		int d = 200;
		
		System.out.println("10진수 : " + d); // 200
		System.out.format("8진수 : %o\n", d); // 310
		System.out.format("16진수 : %x\n", d); // c8
		
//		8진수는 %o 로 표현하고 16진수는 %x로 표현됩니다.
//		\n 은 System.out.println(); 의 ln 즉 줄바꿈을 의미합니다.
		
		String name = "Jhon Doe";
		System.out.println(name); // Jhon Doe
		System.out.println(name.substring(0, 1)); // J
		System.out.println(name.substring(3, 6)); // n D
		System.out.println(name.substring(5, 8)); // Doe
		System.out.println(name.substring(0, 4)); // Jhon
		
//		substring 함수는 2개의 argument를 받고, 
//		첫 번째 argument 는 찾고자하는 문자열의 시작 위치
//		두 번째 argument 는  찾고자하는 문자열의 마지막 위치
//		를 나타내어 substring(4, 7) 은 해당 문자열의 4번째 자리 부터 7번째 자리 전인
//		6번째 까지 출력합니다.
		
	}
	
}
