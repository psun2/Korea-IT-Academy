package excep_p;

class AAA{
	int a = 10;
}

public class TryCatchMain {

	public static void main(String[] args) {

		/*
		 * catch(ArithmeticException e) {
		 * 
		 * }
		 */
		
		System.out.println("1. try~catch~finally");
		try {
			System.out.println("����");
			
			AAA [] arr1 = new AAA[3];
			
//			System.out.println(arr1[1].a);
			
			int [] arr = {11,22,33};
			
//			System.out.println(arr[5]); //���� ���� �߻��������� catch ����
			
			int a = 10/1;  //������ �߻��� ��������  throw -> catch
			
			System.out.println("��"+a);
			
		
		}catch(ArithmeticException e) {
			System.out.println("������ ���� ó�� "+ e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� ó�� "+ e);
			
			return;
		}catch(Exception e) {
			System.out.println("�Ϲ� ���� ó��");
			e.printStackTrace();
			
		}finally {
			System.out.println("���α׷� ����");
		}		
		
		
		System.out.println("2. try~catch");
		try {
			int b = 10/0;
		}catch(Exception e) {
			System.out.println("�Ϲ� ���� ó��");
		}
		
		
		System.out.println("3. try~finally ");
		try {
			//int b = 10/0;
		}finally {
			System.out.println("finally ����");
		}
		
		
		
//		catch(Exception e) {
//			
//		}
//		finally {
//			System.out.println("finally ����");
//		}
		
		
		System.out.println("4. ��ø try~catch");
		int c = 10;
		try {
			
			try {
				int b = 10/0;  //������ ���� ����
			} catch (Exception e2) {
				System.out.println("try catch ���� ó�� 1");
			}
			
			
			//int c = 20; ����
			int b = 10/0;
		
		}catch(Exception e) {
			System.out.println("catch ���� ó��2");
			
			
			try {
				int b = 10/0;  //������ ���� ����
			} catch (Exception e2) {
				System.out.println("catch catch ���� ó�� 3");
			}
		}
		

	}

}
