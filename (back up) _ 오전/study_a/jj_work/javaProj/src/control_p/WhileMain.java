package control_p;

public class WhileMain {

	public static void main(String[] args) {
		
		int i = 0; 		//�ʱⰪ
		while(i<10) {   //����
			System.out.println("while "+i);
			i++;		//����
		}
		
		
		//// 0->100 ¦������ ����  while���� �̿��Ͽ� ���ϼ���
		
		i = 0; 		//�ʱⰪ\
		int tot=0;
		while(i<=100) {   //����
			tot += i;
			
			i+=2;		//����
		}
		
		System.out.println(tot);
	}

}
