package control_p;

public class If_Main {

	public static void main(String[] args) {

		if(true)   /// 조건의  참/거짓 여부에 따라 실행
			System.out.println("참이지롱");  
		     //실행 구간을 표시하지 않으면 실행 내용을 반드시 기재해야 한다
			 //실행 구간을 표시하지 않으면 if문 코드의 바로 밑에 한 실행문만 적용됨
		
		if(false) {  //if문 시작
			System.out.println("구간 참이지롱1");
			System.out.println("구간 참이지롱2");
			System.out.println("구간 참이지롱3");
			System.out.println("구간 참이지롱4");
		} //if문 끝
		
		
		if(false) {  //if문 시작
			//실행구문 내용이 없어도  error 가 발생되지 않음
		} //if문 끝
		
		
		int a = 5678;
		int b = 10;
		//int c = 30; if  문 안에서 중복 선언하게 될경우 충독 발생
		
		if(b>5) {
			a = 1234;
			
			int c = 890;
			System.out.println("if 구간 c:"+c);
		}
		
		if(true) {
			int d = 4444; //제어문 영역 안에서 선언된 변수는 영역내부에서만 사용 가능
		}
		
		
		System.out.println("시스템 종료 a:"+a);
		//System.out.println("시스템 종료 c:"+c);
		//System.out.println("시스템 종료 d:"+d);구간내부에서 선언된 변수는 구간 외부영역에서 호출 불가
		
	}

}
