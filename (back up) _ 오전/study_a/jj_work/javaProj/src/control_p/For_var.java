package control_p;

public class For_var {

	public static void main(String[] args) {
		
		//int i=0;
		
		int b = 0;
		for (int i = 0; i <5; i++) {
			int a = 1;		//�ݺ� �ɶ� ���� ���� ����
			a++;
			
			//int b = 10; �ܺκ����� �ߺ��Ǿ� ���� ���� �Ұ�
			b++;
			System.out.println(i+","+a+","+b);
			
			//for�� �ݺ� �ɶ� ����  a �Ҹ�
		}
		System.out.println("for�� ���� 1:"+b);
		//System.out.println("for�� ����:"+a);
		//System.out.println("for�� ����:"+i);
		
		int i =0;
		
		for (; i <5; i++) { //�ܺκ��� i��  �ݺ������� ��� 
			
			System.out.println(i);
			

		}
		System.out.println("for�� ���� 2:"+i);  //for�� ���� �Ŀ��� ���� ����
		
		
		
		i =0;
		
		//for (i; i <5; i++) {  //�ݺ� ���� ������ �� ��� ����
		for (i=3; i <5; i++) { //�ܺκ����� ���� ���� ���� �����Ͽ� ��밡��
			
			System.out.println(i);
			
		}
		System.out.println("for�� ���� 3:"+i);  //for�� ���� �Ŀ��� ���� ����
	}
}
