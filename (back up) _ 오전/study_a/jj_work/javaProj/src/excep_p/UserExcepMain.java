package excep_p;

public class UserExcepMain {

	public static void main(String[] args) throws Exception{
								//declaration - > 예외처리 발생시 자신을 호출한  
								//caller에게 처리할 것을 요청 
		try {
			
			System.out.println("try 시작");
			
			//Exception ee = new Exception();
			
			//throw ee;
			
			//throw new Exception();
			
			throw new Exception("에러다");
			
			// throw 이후에는 예외처리가 반드시 발생되므로 이후 구문 작성시 에러발생
			//System.out.println("try 끝");
			
		} catch (Exception e) {
			//System.out.println("예외처리 1:"+e.getMessage());
			e.printStackTrace();
			
			try {
				throw e;   //re~throwing
			} catch (Exception e2) {
				System.out.println("예외 잡는 예외:"+e.getMessage());
				throw e2;   //re~throwing
			}
			
		}

	}

}
