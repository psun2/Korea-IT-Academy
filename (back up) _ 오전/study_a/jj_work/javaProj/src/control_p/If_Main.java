package control_p;

public class If_Main {

	public static void main(String[] args) {

		if(true)   /// ������  ��/���� ���ο� ���� ����
			System.out.println("��������");  
		     //���� ������ ǥ������ ������ ���� ������ �ݵ�� �����ؾ� �Ѵ�
			 //���� ������ ǥ������ ������ if�� �ڵ��� �ٷ� �ؿ� �� ���๮�� �����
		
		if(false) {  //if�� ����
			System.out.println("���� ��������1");
			System.out.println("���� ��������2");
			System.out.println("���� ��������3");
			System.out.println("���� ��������4");
		} //if�� ��
		
		
		if(false) {  //if�� ����
			//���౸�� ������ ���  error �� �߻����� ����
		} //if�� ��
		
		
		int a = 5678;
		int b = 10;
		//int c = 30; if  �� �ȿ��� �ߺ� �����ϰ� �ɰ�� �浶 �߻�
		
		if(b>5) {
			a = 1234;
			
			int c = 890;
			System.out.println("if ���� c:"+c);
		}
		
		if(true) {
			int d = 4444; //��� ���� �ȿ��� ����� ������ �������ο����� ��� ����
		}
		
		
		System.out.println("�ý��� ���� a:"+a);
		//System.out.println("�ý��� ���� c:"+c);
		//System.out.println("�ý��� ���� d:"+d);�������ο��� ����� ������ ���� �ܺο������� ȣ�� �Ұ�
		
	}

}
