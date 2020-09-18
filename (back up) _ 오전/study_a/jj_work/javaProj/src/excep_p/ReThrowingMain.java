package excep_p;

class ReThrowing{
	
	void meth_1() throws Exception {
		System.out.println("\tm_1 시작:");
		try {
			meth_2();
		} catch (Exception e) {
			System.out.println("\tm_1 예외처리:"+e.getMessage());
			throw e;
		}
		System.out.println("\tm_1 끝:");
	}
	
	void meth_2() throws Exception {
		System.out.println("\t\tm_2 시작:");
		try {
			meth_3();
		} catch (Exception e) {
			System.out.println("\t\tm_2 예외처리:"+e.getMessage());
			throw e;
		}
		System.out.println("\t\tm_2 끝:");
	}
	
	void meth_3() throws Exception {
		System.out.println("\t\t\tm_3 시작:");
		throw new Exception("m_3 에러발생");
		//System.out.println("\t\t\tm_3 끝:");
	}
	
}


public class ReThrowingMain {

	public static void main(String[] args) throws Exception {
		System.out.println("main 시작");
		ReThrowing rw = new ReThrowing();
		try {
			rw.meth_1();
		} catch (Exception e) {
			System.out.println("main 예외처리:"+e.getMessage());
			throw e;
		}
		System.out.println("main 끝");
	}
	

}
