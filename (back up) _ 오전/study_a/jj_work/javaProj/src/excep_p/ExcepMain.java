package excep_p;

import java.io.FileInputStream;

public class ExcepMain {

	public static void main(String[] args) {
		
		try {
			int [] arr = {10,20,30};
			
			System.out.println("try 1");
			
			int a = 10/1; //������ �߻��� �������� catch�� ����
			
			System.out.println("try 2");
			
			System.out.println(a);
			System.out.println(arr[1]);
			
			System.out.println("try 3");
			
			FileInputStream fis = new FileInputStream("fff/bbb.txt");
			
		
			
		}catch (ArithmeticException e) {
			System.out.println("������ �����߻�");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� �����߻�");
			
		}catch (Exception e) {	
			
			try {
				System.out.println("�Ϲ��� �����߻�");
				int b = 10/0;
			} catch (Exception e2) {
				System.out.println("�Ƕ� �����߻�");
			}
			
		}
		
		System.out.println("�ý��� ����");
	}

}
