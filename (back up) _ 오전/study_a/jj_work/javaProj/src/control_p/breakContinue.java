package control_p;

public class breakContinue {

	public static void main(String[] args) {

		//for (int i = 0; i < 10; i++) {
		for (int i = 0; ; i++) {
			
			System.out.println("break ����:"+i);
			
			if(i==5)
				break;
			
			System.out.println("break ��:"+i);
		}
		
		System.out.println("break ����----------------");
		
		
		for (int i = 0; i < 10; i++) {
				
			System.out.println("continue ����:"+i);
			
			if(i==5)
				continue;
			
			System.out.println("continue ��:"+i);
		}
		
		System.out.println("continue ����--------------");
		
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("if ����:"+i);
			
			if(i!=5)
				System.out.println("if ��:"+i);
		}
		
		System.out.println("if ����--------------");

	}

}
