package control_p;

public class If_Main2 {

	public static void main(String[] args) {
		
		int a, b = 10;
		
		if(b > 5) {
			
			a = 10;
			System.out.println("�������տ�");
		}
		else {
			a = 20;
			System.out.println("�����Դϴ�");
		}
		
		
//		else {    if ���� �ܵ����� ���Ұ�
//			System.out.println("�����Դϴ�");
//		}
		
		System.out.println("if ~ else  ���� a:"+a);
		
		int jum = 65;
		
		if(jum >= 80) {
			System.out.println("���");
		}
		
		/////////////////////////////
		
		if(jum >= 60) {
			System.out.println("����");
		}else {
			System.out.println("�̴�");
		}
		
		System.out.println("-------------------------");
		
		if(jum >= 80) {
			System.out.println("���");
		
		}else if(jum >= 60) {
			System.out.println("����");
			
		}else {
			System.out.println("�̴�");
		}
		
		
		System.out.println("-------------------------");
		
		if(jum >= 80) {
			System.out.println("���");
			
		}else if(jum >= 60) {
			System.out.println("����");
			if(jum % 2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
				
		}else if(jum >= 40) {
			System.out.println("����");
			
		}else {
			System.out.println("�ҷ�");
		}
	}

}
