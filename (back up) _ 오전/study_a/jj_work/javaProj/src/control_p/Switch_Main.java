package control_p;

public class Switch_Main {

	public static void main(String[] args) {

		switch(1234) {
		
			case 15:
				System.out.println("15지롱");
				break;
			case 5:
				System.out.println("5지롱");
				break;
			default:
				System.out.println("기본값");
				break;
			case 10:
				System.out.println("10이지롱");
				break;
			case 7:
				System.out.println("7이지롱");
				break;
			
		}
		
		
		//switch(123.456) {  실수
		//switch(true) {     boolean  은 switch 값으로 사용 불가
		switch(10) {
		
			case 15:
				System.out.println("15다");
				break;
				
			case 'a':
				System.out.println("a다");
				break;
			
//			case "배고파":  switch의 값과 변환 가능한 형태만  case로 사용가능
//				System.out.println("15다");
//				break;
		}
		
		
		switch("양식") {
		
	//		case 15:
	//			System.out.println("15다");
	//			break;
	//			
	//		case 'a':
	//			System.out.println("a다");
	//			break;
			
			case "한식":
				System.out.println("김치찌개");
				break;
		}
		
		
		//부서별 mt 장소를 공지하세요
		// 인사부 - 바다, 영업부 - 산, 부부 - 안방, 두부 - 콩밭

	}

}
