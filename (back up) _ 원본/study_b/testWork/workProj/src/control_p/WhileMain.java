package control_p;

public class WhileMain {

	public static void main(String[] args) {
		
		int i=0;  			//�ʱⰪ
		while(i<10) {		//����
			
			System.out.println("while ���̴� "+i);
			
			i++;			//����
		}
		
		//1-> 100 ��
		
		int tot=0;
		i=1;  			//�ʱⰪ
		while(i<=100) {		//����
			
			tot+=i;
			
			i++;			//����
		}
		
		System.out.println(tot);
		
		
		int a = 10, b= 30;
		
		System.out.println(a+","+b);
		
//		a = b;
//		b = a;
		
		int buf = a;
		a = b;
		b = buf;
		
		
		System.out.println(a+","+b);

	}

}
