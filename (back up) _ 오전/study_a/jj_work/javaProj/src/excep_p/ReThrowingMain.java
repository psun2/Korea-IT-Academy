package excep_p;

class ReThrowing{
	
	void meth_1() throws Exception {
		System.out.println("\tm_1 ����:");
		try {
			meth_2();
		} catch (Exception e) {
			System.out.println("\tm_1 ����ó��:"+e.getMessage());
			throw e;
		}
		System.out.println("\tm_1 ��:");
	}
	
	void meth_2() throws Exception {
		System.out.println("\t\tm_2 ����:");
		try {
			meth_3();
		} catch (Exception e) {
			System.out.println("\t\tm_2 ����ó��:"+e.getMessage());
			throw e;
		}
		System.out.println("\t\tm_2 ��:");
	}
	
	void meth_3() throws Exception {
		System.out.println("\t\t\tm_3 ����:");
		throw new Exception("m_3 �����߻�");
		//System.out.println("\t\t\tm_3 ��:");
	}
	
}


public class ReThrowingMain {

	public static void main(String[] args) throws Exception {
		System.out.println("main ����");
		ReThrowing rw = new ReThrowing();
		try {
			rw.meth_1();
		} catch (Exception e) {
			System.out.println("main ����ó��:"+e.getMessage());
			throw e;
		}
		System.out.println("main ��");
	}
	

}
