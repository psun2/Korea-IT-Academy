package control_p;

public class ForVarMain {

	public static void main(String[] args) {
		int i = 0, a = 0;
		System.out.println("for 시작:"+i+","+a);
		//for (int i= 1; i < 5; i++) {
		//for (i; i < 5; i++) {
		
		//for (i=3; i < 5; i++) {
			//반복변수는 내부, 외부 둘다 가능
			//반복변수 외부인 경우 초기값 생략 가능
			//초기값 명시 할 경우 변수에 초기값 대입 필수
		for (int k=3; k < 5; k++) {
			//반복변수 k는 for문 최초 실행시에만 선언 
			// for 문 반복시 소멸되지 않고 for문을 빠져나갈때 소멸됨
			a++;
			
			int b = 0; //내부변수는 for문 반복때마다 선언/소멸을 실행함
			b++;
			System.out.println("for 내부:"+k+","+a+","+b);
		}
		
		//System.out.println("for 끝:"+i+","+a+","+b); 내부변수 호출 불가
		System.out.println("for 끝:"+i+","+a);

	}

}
