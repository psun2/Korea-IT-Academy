package control_p;

public class If_elseMain {

	public static void main(String[] args) {
//		else {  �ܵ� ��� �Ұ�
//			
//		}
		
		if(false) {
			System.out.println("��������");	
		}else
			System.out.println("�����η�");
		
		
		
		
		int a = 75;
		
		String res;
		if(a >= 80) {
			res = "�հ�";	
		}
		else {
			res = "���հ�";
		}
		
		
		/////////////////////
		
		if(a >= 80) {
			System.out.println("���");	
		}
		
		
		///////////////////
		
		
		if(a >= 60) {
			System.out.println("����");
		}
		else {
			System.out.println("�̴�");
		}
		
		
		System.out.println("------------------");
			
		
		if(a >= 80) {
			System.out.println("���2");	
		}
		
		else if(a >= 60) {
			System.out.println("��ȣ2");
			if(a%2==0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
		}
		else if(a >= 40) {
			System.out.println("�̴�2");
		}
		else {
			System.out.println("�ҷ�");
		}
		
		System.out.println("�ý�������:"+res);
		
		
		int c;
		
		if(true) {
			c = 100; 		//�ܺκ���
			int d = 400;  	//if ���� ���κ��� -- if�� ����� ���� �Ҹ�
			System.out.println("if ����:"+c+","+d);
		}
		
		
		//System.out.println("�ý�������2:"+c+","+d); d ���� �Ұ�
		System.out.println("�ý�������2:"+c);
		

	}

}
