package control_p;

public class BreakGo {

	public static void main(String[] args) {

		int i = 0;
		AAA:while(true) {  //�ݺ����� naming �۾�
			
			i+= 100;
			System.out.println("while 1 ���� "+i);
			
			
			
			BBB:while(true) {
				i++;
				System.out.println("while 2 ����  "+i);
				if(i==105)
					//break;  //���� while Ż��
					break AAA;  //while AAA Ż��
				
				System.out.println("while 2 �� "+i);
			}
			
			//if(i==105)
			//	break;  //ū while Ż��
			
			//System.out.println("while 1 ��  "+i);
		}
		
		System.out.println("�ý��� ����");

	}

}
