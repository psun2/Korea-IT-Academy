package excep_p;


class ClaExcep{
	void meth_1()  throws Exception{
		
		try {
			System.out.println("meth_1() 시작");
			meth_2();
			System.out.println("meth_1() 끝");
		} catch (Exception e) {
			System.out.println("m1 처리:"+e.getMessage());
			throw e;
		}
		
	}
	
	void meth_2() throws Exception{
		
		try {
			System.out.println("\t meth_2() 시작");
			meth_3();
			System.out.println("\t meth_2() 끝");
		} catch (Exception e) {
			System.out.println("m2 처리:"+e.getMessage());
			throw e;
		} 
		
	}
	
	
	void meth_3() throws Exception{
		
		try {
			System.out.println("\t\t meth_3() 시작");
			throw new Exception("엄마 나 똥 쌌어");
			//System.out.println("\t\t meth_3() 끝");
		} catch (Exception e) {
			System.out.println("m3 처리:"+e.getMessage());
			throw e;	//re~throwing
		}
		
	}
}


public class ExcepClassMain {

	public static void main(String[] args)  throws Exception{
		try {
			
			//Exception ex = new Exception("남친은 용인");
			
			//throw ex;
			
			//System.out.println("끝");
			
			throw new Exception("북친은 용인");
			
		} catch (Exception e) {
			System.out.println("하지마!!!!:"+e.getMessage());
		}
		
		
		
		
		try {
			ClaExcep ce = new ClaExcep();
			System.out.println("main 시작");
			ce.meth_1();
			System.out.println("main 끝");
		} catch (Exception e) {
			System.out.println("main 처리:"+e.getMessage());
			throw e;	//re~throwing
		}
		
		
		
	}

}
