package arr_p;

public class ArrayMain {

	public static void main(String[] args) {

		int a = 10; //����
		
		//�迭���� ���� = �迭���� ���� :: �ʱ�ȭ(�����Ҵ� ����) ;
		int [] arr1 = {10,20,30};

		
		int [] arr2 = new int[5]; //���� :: �����Ҵ�;
		
						//  ���� :: �ʱ�ȭ(�����Ҵ� ���) ;
		int [] arr3 = new int[] {111,222,333,444};
		
						//�����Ҵ� ��� �� �ʱ�ȭ ���ÿ� �� ��� 
						// ���� �Ҵ� ũ�⸦ ���ϸ� ���� �߻�
		//int [] arr4 = new int[4] {111,222,333,444};
		
		int [] arr5;
		
		//arr5 = {100,200,300};  ����� �迭 ������ �ʱ�ȭ�� �������� �Ұ�
		arr5 = new int[]{100,200,300}; //���Խ� �����Ҵ��Ͽ� ����Ȯ���� �ʱ�ȭ ���� 
		
		
		int [] arr6;
		arr6 = new int[3];
		
		int [] arr7;
		arr7= new int[]{100,200,300}; 
		
		System.out.println("arr1:"+arr1);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr5:"+arr5);
		System.out.println("arr7:"+arr7);
		System.out.println("------------------------------");
		arr5[1] = 2222;  //������ �� ����
		
		System.out.println("arr5[0]:"+arr5[0]);  //����ȣ��
		System.out.println("arr5[1]:"+arr5[1]);  //����ȣ��
		System.out.println("arr5[2]:"+arr5[2]);  //����ȣ��
		//System.out.println("arr5[3]:"+arr5[3]);  //����ȣ��
		
		System.out.println("arr7[0]:"+arr7[0]);  
		System.out.println("arr7[1]:"+arr7[1]);  
		System.out.println("arr7[2]:"+arr7[2]);
		System.out.println("������------------------------------");
		arr5 = new int[] {12,34,56,78,90};
		System.out.println("arr5[0]:"+arr5[0]);  //����ȣ��
		System.out.println("arr5[1]:"+arr5[1]);  //����ȣ��
		System.out.println("arr5[2]:"+arr5[2]);  //����ȣ��
		System.out.println("arr5[3]:"+arr5[3]);  //����ȣ��
		System.out.println("arr5[4]:"+arr5[4]);  //����ȣ��
		
		
		int [] arr8 = arr5;
		
		System.out.println("arr8[0]:"+arr8[0]);  //����ȣ��
		System.out.println("arr8[1]:"+arr8[1]);  //����ȣ��
		System.out.println("arr8[2]:"+arr8[2]);  //����ȣ��
		System.out.println("arr8[3]:"+arr8[3]);  //����ȣ��
		System.out.println("arr8[4]:"+arr8[4]);  //����ȣ��
		
		
		System.out.println("������------------------------------");

		arr5[2] = 567890;
		System.out.println("arr5[0]:"+arr5[0]);  //����ȣ��
		System.out.println("arr5[1]:"+arr5[1]);  //����ȣ��
		System.out.println("arr5[2]:"+arr5[2]);  //����ȣ��
		System.out.println("arr5[3]:"+arr5[3]);  //����ȣ��
		System.out.println("arr5[4]:"+arr5[4]);  //����ȣ��
		

		
		System.out.println("arr8[0]:"+arr8[0]);  //����ȣ��
		System.out.println("arr8[1]:"+arr8[1]);  //����ȣ��
		System.out.println("arr8[2]:"+arr8[2]);  //����ȣ��
		System.out.println("arr8[3]:"+arr8[3]);  //����ȣ��
		System.out.println("arr8[4]:"+arr8[4]);  //����ȣ��
	}

}
