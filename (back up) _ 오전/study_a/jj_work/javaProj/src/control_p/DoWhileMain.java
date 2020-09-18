package control_p;

public class DoWhileMain {

	public static void main(String[] args) {
		
		int i = 10;
		while(i<5) {
			
			System.out.println("while :"+i);
			i++;
		}
		
		i = 10;
		do{
			
			System.out.println("do~while :"+i);
			i++;
		}while(i<5) ;

	}

}
