package excep_p;

class ExcepAAA extends Exception{
	
	int i;
	
	String [] arr = {"¿ÀÀÚÀ±","Á¤¿øÅÂ","±èµµ±Õ","À¯ÂùÈñ","ÀÌ½ÂÈ¯"	};
	
	public ExcepAAA(int i) {
		super();
		this.i = i;
		
	}

	public ExcepAAA(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return arr[i];
	}
	
	void ppp() {
		System.out.println(getMessage());
	}
}

public class UserExcepClassMain {

	public static void main(String[] args) {
		try {
			//throw new ExcepAAA("»ç¿ëÀÚ Å¬·¡½º´Ù");
			throw new ExcepAAA(1);
		
		} catch (ExcepAAA e) {
			//System.out.println(e.i);
			//System.out.println(e.getMessage());
			e.ppp();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
