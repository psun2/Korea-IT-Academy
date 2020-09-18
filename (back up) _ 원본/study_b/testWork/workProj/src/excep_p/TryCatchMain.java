package excep_p;

class AAA{
	int a = 10;
}

public class TryCatchMain {

	public static void main(String[] args) {

		/*
		 * catch(ArithmeticException e) {
		 * 
		 * }
		 */
		
		System.out.println("1. try~catch~finally");
		try {
			System.out.println("시작");
			
			AAA [] arr1 = new AAA[3];
			
//			System.out.println(arr1[1].a);
			
			int [] arr = {11,22,33};
			
//			System.out.println(arr[5]); //최초 예외 발생시점에서 catch 진입
			
			int a = 10/1;  //에러가 발생된 시점에서  throw -> catch
			
			System.out.println("끝"+a);
			
		
		}catch(ArithmeticException e) {
			System.out.println("수학적 예외 처리 "+ e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리 "+ e);
			
			return;
		}catch(Exception e) {
			System.out.println("일반 예외 처리");
			e.printStackTrace();
			
		}finally {
			System.out.println("프로그램 종료");
		}		
		
		
		System.out.println("2. try~catch");
		try {
			int b = 10/0;
		}catch(Exception e) {
			System.out.println("일반 예외 처리");
		}
		
		
		System.out.println("3. try~finally ");
		try {
			//int b = 10/0;
		}finally {
			System.out.println("finally 실행");
		}
		
		
		
//		catch(Exception e) {
//			
//		}
//		finally {
//			System.out.println("finally 실행");
//		}
		
		
		System.out.println("4. 중첩 try~catch");
		int c = 10;
		try {
			
			try {
				int b = 10/0;  //구간별 변수 선언
			} catch (Exception e2) {
				System.out.println("try catch 예외 처리 1");
			}
			
			
			//int c = 20; 에러
			int b = 10/0;
		
		}catch(Exception e) {
			System.out.println("catch 예외 처리2");
			
			
			try {
				int b = 10/0;  //구간별 변수 선언
			} catch (Exception e2) {
				System.out.println("catch catch 예외 처리 3");
			}
		}
		

	}

}
